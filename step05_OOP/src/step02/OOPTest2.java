package step02;

import model.domain.Subject;

public class OOPTest2 {

	static Object m1() {  //Object ���� = new Subject("ü��", "����");
		return new Subject("ü��", "����");
	}
	
	public static void main(String[] args) {
		
		Object s1 = m1();		
		System.out.println(  ( (Subject)s1 ).getTeacherName()  );
		
		Subject s2 = (Subject)m1();
		System.out.println(s2.getTeacherName());
		
	}

}