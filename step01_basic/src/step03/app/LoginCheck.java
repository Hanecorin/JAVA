/* �� ����
 * 1. �� �����̶� ����
 * 2. id/pw - pdman/11�� ��ȿ�ϴ� ����
 * 3. ���θ� or ���� or �ſ����� ���� ȸ��� �� ������ �߿��� ȸ�� ������
 * 4. ��� ����
 * 	1. ��ȿ�� ����
 *  2. � �����̵� �α��� �õ��ڵ��� �ܼ� ��Ÿ�� �α��� ����
 *     �ƴϸ� �ǵ������� ���������� �α��� �õ��Ϸ��� �ϴ�����..
 *     id��? pw? ��� ����
 *     �����ϴ� system ip�� ���
 *     ... 
 * 5. �α��� ���� �ؼ� ��ȿ�� ��� "�ȳ��ϼ���"
 *    ��ȿ�� ��� �αױ�� �� "�ٽ� �� �õ� �ϼ���"     
 * 	  ?������ �޼ҵ�� ���� �Ͻð�, main�޼ҵ忡�� ȣ���ؼ� ���� ���� �ϼ���     
 *    
 */
package step03.app;

import org.apache.log4j.Logger;

public class LoginCheck {
	static Logger logger = Logger.getLogger("LoginCheck");
	
	public static void loginCheck(String id, int pw) {
		
		if(id.equals("pdman") && pw == 11) {
			System.out.println("�ȳ��ϼ���");
		}else {
			logger.info("login �� ��ȿ�� id " + id);
			
			System.out.println("�ٽ� �� �õ� �ϼ���");
		}
	}
	
	public static void main(String[] args) {
		loginCheck("pdman" , 11);
		loginCheck("pd33" , 11);
		loginCheck("ptest" , 11);
	}

}