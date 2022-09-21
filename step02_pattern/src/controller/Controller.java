/* ������ ȭ��ܿ��� 
 * 1 �� ��û�� - �� �Ѹ� �˻��̶� ����
 * 2 �� ��û�� - �� ����(���) ����
 * 
 �Լ� ȣ��� ���ÿ� ������ �ִ� ���� argument,
 �Լ� ���� �� �Է°����� ������ ������ parameter
 * 
 */

package controller;

import model.Model;
import model.domain.Customer;  //ctrl shift o �� �ڵ� �ϼ�
import view.FailView;
import view.SuccessView;

public class Controller {
	
	private static Model m = new Model();   // Controller ��ü �������̵� ��� ������ ����
	
	public static void reqRes(int reqNo){
		
		if(reqNo == 1) {  
			/* SuccessView.print(m.select("id01"));
			 * 
			 * SuccessView�� print() ȣ�� ����
			 * �� parameter(argument, �Ű�����, ����, �μ�...) ���� �ϼ�
			 * ���� m.select("id01") ���� ����
			 * id01�̶�� �Ϻ��� ������ ��ü�� ���� �� selelct �޼ҵ� parameter�� ����
			 */
			SuccessView.print( m.select("id01")  )  ;// "id01", 20, "vvip", 'F'
			
		}else if(reqNo == 2){ 
			boolean result = m.update("id01", "vip");
			
			if(result == true) {
				SuccessView.printMsg("�� �������� ����");
			}else {
				SuccessView.printMsg("�� ���� ���� ����");
			}
			
		}else {
			FailView.print("�� ������???");
		}
		//..
	}
	
}