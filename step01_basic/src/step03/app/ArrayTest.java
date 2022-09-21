package step03.app;

public class ArrayTest {
	
	static int [] m1(){
//		int [] i = new int[2]; 
//		i[0] = 10;  
//		i[1] = 20;
		int i [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		return i; //int[]
	}
	
	static void m2(int [] i) {
		System.out.println(i[0]);  //1
		System.out.println(i.length); //10
		
		System.out.println("배열 data를 반복문 활용해서 출력");
		
		for(int v : i) {
			System.out.println(v);			
		}
	}
	
	public static void main(String[] args) {
		m2(m1());
	}

}