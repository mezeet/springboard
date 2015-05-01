package survey.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import survey.common.ResultStatus;
import survey.model.Survey;

public class SurveyDao {
	
	private JdbcTemplate jdbcTemplate;
	private Survey survey;
	private List<Object> surveyList;
	ResultStatus resultStatus;
	
	public SurveyDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public Survey view(int no, String table){
		 
		Random r = new Random();
		common.util.Identify.getLocation(0);
		survey = new Survey(no,no+"번 제목",no+"번 내용",no+"번 작성자",no+"번 작성일",r.nextInt(30));
		common.util.Identify.getLocation(1);
		return survey;
	}

	public List<Object> list(String table) {
		
		common.util.Identify.getLocation(0);
		
		Random r = new Random();
		surveyList= new ArrayList<Object>();
		
		System.out.println("dddd");
		for(int i=0; i<8; i++){

			survey = new Survey(i,"제목"+i,"내용"+i,"작성자"+i,"작성일"+i,r.nextInt(30));
			surveyList.add(survey);
		}
		
		common.util.Identify.getLocation(1);
		return surveyList;
	}
	
	public ResultStatus update(int no, String table, Survey survey){
		
		common.util.Identify.getLocation(0);
		resultStatus = new ResultStatus();
		resultStatus.setStatus(-1);
		
		System.out.println("업데이트 완료");
		
		resultStatus.setStatus(1);
		resultStatus.setNextNo(no);
		common.util.Identify.getLocation(1);
		return resultStatus;
	}
	
	public ResultStatus write(String table, Survey survey){
		
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
