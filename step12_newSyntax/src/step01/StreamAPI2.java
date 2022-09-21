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
		// 1 ~ 5 ���� int ���� ������� List���� ��ü�� ����
		// int -> Integer ��ü�� ��ȯ�� list
		List<Integer> intDatas = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(intDatas);
		
		System.out.println("¦���� ��"); // n % 2 == 0
		
		// java.util.stream.ReferencePipeline$2@63e31ee
		System.out.println(intDatas.stream().filter(v -> v % 2 == 0));
		
		// java.util.stream.ReferencePipeline$4@6c629d6e
		System.out.println(intDatas.stream().filter(v -> v % 2 == 0).mapToInt(i -> i));
		System.out.println(intDatas.stream().filter(v -> v % 2 == 0).mapToInt(i -> i).sum()); // 6 
				
		// Ȧ���� ��
		System.out.println("\nȦ���� ��");
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).sum());
		
		// Ȧ���� ����
		System.out.println("\nȦ���� ����");
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).count());
		
		// Ȧ�� �� �ִ밪
		System.out.println("\nȦ�� �� �ִ밪");
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).max()); // OptionalInt[5]
		System.out.println(intDatas.stream().filter(v -> v % 2 != 0).mapToInt(i -> i).max().getAsInt());
		
		
		// 2�� ������ ��
		System.out.println("\n2�� ������ ��");
		intDatas.stream().filter(v -> v != 2).forEach(System.out::println);
		
	}
	
	// dto ���
	@Test
	public void step02() {
		List<Employee> peoples = new ArrayList<>();
		
		peoples.add(new Employee(101, "Victor", 23));
		peoples.add(new Employee(102, "Rick", 21));
		peoples.add(new Employee(103, "Sam", 25));
		peoples.add(new Employee(104, "John", 27));
		peoples.add(new Employee(105, "Grover", 23));
		peoples.add(new Employee(106, "Adam", 22));
		peoples.add(new Employee(107, "Samy", 224));  // age�� �̻�ġ
		peoples.add(new Employee(108, "Duke", 29));
		
		
		System.out.println("----- 1. [::] ��� -----");
		peoples.forEach(System.out::println);
		
		System.out.println("\n----- 2. lambda�� ��� -----");
		peoples.forEach(v -> System.out.println(v));
		
		System.out.println("\n----- 3. ������ ��� -----");
		System.out.println(peoples.stream().mapToInt(e -> e.getAge()).average().getAsDouble());
		
		System.out.println("\n----- 4. ������ ���� -----"); // [::], lambda �Ѵ� ���
		System.out.println("-[::]");
		peoples.stream().map(Employee::getAge).forEach(System.out::println);
		System.out.println("-lambda");
//		peoples.forEach(e -> System.out.println(e.getAge()));
		peoples.stream().map(Employee::getAge).forEach(age -> System.out.println("\t" + age));
		
		System.out.println("\n----- 5. age�� �̻�ġ�� �����͸� ������ ��� -----");
		System.out.println(peoples.stream().mapToInt(e -> e.getAge()).filter(age -> age <200).average().getAsDouble());
		
	}

}
