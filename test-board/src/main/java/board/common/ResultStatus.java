package board.common;
/**
 *   쓰기, 삭제, 업데이트 결과 상태값과 보여줄 글 번호를 전송하는 역할을 한다.
 * @author crown204
 *
 */
public class ResultStatus {
	
	private int status;
	private int nextNo;
	
	/**
	 *  DB 처리 상태 가져오기. -1 은 실패, 1은 성공
	 * @return
	 */
	public int getStatus() {
		return status;
	}
	
	/**
	 * DB 처리 상태 설정. -1 은 실패, 1은 성공
	 * @param status
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	/**
	 * DB 처리 완료 후 보여줄 글 게시글 가져오기
	 * @return
	 */
	public int getNextNo() {
		return nextNo;
	}
	
	/**
	 * DB 처리 완료 후 보여줄 게시글 번호를 설정
	 * @param nextNo
	 */
	public void setNextNo(int nextNo) {
		this.nextNo = nextNo;
	}
	
	
	
	

}
