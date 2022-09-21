package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import model.domain.Employee;

public class StreamAPI2 {

//	public static void main(String[] args) {
//	}
	
	public void step01() {
		// 1 ~ 5 까지 int 값을 기반으로 List에는 객체만 저장
		// int -> Integer 객체로 변환된 list
		List<Integer> intDatas = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(intDatas);
		
		System.out.println("짝수의 합"); // n % 2 == 0
		
		// java.util.stream.ReferencePipeline$2@63e31ee
		System.out.println(intDatas.stream().filter(v -> v % 2 == 0));
		
		// java.util.stream.ReferencePipeline$4@6c629d6e
		System.out.println(intDatas.stream().filter(v -> v % 2 == 0).mapToInt(i -> i));
		System.out.println(intDatas.stream().filter(v -> v % 2 == 0).mapToInt(i -> i).sum()); // 6 
				
		// 홀수의 합
		System.out.println("\n홀수의 합");
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).sum());
		
		// 홀수의 개수
		System.out.println("\n홀수의 개수");
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).count());
		
		// 홀수 중 최대값
		System.out.println("\n홀수 중 최대값");
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).max()); // OptionalInt[5]
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).max().getAsInt());
		
		
		// 2를 제외한 수
		System.out.println("\n2를 제외한 수");
		intDatas.stream().filter(v -> v != 2).forEach(System.out::println);
		
	}
	
	// dto 사용
	@Test
	public void step02() {
		List<Employee> peoples = new ArrayList<>();
		
		peoples.add(new Employee(101, "Victor", 23));
		peoples.add(new Employee(102, "Rick", 21));
		peoples.add(new Employee(103, "Sam", 25));
		peoples.add(new Employee(104, "John", 27));
		peoples.add(new Employee(105, "Grover", 23));
		peoples.add(new Employee(106, "Adam", 22));
		peoples.add(new Employee(107, "Samy", 224));  // age가 이상치
		peoples.add(new Employee(108, "Duke", 29));
		
		
		System.out.println("----- 1. [::] 사용 -----");
		peoples.forEach(System.out::println);
		
		System.out.println("\n----- 2. lambda식 사용 -----");
		peoples.forEach(v -> System.out.println(v));
		
		System.out.println("\n----- 3. 나이의 평균 -----");
		System.out.println(peoples.stream().mapToInt(e -> e.getAge()).average().getAsDouble());
		
		System.out.println("\n----- 4. 직원이 나이 -----"); // [::], lambda 둘다 사용
		System.out.println("-[::]");
		peoples.stream().map(Employee::getAge).forEach(System.out::println);
		System.out.println("-lambda");
//		peoples.forEach(e -> System.out.println(e.getAge()));
		peoples.stream().map(Employee::getAge).forEach(age -> System.out.println("\t" + age));
		
		System.out.println("\n----- 5. age가 이상치인 데이터를 제외한 평균 -----");
		System.out.println(peoples.stream().mapToInt(e -> e.getAge()).filter(age -> age <200).average().getAsDouble());
		
	}

}
