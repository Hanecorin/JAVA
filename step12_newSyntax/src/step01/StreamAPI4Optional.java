package step01;


import java.util.Optional;

import org.junit.Test;

public class StreamAPI4Optional {

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
		String v = null;
//		String v = "playdata";
		
		// of() : null�� ��ü ���� �Ұ� ���� ����
		Optional<String> opt = Optional.of(v);
		System.out.println(opt); 
		
		System.out.println(opt.isPresent()); 
		opt.ifPresent(i -> {
			System.out.println(1);
			System.out.println(i.length());
			System.out.println(2);
			});
	}
	
	@Test
	public void step04() {
		String v = null;
//		String v = "encore";
		Optional<String> opt = Optional.of(v);
		System.out.println(opt.isPresent());
		System.out.println(opt.orElse("null�� ��츸 ��ȯ"));
	}
	
	
//	@Test
	public void step05() {

//		String v = null;
		String v = "encore";
		Optional<String> opt = Optional.ofNullable(v);
		System.out.println(opt.isPresent()); 
		System.out.println(opt.orElseThrow(IllegalArgumentException::new)); 
		System.out.println(opt.orElseThrow(RuntimeException::new)); 
	}
	
	
}