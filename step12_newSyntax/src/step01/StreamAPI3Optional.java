package step01;


import java.util.Optional;

import org.junit.Test;

public class StreamAPI3Optional {

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
//		String v = null;
		String v = "playdata";		
		Optional<String> opt = Optional.ofNullable(v); // null 또는 String이 parameter
		System.out.println(opt); // Optional.empty
		
		// 데이터 여부 확인
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
		System.out.println(opt.orElse("null인 경우만 반환")); // null 경우만 반환 | encore
	}
	
	
	@Test
	public void step05() {
		/*
		 * 컴파일 예외 발생 가능성 존재 시 try~catch 필수
		 * 컴파일 예외 발생 가능성 존재 시 try~catch 옵션(값만 수정)
		 */
		
//		String v = null;
		String v = "encore";
		Optional<String> opt = Optional.ofNullable(v);
		System.out.println(opt.isPresent()); 
		System.out.println(opt.orElseThrow(IllegalArgumentException::new)); 
		System.out.println(opt.orElseThrow(RuntimeException::new)); 
//		System.out.println(opt.orElseThrow(Exception::new)); // 문법 오류(∵ Exception은 try~catch가 필수)
	}
	
	
}