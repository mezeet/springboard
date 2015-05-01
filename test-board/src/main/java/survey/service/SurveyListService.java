package survey.service;

import java.util.List;

import survey.common.ListInterface;
import survey.dao.SurveyDao;

public class SurveyListService implements ListInterface{
	
	private List<Object> surveyList;
	
	public List<Object> process(String table){
		
		common.util.Identify.getLocation(0);
		surveyList = surveyDao.list(table);
		common.util.Identify.getLocation(1);	
		
		return surveyList;
	}

	private SurveyDao surveyDao;
	public void setSurveyDao(SurveyDao surveyDao) {
		this.surveyDao = surveyDao;
	}	
	
}
