package model;

import model.domain.Info;
import model.domain.Plane;

public class Model {

	private static Plane pl01;
	private static Info in01;
	private static Model instance = new Model();
	
	private Model() {}
	
	public static Model getInstance() {
		return instance;
	}
	
	static {
		pl01 = Plane.builder().name("F-35").type("B").build();
		in01 = new Info("F-35B", 2015);		
	}
	
	public Plane queryPlane(String name) {
		if(name.equals(pl01.getName())) {
			return pl01;
		}
		else {
			return null;
		}
	}
	
	public int qureyYeardate(int YearDate) {
		return in01.getYearDate();
	}
}