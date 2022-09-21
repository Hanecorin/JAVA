package step05;

public class CompayTest {

	public static void main(String[] args) {
		// 모든 계열사들의 대표 이름 출력
		MainCompany[] all = new MainCompany[2];
		all[0] = new ACompany();
		all[1] = new BCompany();
		
		for(MainCompany c : all) {
			System.out.println(c.getName());
		}
	}

}
