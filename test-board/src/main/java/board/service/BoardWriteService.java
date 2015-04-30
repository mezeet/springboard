package board.service;

import board.common.ResultStatus;
import board.common.UpdateInterface;
import board.common.WriteInterface;
import board.dao.BoardDao;
import board.model.Board;

public class BoardWriteService implements WriteInterface{
	
	
	@Override
	public ResultStatus process(String table, Object object) {
	
		common.util.Identify.getLocation(0);
		ResultStatus resultStatus = boardDao.write(table, (Board)object);
		common.util.Identify.getLocation(1);
		
		return resultStatus;
	}
	
	private BoardDao boardDao;
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

}
