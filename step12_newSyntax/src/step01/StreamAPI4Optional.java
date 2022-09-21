package step01;


import java.util.Optional;

import org.junit.Test;

public class StreamAPI4Optional {

//	@Test
	public void step01() {
		String v = null;
		System.out.println(v.length()); // 실행 예외 발생
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
		
		// of() : null로 객체 생성 불가 실행 오류
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
		System.out.println(opt.orElse("null인 경우만 반환"));
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