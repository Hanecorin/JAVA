package controller;

import model.Model;
import model.domain.Plane;
import view.FailView;
import view.SucceView;

public class Controller {
	
	private static Model m = Model.getInstance();
	
	public static void reqRes(int no) {
		if (no == 1) {
			Plane pl01 = m.queryPlane("F-35");
			
			if (pl01 != null) {
				SucceView.printPlane(pl01);
			}
			else {
				FailView.printMsg("해당 기체 없음");
			}
		}
		else if (no == 2) {
			SucceView.printYearDate(m.qureyYeardate(2015));
		}
		else {
			FailView.printMsg("해당 기체 없음");
		}
	}
}
