/* �н� ����
 * ���� 
 * 1. ���� ��ġ�� ���� ����
 * 	1. ��� ����
 * 		- class {} ��ȣ ���ο� ����Ǵ� ����
 * 		- ��ü ������ ��ü�� �����ϴ� �����͵�
 * 		- ��ü ������ ����, ��ü�� �Ҹ�� ����
 * 
 *  2. ���� ����
 *  	- �޼ҵ��� () �Ǵ� {} ���ο� ����
 *  	- �޼ҵ� ȣ��ÿ��� �����Ǿ��ٰ� �޼ҵ� ����� �ڵ� �Ҹ�
 *  	- �Ͻ����� ��� ����
 *  	- temporary, local, automatic, stack
 *  	- �޼ҵ� ȣ��� ����, �޼ҵ� ����� �ڵ� �Ҹ�
 *  	- ����� �޼ҵ� �������� ��� ������ ����
 *  	- ����Ǵ� ���� stack
 *  
 * 2. Ÿ�Կ� ���� ���� ����
 * 	1. �⺻ Ÿ��
 * 		- 8���� ����� built in type
 * 		- int
 *  2. ���� Ÿ��
 *  	- class�� ������� �� Ÿ��
 *  	- String, People ...
 * 
 */

package model.domain;

public class Car {
	
	private String carName; //���	
	private int carNumber;  //���
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {  //carName ���� ����
		this.carName = carName;  //��� ������ ���� ������ ����
	}
		
	
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {  //carNumber ���� ����
		this.carNumber = carNumber;   //��� ������ ���� ������ ����
	}
	
	public void print() {
		String msg = "Car";  // ���� ���� 
		System.out.println(msg);
	}
	
	
}