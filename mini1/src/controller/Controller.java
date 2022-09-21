package controller;

import java.util.ArrayList;
import model.domain.Table;


public class Controller {
	
	private ArrayList<Table> tableList = new ArrayList<Table>();
	
	private static Controller instance = new Controller();
	
	private Controller() {}

	
	
	public static Controller getInstance() {
		return instance;
	}
	
	
	//Read(조회하기)
	public ArrayList<Table> getTableList() {
		return tableList;
	}
	
    public Table getEmp_id(int id) {
		
		for(Table t : tableList) {
			
			if(t != null && t.getEmpId().getEmpId()==id) {
				return t;
			}	
		}
		return null;
	}
    
    public void newEmp_id() {
    	for(Table t: tableList) {
    		if( t.getNewComer().startsWith("new")) {
    			System.out.println(t);
    		}
    	}
    }
	
	//Create(생성하기)
    public  void Insert(Table newcomer) throws Exception {
    	
    	Table t = getEmp_id(newcomer.getEmpId().getEmpId());
    	
    	if( t == null) {
    			tableList.add(newcomer);
    	   	    System.out.println("데이터 저장 완료");
    	}
    	else{
    		System.out.println("해당 empId명 중복");
    	}
    }
    
    //Update(수정하기)
    public void mgrIdUpdate(int empId, int empId2) {
		for (Table t : tableList) {
			
			if ( t != null && (t.getEmpId().getEmpId()==empId) ) {
				t.getEmpId().setMgrId(empId2);
				System.out.println("수정 완료");
				break;}
			if ( t == null) {
				System.out.println("대상 empId 없음");}
		}
	}
    
    public void locUpdate(int empId, String loc) {
		for (Table t : tableList) {
			
			if ( t != null && (t.getEmpId().getEmpId()==empId) ) {
				t.getEmpId().getDeptName().setLoc(loc);
				System.out.println("수정 완료");
				break;}
			if ( t == null) {
				System.out.println("대상 empId 없음");}
		}
	}
        
    //Delete(삭제하기)
    public void Delete(int empId) throws Exception {
    	Table t = getEmp_id(empId);
    	tableList.remove(t);
    	if( t == null) {
    		throw new Exception("삭제 대상 없음");
    	}
    }
    	
   }