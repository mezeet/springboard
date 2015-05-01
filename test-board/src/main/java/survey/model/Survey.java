package survey.model;
/**
 * Dto, Vo board 자료를 전달해주는 객체 
 * @author crown204
 */
public class Survey {
	private int no,target;
	private String title,content,writer,wdate;
	
	/**
	 * Dao 로 조회한 결과값을 해당 객체에 설정하는 생성자
	 * @param no 글번호
	 * @param title 글제목
	 * @param content 글내용
	 * @param writer 글작성자
	 * @param wdate 글작성일
	 * @param target 글조회수
	 */
	public Survey(
			int no, 
			String title, String content, String writer, String wdate,
			int target){
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.wdate = wdate;
		this.target = target;
	}

	/**
	 * 형변환 용 생성자
	 */
	public Survey() {
	
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

}
