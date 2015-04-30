package board.service;

import board.common.ResultStatus;
import board.common.UpdateInterface;
import board.dao.BoardDao;
import board.model.Board;

public class BoardUpdateService implements UpdateInterface{
	
	@Override
	public ResultStatus process(String table, int no, Object object) {
		
		common.util.Identify.getLocation(0);
		ResultStatus resultStatus = boardDao.update(no,table, (Board)object);
		common.util.Identify.getLocation(1);
		
		return resultStatus;
	}
	
	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
}
