package step05;

public class CompayTest {

	public static void main(String[] args) {
		// ��� �迭����� ��ǥ �̸� ���
		MainCompany[] all = new MainCompany[2];
		all[0] = new ACompany();
		all[1] = new BCompany();
		
		for(MainCompany c : all) {
			System.out.println(c.getName());
		}
	}

}
