package step01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeptDAO {
	
	// select * from dept;
	public static void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			// driver �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
			
			// Statement ��ü ����
			stmt = conn.createStatement();
						
			// sql ���� ����
			rset = stmt.executeQuery("select * from dept");
			
			// ��� ��� �÷��� �Ǵ� index�� ���
			while(rset.next()) { // �˻��� table�� ���� row�� �̵��ϸ� ���翩�� Ȯ��
				System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));	
				// �Ǵ� System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// �ڿ� ��ȯ
			try {
				if(rset != null) {
					rset.close();
					rset = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) { // close() throws SQLException{} ó�� �ʼ�
				e.printStackTrace();
			}
			
		}

	}
	
	
	// select * from dept where deptno = ;
	public static void selectOne(int deptno) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			// driver �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
			
			// Statement ��ü ����
			stmt = conn.createStatement();
						
			// sql ���� ����
			rset = stmt.executeQuery("select * from dept where deptno=" + deptno);
			
			// ��� ��� 
			while(rset.next()) {
				System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));	
				// �Ǵ� System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// �ڿ� ��ȯ
			try {
				if(rset != null) {
					rset.close();
					rset = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}
	
	// select dname from dept where deptno = ;
	public static void selectOneDname(int deptno) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			// driver �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection ��ü ����
			conn = DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
			
			// Statement ��ü ����
			stmt = conn.createStatement();
						
			// sql ���� ����
			rset = stmt.executeQuery("select dname from dept where deptno=" + deptno);
			
			// ��� ���
			while(rset.next()) { 
				System.out.println(rset.getString(1));	
				// �Ǵ� System.out.println(rset.getString("dname"));
				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// �ڿ� ��ȯ
			try {
				if(rset != null) {
					rset.close();
					rset = null;
				}
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}
	

	public static void main(String[] args) {
		selectAll();
		System.out.println("------------------------------");
		selectOne(10);
		System.out.println("------------------------------");
		selectOne(20);
		System.out.println("------------------------------");
		selectOneDname(10);
		System.out.println("------------------------------");
		selectOneDname(70);
		System.out.println("------------------------------");
	}

}
