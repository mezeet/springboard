package board.dao;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import board.model.Board;

public class BoardDao {
	
	private JdbcTemplate jdbcTemplate;
	private Board board;
	private List<Object> boardList;
	
	public BoardDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Board view(int no, String table){
		 
		common.util.Identify.getLocation(0);
		board = new Board(no,"제목","내용","작성자","작성일",1);
		common.util.Identify.getLocation(1);
		return board;
	}

	public List<Object> list(String table) {
		
		common.util.Identify.getLocation(0);
		
		Random r = new Random();
		boardList= new ArrayList<Object>();
		
		System.out.println("dddd");
		for(int i=0; i<8; i++){

			board = new Board(i,"제목"+i,"내용"+i,"작성자"+i,"작성일"+i,r.nextInt());
			boardList.add(board);
		}
		
		common.util.Identify.getLocation(1);
		return boardList;
	}

}
