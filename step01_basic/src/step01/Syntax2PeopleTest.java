/* �н� ����
 * 1. ����, �޼ҵ� ���� �� ȣ�� ���� �ͼ�������
 * 2. ���� - ������ ǥ��
 * 		- ���� ȯ�� �󿡼� ������ ����� ���ؼ��� ���� ����
 * 		- �޸� Ȯ�� 
 * 			���ڿ� ���� ������ �޸� - name
 * 			���� ���� ������ �޸� - age
 *		- java���� ��ü ���� �켱
 *			name, age ��� �̸��� Ÿ���� ���ѵ� ������ 
 *			�޸� Ȯ��
 *
 *		- ��ü ���� ����
 *		People p1 = new People();
 *		1. People Ÿ���� ���� ����
 *			- ������ People Ŭ������ �����ϱ� ����
 *		2. ��ü ���� ����
 *			- �ش� Ŭ������ ������ ��� �� ������ ����� ���� �޸� ����
 *		3. p1�� ���� ������ ������
 *			- ������ People ��ü�� �ּҰ� 
 *		4. p1 ����
 *			- ���� ����(reference ����)
 *			- �ش� ������ ��ü�� ������ ��� ����� access ȣ�� ����
 *		
 
 * 3. �޼ҵ� - ��� ���� 
 * 
 */

package step01;

//ctrl+shift+o �� import ���� �ڵ� ���� 
import model.domain.People;

public class Syntax2PeopleTest {

	public static void main(String[] args) {
		//name�� age ���� Ȱ���� ���� �޸� Ȯ��
		//People ��ü ���� 
		People p1 = new People();
		//�ý��� �޸𸮿� ����� ��ü�� �ּҰ� ���
		System.out.println(p1);//model.domain.People@379619aa
//		p1.name = "����";
	
		p1.setAge(-30);
		p1.setAge(30);
		
		int age = p1.getAge();
		System.out.println(age); //30
		
		
//		p1.age = -30;  private���� accesss �Ұ� 
//		System.out.println(p1.age);
		
		
		System.out.println("----------");
		
		People p2 = new People();
		//�ý��� �޸𸮿� ����� ��ü�� �ּҰ� ���
		System.out.println(p2);//model.domain.People@7de26db8
//		p2.name = "���� �Ŷ�";
//		p2.age =  40;
		
//		System.out.println(p2.name + " " + p1.name);//?���� �Ŷ� ����
		//System.out.println(name); ����
	}

}