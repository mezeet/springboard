package board.dao;

import board.model.Board;

public class SpecParam {

	String table;
	int no;
	Board board;
	
	public SpecParam(String table, int no){
		this.table = table;
		this.no = no;
	}
	
	public SpecParam(String table, Board board){
		this.table = table;
		this.board = board;
	}

	public SpecParam(String table, int no, Board board){
		this.table = table;
		this.no = no;
		this.board = board;
	}
}
