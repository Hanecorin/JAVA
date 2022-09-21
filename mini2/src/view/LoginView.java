package view;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class LoginView {
	static Logger logger = Logger.getLogger("LoginCheck");
	
	public static void loginCheck(String id, String pw) throws Exception{
		
		if(id.equals("bigdata") && pw.equals("bigdata")) {
			logger.info("로그인 성공 | " + "ID : " + id + ", "  + "PW : " + pw);
			System.out.println("로그인 완료");
		}else {
			
			logger.info("로그인 실패 | " + "ID : " + id + ", "  + "PW : " + pw);
			throw new Exception("ID 또는 PW가 틀렸습니다");
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
					System.out.println("*PW 재확인*");
				}
			} else {
				System.out.println("*ID 확인*");
			}
		}
	}

}