package step02;

import model.domain.Subject;

public class OOPTest2 {

	static Object m1() {  //Object º¯¼ö = new Subject("Ã¼À°", "¿¬¾Æ");
		return new Subject("Ã¼À°", "¿¬¾Æ");
	}
	
	public static void main(String[] args) {
		
		Object s1 = m1();		
		System.out.println(  ( (Subject)s1 ).getTeacherName()  );
		
		Subject s2 = (Subject)m1();
		System.out.println(s2.getTeacherName());
		
	}

}