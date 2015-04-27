package board.service;

import board.common.ViewInterface;
import board.dao.BoardDao;
import board.model.Board;

public class BoardViewService implements ViewInterface{
	
	public Board process(int no, String table){
		
		common.util.Identify.getLocation(0);
		Board board = boardDao.view(no,table);
		common.util.Identify.getLocation(1);	
		
		return board;
	}

	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	
}
