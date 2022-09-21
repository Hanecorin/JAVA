package step04.exception;

import org.apache.log4j.Logger;

import uer.exception.InvalidateException;

public class ExceptionTest3 {
	
	static Logger logger = Logger.getLogger("ExceptionTest3");
	// admin �� �ƴϸ�(����) ���� �߻�(�����ڰ� �ڵ�� �����ؼ� ����) �ϰ� ���� �߻��� log���
	static void loginCheck(String id) throws InvalidateException {
		if( !id.equals("amdin") ) { //admin�� �ƴ� ��� true  (!false) -> true
//			throw new Exception("�� ������? ");
			throw new InvalidateException("�α����� �õ��� ��ȿ�� id : " + id);
		}
		System.out.println("�����ڴ� �ȳ��ϼ���");
	}
	
	public static void main(String[] args) {
		try {
			loginCheck("amdin");
			loginCheck("test");
		} catch (InvalidateException e) {
			e.printStackTrace();
			//���� ��ü�� �����ϰ� �ִ� ���ڿ� ������ ���
//			System.out.println(e.getMessage());
			logger.info(e.getMessage());
		}
		

	}

}