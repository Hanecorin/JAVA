package model;

import controller.Controller;
import model.domain.Department;
import model.domain.Emp;
import model.domain.Table;

public class Model {
	
	Controller c = Controller.getInstance();
	
	public Department dept1 = new Department(1, "Account", "Seoul");
	public Department dept2 = new Department(2, "Account", "Busan");
	public Department dept3 = new Department(3, "IT", "Seoul");
	public Department dept4 = new Department(4, "IT", "Busan");
	public Department dept5 = new Department(5, "Sales", "Seoul");
	public Department dept6 = new Department(6, "Sales", "Busan");

	
	public Emp emp01 = new Emp(01, "유재석", 11, 5000.0, dept1);
	public Emp emp02 = new Emp(02, "박명수", 12, 4500.0, dept2);
	public Emp emp03 = new Emp(03, "정준하", 12, 4500.0, dept3);
	public Emp emp04 = new Emp(04, "정형돈", 13, 4000.0, dept4);
	public Emp emp05 = new Emp(05, "노홍철", 14, 3500.0, dept5);
	public Emp emp06 = new Emp(06, "하하 ", 14, 3500.0, dept6);
	
	public Emp emp11 = new Emp(11, "이경규", 0, 14000.0, dept1);
	public Emp emp12 = new Emp(12, "강호동", 0, 12000.0, dept2);
	public Emp emp13 = new Emp(13, "신동엽", 0, 10000.0, dept3);
	public Emp emp14 = new Emp(14, "김구라", 0, 10000.0, dept5);

	
	public Table newcomer1 = new Table( "newcomer1", emp01 );
	public Table newcomer2 = new Table( "newcomer2", emp02 );
	public Table newcomer3 = new Table( "newcomer3", emp03 );
	public Table newcomer4 = new Table( "newcomer4", emp04 );
	public Table newcomer5 = new Table( "newcomer5", emp05 );
	public Table newcomer6 = new Table( "newcomer6", emp06 );
	
	public Table notnew1 = new Table("notnew1", emp11);
	public Table notnew2 = new Table("notnew2", emp12);
	public Table notnew3 = new Table("notnew3", emp13);
	public Table notnew4 = new Table("notnew4", emp14);
}