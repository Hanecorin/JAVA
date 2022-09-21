package step01;


import java.util.Optional;

import org.junit.Test;

public class StreamAPI3Optional {

//	@Test
	public void step01() {
		String v = null;
		System.out.println(v.length()); // ���� ���� �߻�
	}
	
//	@Test
	public void step02() {
		String v = "encore";
		System.out.println(v.length()); // 6
	}

//	@Test
	public void step03() {
//		String v = null;
		String v = "playdata";		
		Optional<String> opt = Optional.ofNullable(v); // null �Ǵ� String�� parameter
		System.out.println(opt); // Optional.empty
		
		// ������ ���� Ȯ��
		System.out.println(opt.isPresent()); // false
		opt.ifPresent(i -> {
			System.out.println(1);
			System.out.println(i.length());
			System.out.println(2);
			});
	}
	
//	@Test
	public void step04() {
//		String v = null;
		String v = "encore";
		Optional<String> opt = Optional.ofNullable(v);
		System.out.println(opt.isPresent()); // false | true
		System.out.println(opt.orElse("null�� ��츸 ��ȯ")); // null ��츸 ��ȯ | encore
	}
	
	
	@Test
	public void step05() {
		/*
		 * ������ ���� �߻� ���ɼ� ���� �� try~catch �ʼ�
		 * ������ ���� �߻� ���ɼ� ���� �� try~catch �ɼ�(���� ����)
		 */
		
//		String v = null;
		String v = "encore";
		Optional<String> opt = Optional.ofNullable(v);
		System.out.println(opt.isPresent()); 
		System.out.println(opt.orElseThrow(IllegalArgumentException::new)); 
		System.out.println(opt.orElseThrow(RuntimeException::new)); 
//		System.out.println(opt.orElseThrow(Exception::new)); // ���� ����(�� Exception�� try~catch�� �ʼ�)
	}
	
	
}