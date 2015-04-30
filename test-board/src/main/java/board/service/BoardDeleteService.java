package board.service;

import board.common.DeleteInterface;
import board.common.ResultStatus;
import board.common.UpdateInterface;
import board.common.WriteInterface;
import board.dao.BoardDao;
import board.model.Board;

public class BoardDeleteService implements DeleteInterface{
	
	
	@Override
	public ResultStatus process(String table, int no) {
	
		common.util.Identify.getLocation(0);
		ResultStatus resultStatus = boardDao.delete(no, table);
		common.util.Identify.getLocation(1);
		
		return resultStatus;
	}
	
	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

}
