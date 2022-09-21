/* �н� ����
 * * �߿�
 * - �����ϰ� java.lang package�� import �� �ϰ� ���
 * 
 * 
 * - static �޼ҵ� & API
 *
 * 
 */
package step02;

public class Syntax4Static {
	//String
	static void m1() {
		String data = "playdata";
		//? data ������ �����ϴ� ��ü�� ���̰� ���
		/* data ������ ���� :  String ��ü ���� �߿�
		 * �ϴ� ��ü�� ���̰� : ���� �� int
		 *  ��� : println()
		 *  
		 *  String ��ü�� ���� ī������ int��ȯ �޼ҵ�?>
		 *  public int length(){
		 *  	return ���̰�;
		 *  }
		 */
		int length = data.length();
		System.out.println(length);
				
		//? p�� �̾Ƽ� ��� 
		/* ���ڿ����� p -> String ���ڿ����� char ���ڸ� ��ȯ
		 * ���� �ϳ� �����ϴ� ����?
		 * public char charAt(int index){} 
		 * 
		 * 
		 * *** ����ϱ�
		 * 	- static ������� ���ռ�?
		 * public static char charAt(int index){
		 * 	���ڿ����� �ش� index�� ��ġ�� char�� �����ؼ� ��ȯ
		 * } 
		 * 
		 * char c = String.charAt(0);
		 *  static ���� ������
		 *  ��? ���� ���ڿ��� 0 ��°�� ������°ų�~~>!!!! ��������
		 */
		char c = data.charAt(0);
		System.out.println(c);
		
		//String ���� int ����
		//"3" -> 3 | "three" -> 3 | "��" or "����" -> 3 ....
		//"" ���� �Ŀ� int�� ��ȯ������ �޼ҵ� ����
		//�ǽð� � �����Ͱ� ���Ե��� �𸥴� ��Ȳ�� �ټ�
		/* java.lang.Integer
		 * 		public int parseInt(String value){
		 * 			Paremeter�� ���Ե� ���� int�� ��ȯ�ؼ� ��ȯ
		 * 		}
		 * 
		 * java.lang.Float
		 * 		public float parseInt(String value){
		 * 			Paremeter�� ���Ե� ���� float�� ��ȯ�ؼ� ��ȯ
		 * 		}
		 * 
		 */
		
	}
	
	//API�� Ȱ���� �̼� Ǯ��
	//java.lang.Math�� �޼ҵ�
	static void m2() {
		//? 2, 3 �ΰ��� ���ڰ� ���ؼ� �ִ밪 ���
		System.out.println(Math.max(2, 3));
		
		//? 0.0 <= ������ < 1.0 ������ �Ǽ�(double)�� ���
		System.out.println(Math.random());
	}
	
	//java.lang.Intger 
	//? "" ���� �� int�� ��ȯ ������ ���ڿ��� ���ؼ��� int�� ����
	// int�� ����Ұ����� "��" ������ ���� �ָ� ��� �߻��Ǿ�� �ұ��?
	//���� ���� �ֽ��ϴٶ�� ����� �� ó�� 
	static void m3() {
		int v = Integer.parseInt("��");
		System.out.println(v);
	}
	
	public static void main(String[] args) {
//		Syntax4Static.m1();
//		m2();
		m3();
	}

}
