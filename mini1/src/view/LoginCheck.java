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
package view;

import org.apache.log4j.Logger;

public class LoginCheck {
	static Logger logger = Logger.getLogger("LoginCheck");
	
	public static void loginCheck(String id, int pw) throws Exception{
		
		if(id.equals("Admin") && pw == 20220809) {
			logger.info("�α��� ���� | " + "ID : " + id + ", "  + "PW : " + pw);
			System.out.println("�α��� �Ϸ�");
		}else {
			
			logger.info("�α��� ���� | " + "ID : " + id + ", "  + "PW : " + pw);
			throw new Exception("ID �Ǵ� PW�� Ʋ�Ƚ��ϴ�");
		}

	}

}