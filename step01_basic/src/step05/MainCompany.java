package step05;

public interface MainCompany {
	
	// 그룹 이름
	public static final String COMPANY_NAME = "playdata"; // 그룹명
	
	// 각 계열사 대표이름 반환하는 메소드
	public abstract String getName();
	
	// 각 계열사 연도 반환 메소드
	int getHistory(); // 컴파일 시 public abstract int getHistory()
	
}
