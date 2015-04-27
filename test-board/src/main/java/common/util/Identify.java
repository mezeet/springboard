package common.util;

/**
 * 현재 실행 위치를 알아내는 데 관련된 메소드를 모아놓았다.
 * @author crown204
 *
 */

public class Identify{

	/**
	 * 현재 쓰레드 호출 스택에서 클래스명과 메서드를 가져와서 출력한다.
	 * @param no 시작과 끝 출력 구분. 0=시작, 1=끝
	 * @return ""+curClass+curMethod+position 예제, "현재클래스.현재메소드-시작"
	 * @see http://tutorials.jenkov.com/java-exception-handling/basic-try-catch-finally.html
	 */
	public static void getLocation(int no){
	
	String curClass = Identify.getClassName(3);
	String curMethod = Identify.getMethodName(3);
	String position = null;
	
	try{
		if(no==0) position="-시작";
		else if(no==1)position="-끝";
		else throw new OutOfRange(no);
	} catch(OutOfRange e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println(""+curClass+"."+curMethod+position);
	
	}
	
	/**
	 * 현재 쓰레드 호출 스택에서 메서드 이름을 가져온다.
	 * @param depth 호출 스택에서 단계 (0 java.lang.Thread, 1 첫번째 호출 2 ... n 현재 클래스 호출 스택 번호)
	 * @return method 이름
	 * @see http://stackoverflow.com/questions/442747/getting-the-name-of-the-current-executing-method
	 */
	public static String getMethodName(final int depth)
	{
	  final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
	  return ste[depth].getMethodName(); //Thank you Tom Tresansky
	}
	
	/**
	 * 현재 쓰레드 호출 스택에서 클래스 이름을 가져온다.
	 * Utility function
	 * @param depth 호출 스택에서 단계 (0 java.lang.Thread, 1 현재 클래스 ,  2 .. n 현재 클래스 호출 스택 번호)
	 * @return method 이름
	 * @see http://stackoverflow.com/questions/6271417/java-get-the-current-class-name
	 */
	
	public static String getClassName(final int depth){
	final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
	
	return ste[depth].getClassName();
	}
}
