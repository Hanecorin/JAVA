package step05;

public class BCompany implements MainCompany{
	String twogo = "계열사 대표이름 B";
	int history = 20;
	
	public String getName() {
		return twogo;
	}
	
	public int getHistory() {
		return history;
	}
}