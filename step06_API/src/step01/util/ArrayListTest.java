/* List �н�
 * 
 * 1. ��ü�鸸 ���� ����
 * 2. ���� �޸� ����
 * 3. ����
 * 	������ ����
 * 		public boolean add(Object o){
 * 			ArrayList ��ü�� ������ ����
 * 		}
 * 	������ ��ȯ
 * 		public Object get(int index){
 * 			index������ �ش� index�� ����� ��ü ��ȯ
 * 		}
 *  ������ ����
 *  
 *  */


package step01.util;

import java.util.ArrayList;


public class ArrayListTest {
	
	
	public static void main(String[] args) {
		//String Ÿ�Ը� ���� ������ ArrayList�� ����
		//���׸� ����
		ArrayList<String> a1 = new ArrayList<>(); // [], list(),
		
		a1.add("string");  //0��° ����
		a1.add("a"); //1��° ����
		a1.add("b"); //2��° ����
		a1.add("c"); //3��° ����
		a1.add("d"); //4��° ����
		
		System.out.println(a1.size()); //������ ����  5
		System.out.println(a1.get(2)); // b
		a1.remove(2);
		System.out.println(a1.size()); //������ ����  4 
		System.out.println(a1.get(2)); // c    
	}
		
	public static void main2(String[] args) {
		//��� ��ü Ÿ�� ���尡���� ArrayList
		ArrayList a1 = new ArrayList(); // [], list(),
		
		a1.add("string");  //0��° ����
//		a1.add(new Integer(3));
		a1.add(3); // a1.add(new Integer(3)); �ڵ�� �ڵ� ��ȯ
		a1.add("string"); //2��° ����
		a1.add(new A());
		
		//[string, 3, string, step01.util.A@cac736f]
		/* ArrayList�� toString �޼ҵ� �����δ�
		 * �Ƹ���
		 * ������ ��� ��ü�� toString()�� ȣ���� ������� �ϳ��� ���ڿ��� �����ؼ� ��ȯ
		 */
		System.out.println(a1);//a1.toString()
		
	}

}