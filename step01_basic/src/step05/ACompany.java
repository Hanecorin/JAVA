package step05;

// interface�� �����ϴ� ���� Ŭ����
// �̿ϼ� �޼ҵ� �ݵ�� ������ �ʼ�
public class ACompany implements MainCompany {
	String twogo = "�迭�� ��ǥ�̸� A";
	int history = 10;
	
	// ���迭�� ��ǥ�̸� ��ȯ�ϴ� �޼ҵ�
	
	
	public String getName() {
		return twogo;
	}
	
	public int getHistory() {
		return history;
	}
}