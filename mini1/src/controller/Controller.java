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
	
	
	//Read(��ȸ�ϱ�)
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
	
	//Create(�����ϱ�)
    public  void Insert(Table newcomer) throws Exception {
    	
    	Table t = getEmp_id(newcomer.getEmpId().getEmpId());
    	
    	if( t == null) {
    			tableList.add(newcomer);
    	   	    System.out.println("������ ���� �Ϸ�");
    	}
    	else{
    		System.out.println("�ش� empId�� �ߺ�");
    	}
    }
    
    //Update(�����ϱ�)
    public void mgrIdUpdate(int empId, int empId2) {
		for (Table t : tableList) {
			
			if ( t != null && (t.getEmpId().getEmpId()==empId) ) {
				t.getEmpId().setMgrId(empId2);
				System.out.println("���� �Ϸ�");
				break;}
			if ( t == null) {
				System.out.println("��� empId ����");}
		}
	}
    
    public void locUpdate(int empId, String loc) {
		for (Table t : tableList) {
			
			if ( t != null && (t.getEmpId().getEmpId()==empId) ) {
				t.getEmpId().getDeptName().setLoc(loc);
				System.out.println("���� �Ϸ�");
				break;}
			if ( t == null) {
				System.out.println("��� empId ����");}
		}
	}
        
    //Delete(�����ϱ�)
    public void Delete(int empId) throws Exception {
    	Table t = getEmp_id(empId);
    	tableList.remove(t);
    	if( t == null) {
    		throw new Exception("���� ��� ����");
    	}
    }
    	
   }