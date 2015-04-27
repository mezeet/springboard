package board.service;

import java.util.List;

import board.common.ListInterface;
import board.dao.BoardDao;
import board.model.Board;

public class BoardListService implements ListInterface{
	
	private List<Object> boardList;
	
	public List<Object> process(String table){
		
		common.util.Identify.getLocation(0);
		boardList = boardDao.list(table);
		common.util.Identify.getLocation(1);	
		
		return boardList;
	}

	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}	
	
}
