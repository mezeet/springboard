package board.dao;


import java.util.List;




import org.mybatis.spring.SqlSessionTemplate;


import board.common.ResultStatus;
import board.model.Board;

public class BoardDao {
		
	private SqlSessionTemplate sqlSessionTemplate;
	private SpecParam specParam;
	private Board board;
	private List<Object> boardList;
	ResultStatus resultStatus;
	
	/**
	 * sql세션 템플릿을 주입받을 수 있는 세터 메소드
	 * @param sqlSessionTemplate 게시판 테이블에 대한 mybatis 매핑 쿼리를 가진 sql 세션 템플릿
	 */
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	/**
	 * sql세션 템플릿 중 특정 게시글 번호를 가진 글 하나를 조회한다.
	 * @param no 조회할 게시글의 번호
	 * @param table 조회할 게시판 테이블명
	 * @return
	 */
	public Board view(int no, String table){
		 
		common.util.Identify.getLocation(0);
		specParam = new SpecParam(table, no);
		board = sqlSessionTemplate.selectOne("Board.view", specParam);
		common.util.Identify.getLocation(1);
		return board;
	}

	public List<Object> list(String table) {
		
		common.util.Identify.getLocation(0);
		boardList = sqlSessionTemplate.selectList("Board.list", table);
		common.util.Identify.getLocation(1);
		return boardList;
	}
	
	public ResultStatus update(int no, String table, Board board){
		
		common.util.Identify.getLocation(0);
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		specParam = new SpecParam(table, no, board);
	
		sqlSessionTemplate.update("Board.update", specParam);
		
		resultStatus.setStatus(1);
		resultStatus.setNextNo(no);
		common.util.Identify.getLocation(1);
		return resultStatus;
	}
	
	public ResultStatus write(String table, Board board){
		
		common.util.Identify.getLocation(0);
	
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		
		specParam = new SpecParam(table, board);
		
		sqlSessionTemplate.insert("Board.write", specParam);
		resultStatus.setNextNo(board.getNo());
		
		common.util.Identify.getLocation(1);
		return resultStatus;
	}

	public ResultStatus delete(String table, int no){
		
		common.util.Identify.getLocation(0);
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		
		specParam = new SpecParam(table, no);
		sqlSessionTemplate.delete("Board.delete", specParam);
		
		resultStatus.setStatus(1);
		common.util.Identify.getLocation(1);
		return resultStatus;
	}
	
}
