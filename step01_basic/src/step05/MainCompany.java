package step05;

public interface MainCompany {
	
	// �׷� �̸�
	public static final String COMPANY_NAME = "playdata"; // �׷��
	
	// �� �迭�� ��ǥ�̸� ��ȯ�ϴ� �޼ҵ�
	public abstract String getName();
	
	// �� �迭�� ���� ��ȯ �޼ҵ�
	int getHistory(); // ������ �� public abstract int getHistory()
	
}
