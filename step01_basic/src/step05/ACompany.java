package step05;

// interface를 구현하는 하위 클래스
// 미완성 메소드 반드시 재정의 필수
public class ACompany implements MainCompany {
	String twogo = "계열사 대표이름 A";
	int history = 10;
	
	// 각계열사 대표이름 반환하는 메소드
	
	
	public String getName() {
		return twogo;
	}
	
	public int getHistory() {
		return history;
	}
}