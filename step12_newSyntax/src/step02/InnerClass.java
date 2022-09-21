package step02;

interface Playdata {
	// �ݵ�� ���� �� ��ȯ
	public abstract int getAge();
	
}

public class InnerClass {
	public static void main(String[] args) {
		// Playdata p1 = new Playdata(); ���� ����

		/* 
		 * inner class�� ������ ��ü ������ ȥ��� ����
		 * Playdata interface�� �̸��� ���� Ŭ���� ����
		 * �޼ҵ� ������ 
		 * ��ü ����
		 * 
		 * 
		 * class InnerClass$1 implements Playdata{
		 * 		public int getAge() {//������ �ʼ� 
		 *			return 20;
		 *		}
		 * }
		 * Playdata p1 = new InnerClass$1();
		 * 
		 * ������ �ڵ�
		 */
		Playdata p1 = new Playdata() {
			public int getAge() {//������ �ʼ� 
				return 20;
			}
		};
		System.out.println(p1);// step02.InnerClass$1@cac736f

		Playdata p2 = new Playdata() {
			public int getAge() {
				return 30;
			}
		};
		System.out.println(p2);
	}
}

