/* �迭 �н�����
 * 
 * 1. ���� - [] 
 * 2. Ư¡
 * 	- �ټ��� �����͸� �ϳ��� �׷�ó�� ����
 *  - ������ �����Ͱ����� index�� ó�� 
 *  - �ѹ� ������ �迭�� ũ��� ���� �Ұ�
 *  - ��� �迭�� ������ ��üŸ��
 *  - length �� �迭�� ũ�Ⱚ�� ������ �Ӽ��� �ڵ� ����
 *  
 * 3. ����
 * 	1. ���� ���� �ʱ�ȭ�� �ѹ��� �� �������� ����
 * 		Ÿ�� [] ���� = {��1, ��2, ��3,...};
 *  2. ����, ������ �ʱ�ȭ�� �и��ؼ� ����
 *  	Ÿ�� [] ���� = new Ÿ��[ũ��];
 *  	����[index] = ��;
 */
package step02;

import org.junit.Test;

import model.domain.People;

public class Syntax6Array {
	
	//int����� ������ �迭 ���� �� Ȱ��
	//�迭 ���� �� ���� -> �� �ʱ�ȭ ������ �۾�
//	@Test
	public void intArray() {
		int [] i = new int[2]; //int�� �ΰ� ���� ������ int�迭 ����    i=[]
		i[0] = 10;  //�ʱ�ȭ
		i[1] = 20;
		System.out.println(i[0]);  //10
		System.out.println(i.length); //2
	}
	
	//���� ���� �ʱ�ȭ�� �� �������� ����
//	@Test
	public void intArray2() {
		//{} ǥ�������� ��ü ���� 
		int[] i = {1, 2, 3}; //3���� int�� ���� ������ �޸� ���� �� ������� �ʱ�ȭ
		System.out.println(i[0]);  //1
		System.out.println(i.length); //3
		
		
		int i2;
//		System.out.println(i2);//i2�� �ʱ�ȭ ���� �ʾƼ� ���� ���� ����� �ʱ�ȭ �ʼ� 
		
		int [] i3 = new int[5]; //���� �����ӿ��� �迭�� ������ heap ������ ���� ���� �ڵ� �ʱ�ȭ
		System.out.println(i3[2]); // 0
		i[3] = 100;//�ʱ�ȭ
	}
	
	
	
	
	//String����� ������ �迭 
//	@Test
	public void stringArray() {
		String [] s = {"a", "b", "c"};  //0~2������ index�� 3���� ������ length ����
		for(String v : s) {
			System.out.println(v);			
		}
	}
	
	//People����� ������ �迭  import model.domain.People
	@Test
	public void peopleArray() {
		People [] p = {new People("����", 30), 
					   new People("�缮", 60),
					   new People("����", 30),
					   new People("����", 50)};
		
		System.out.println(p); //People �迭 ��ü
		System.out.println(p[0]); //People ��ü
		System.out.println(p[0].getName()); //String ��ü
		
		System.out.println("30���� ����(index 2)�� �̸��̶� ���������� �̸��� ���� ���");
		
		//? ��Ʈ - ���ڿ� ���밪 ���� �� �޼ҵ� public boolen equals(String v){}
		String name = p[2].getName(); //����
		
		//for(People v : p) {
		for(int i=0; i < p.length ; i++) { //index���� �ʿ��� ��� ����
			
			if( i != 2 && name.equals(p[i].getName())) {  //�̸� ��
				System.out.println(p[i].getName() + " " + p[i].getAge());
			}
			
		}
		
		//? 30 �� ģ���鸸 ����� ����
		System.out.println("*** 30�� ***");
		for(People v : p) {
			if(v.getAge() == 30) {
				System.out.println(v.getName() + " " + v.getAge());
			}
		}
		
		//�ּҰ� ��
		System.out.println(p[0] == p[1]); //false ��ü���� �ּҰ� ��
		System.out.println(p[0].getAge() == p[1].getAge()); //false int�� ��
		
		//�̸� ��
		System.out.println(p[0].getName().equals(p[1].getName())); //false �̸����� ��		
		
	}
		
}