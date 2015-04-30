package board.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import board.common.ResultStatus;
import board.model.Board;

public class BoardDao {
	
	private JdbcTemplate jdbcTemplate;
	private Board board;
	private List<Object> boardList;
	ResultStatus resultStatus;
	
	public BoardDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Board view(int no, String table){
		 
		Random r = new Random();
		common.util.Identify.getLocation(0);
		board = new Board(no,no+"번 제목",no+"번 내용",no+"번 작성자",no+"번 작성일",r.nextInt(30));
		common.util.Identify.getLocation(1);
		return board;
	}

	public List<Object> list(String table) {
		
		common.util.Identify.getLocation(0);
		
		Random r = new Random();
		boardList= new ArrayList<Object>();
		
		System.out.println("dddd");
		for(int i=0; i<8; i++){

			board = new Board(i,"제목"+i,"내용"+i,"작성자"+i,"작성일"+i,r.nextInt(30));
			boardList.add(board);
		}
		
		common.util.Identify.getLocation(1);
		return boardList;
	}
	
	public ResultStatus update(int no, String table, Board board){
		
		common.util.Identify.getLocation(0);
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		
		System.out.println("업데이트 완료");
		
		resultStatus.setStatus(1);
		resultStatus.setNextNo(no);
		common.util.Identify.getLocation(1);
		return resultStatus;
	}
	
	public ResultStatus write(String table, Board board){
		
		common.util.Identify.getLocation(0);
		
		Random r = new Random();
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		
		System.out.println("글 작성 완료");
		System.out.println("새롭게 생성된 글 번호 조회");
		
		resultStatus.setNextNo(r.nextInt(30));
		resultStatus.setStatus(1);
		common.util.Identify.getLocation(1);
		return resultStatus;
	}

	public ResultStatus delete(int no, String table){
		
		common.util.Identify.getLocation(0);
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		
		System.out.println("삭제 완료");
		
		resultStatus.setStatus(1);
		common.util.Identify.getLocation(1);
		return resultStatus;
	}
	
}
