package step04.exception;

public class ExceptionTest2 {
	
	//���� �߻��� throws�� ���� ó�� ����
	static void m1() throws ClassNotFoundException {
		Class.forName("step04.exception.A");
	}
	
	public static void main(String[] args) {
		try {
			m1();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();//������ ����� �޼ҵ�
			//System.out.println("file�����ϴ�");
		}
	}

}