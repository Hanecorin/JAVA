package view;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class LoginView {
	static Logger logger = Logger.getLogger("LoginCheck");
	
	public static void loginCheck(String id, String pw) throws Exception{
		
		if(id.equals("bigdata") && pw.equals("bigdata")) {
			logger.info("�α��� ���� | " + "ID : " + id + ", "  + "PW : " + pw);
			System.out.println("�α��� �Ϸ�");
		}else {
			
			logger.info("�α��� ���� | " + "ID : " + id + ", "  + "PW : " + pw);
			throw new Exception("ID �Ǵ� PW�� Ʋ�Ƚ��ϴ�");
		}

	} 
	
	public static void loginStartView() throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while (run) {
			System.out.println("--- Login ---");
			System.out.println("ID : ");
			String l1 = null;
			l1 = scanner.next();
			if (l1.equals("bigdata")) {
				System.out.println("PW : ");
				String l2 = null;
				l2 = scanner.next();
				if (l2.equals("bigdata")) {
					loginCheck(l1, l2);
					run = false;
					break;
				} else {
					System.out.println("*PW ��Ȯ��*");
				}
			} else {
				System.out.println("*ID Ȯ��*");
			}
		}
	}

}