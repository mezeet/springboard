package common.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import board.model.Board;

/**
 * list<object> 의 제너릭 (형 or 타입)을 바꾼다.
 * @author crown204
 *
 */
public class GenericConverter {
	
	/**
	 * Board형으로 제너릭을 변환한다.
	 * @param objList 변환할 List<Object> 객체
	 * @return boardList 변환된 List<Board> 객체
	 */
	public static List<Board> convBoard(List<Object> objList){
		
		List<Board> boardList = new ArrayList<Board>();
		
		Iterator<Object> it = objList.iterator();
		
		while(it.hasNext()){
			 boardList.add((Board)it.next());
		}
		
		return boardList;
	}

}
