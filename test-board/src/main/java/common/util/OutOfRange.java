package common.util;

public class OutOfRange extends Exception{

	private int no;
  public OutOfRange(int no) {  
	  this.no = no;
  	}

  @Override
  public String getMessage() {
     return "잘못된 번호 :"+no+". 0=시작, 1=끝";
   }
		
}
