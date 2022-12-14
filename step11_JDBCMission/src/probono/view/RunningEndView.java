package probono.view;

import java.util.ArrayList;

import probono.model.dto.ActivistDTO;
import probono.model.dto.ProbonoProjectDTO;

public class RunningEndView {
	
	//모든 프로젝트 출력
	public static void projectListView(ArrayList<ProbonoProjectDTO> activistListlProbonoProject){
		
		int listSize = activistListlProbonoProject.size();
		
		if(listSize != 0) {
			int count = 1;
			
			for(ProbonoProjectDTO p : activistListlProbonoProject) {
				// ; 정상 종료시 count 변수값 1 증가
				System.out.println("검색 정보 " + (count++) + " - " + p); 
			} 
			
		}else {
			System.out.println("검색 정보 0");
		}
	}
	
	// 별도의 activist view method를 구현해서 제네릭 적용
	public static void activistListView(ArrayList<ActivistDTO> activistList) {
		int listSize = activistList.size();
		
		if(listSize != 0) {
			int count = 1;
			for(ActivistDTO a : activistList) {
				System.out.println("검색 정보 " + (count++) + " - " + a);
			}
		} else {
			System.out.println("검색 정보 0");
		}
	}
		
	//특정 프로젝트 출력 
	public static void projectView(ProbonoProjectDTO project){
		System.out.println(project);		
	}
	
	//?? 모든 DTO 정보 출력하는 메소드
	// upcasting 활용
	public static void allView(Object object){
		System.out.println(object);
	}
	
	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}