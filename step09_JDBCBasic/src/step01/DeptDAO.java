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
			// driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
			
			// Statement 객체 생성
			stmt = conn.createStatement();
						
			// sql 문장 실행
			rset = stmt.executeQuery("select * from dept");
			
			// 결과 사용 컬럼명 또는 index값 사용
			while(rset.next()) { // 검색된 table의 다음 row로 이동하며 존재여부 확인
				System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));	
				// 또는 System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// 자원 반환
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
			} catch (SQLException e) { // close() throws SQLException{} 처리 필수
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
			// driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
			
			// Statement 객체 생성
			stmt = conn.createStatement();
						
			// sql 문장 실행
			rset = stmt.executeQuery("select * from dept where deptno=" + deptno);
			
			// 결과 사용 
			while(rset.next()) {
				System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));	
				// 또는 System.out.println(rset.getInt("deptno") + " " + rset.getString("dname") + " " + rset.getString("loc"));
				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// 자원 반환
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
			// driver 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
			
			// Statement 객체 생성
			stmt = conn.createStatement();
						
			// sql 문장 실행
			rset = stmt.executeQuery("select dname from dept where deptno=" + deptno);
			
			// 결과 사용
			while(rset.next()) { 
				System.out.println(rset.getString(1));	
				// 또는 System.out.println(rset.getString("dname"));
				
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// 자원 반환
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
