// Stream API
/*
 * ���ٽ�
 * 	- ����� ���ÿ� ��ó�� Ȱ��
 * 	- ���� �ް� ��ȯ�ϴ� ������ ������ �ڵ�� ���� 
 */

package step01;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {

	public static void main(String[] args) {
		System.out.println("--- step01 ---");
		/*
		 * List interface �� ��ü ���� �Ұ�, �̿ϼ� �޼ҵ�� ����� �μ�
		 * �� ���� Ŭ�������� ���(implements) �ް� ��� �޼ҵ� ������
		 */

		List<String> datas = Arrays.asList("a", "b", "c", "d");
		
		//step01 �ݺ��� 1.0����
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
		// step02 �ݺ��� 1.5����
//		for(String s : datas) {
//			System.out.println(s);
//		}
		
		// step03 �ݺ��� 1.8����
		/* 
		 * datas ������ �����ϴ� list�� ������ ����ŭ �ݺ��ؼ�
		 * s��� ������ ���� �� ��� 
		 */
		datas.forEach(s -> System.out.println(s));
		System.out.println("-----");
		
		// ���� ���� ���� �����͸� �޾Ƽ� �ٷ� ���
		//System.out : out ���� Ÿ�� PrintStream���� println ȣ��
		/*
		 *  - System.out::println
		 * 		PrintStream�� println �޼ҵ� ȣ��
		 * - Employee::getDepartment
		 * 		Employee�� getDeparement �޼ҵ� ȣ��  
		 * 		employeeList.stream().map(Employee::getDepartment)
		 * 
		 * �� �ΰ��� ������ ������ : �ٸ� �޼ҵ��� parameter�� �ڵ� 
		 */
		datas.forEach(System.out::println);
		
	}

}
