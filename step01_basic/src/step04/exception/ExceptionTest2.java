package step04.exception;

public class ExceptionTest2 {
	
	//예외 발생시 throws로 예외 처리 위임
	static void m1() throws ClassNotFoundException {
		Class.forName("step04.exception.A");
	}
	
	public static void main(String[] args) {
		try {
			m1();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();//개발자 도우미 메소드
			//System.out.println("file없습니다");
		}
	}

}