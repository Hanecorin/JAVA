package step01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import model.domain.DeptDTO;
import util.DBUtil2;

public class DeptDAO3 {
	// insert
	/*
	 * 정상 저장
	 * 비정상 - pk 중복으로 인한 예외 발생
	 * 	- IP 변경, 전원 다운, 메모리 여유공간 없음
	 * 	- SQLException
	 */
	public static boolean insertDept(DeptDTO dept) throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		
		boolean result = false;
		
		try {
			conn = DBUtil2.getConnection();
			stmt = conn.createStatement();
			
			// insert into dept values (10,'HR', 'D.C')
			String sql = "insert into dept values(" + dept.getDeptno() + ", '" + dept.getDname() + "', '" + dept.getLoc() + "')";
			System.out.println(sql);
			int i = stmt.executeUpdate(sql);
			
			if(i == 1) {
				result = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, stmt);
		}
		
		return result;
		
	}
	
	//PreparedStatement  API
	/*
	 * 문장 실행 객체 생성시 정해진 사전 sql문장으로 생성
	 * 가변적인 값을 setXxx()로 수정
	 * executeXxx()는 parameter없이 실행
	 * 장점 
	 * 	: sql문장 구성도 단일 따옴표 고려 안 함
	 * 	: 실행 속도가 Statement보다 빠름	
	 * 		Statement - sql문장 실행시 db가 sql문장 받음 -> 문장 검증 -> db 실행 언어로 변환 -> 실행
	 * 		PreparedStatement
	 * 			- 두번째 동일한 sql문장 요청시 
	 * 				이미 변환된 코드로 실행만 
	 * 				즉 문법 검증 및 변환 단계 생략
	 */

	public static boolean insertDept2(DeptDTO dept) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DBUtil2.getConnection();
			// sql 문장으로 문장 실행 객체 생성
			pstmt = conn.prepareStatement("insert into dept (deptno, dname, loc) values (?, ?, ?)");
			
			// ? 위치에 값 지정
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			// sql문장 실행
			int i = pstmt.executeUpdate();
			
			if(i == 1) {
				result = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, pstmt);
		}
		
		return result;
		
	}
	
	// update
	public static boolean updateDept(int deptno, String newLoc) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DBUtil2.getConnection();
			pstmt = conn.prepareStatement("update dept set loc=? where deptno=?");
			
			// ? 위치에 값 지정
			pstmt.setString(1, newLoc);
			pstmt.setInt(2, deptno);
			
			// sql문장 실행
			int i = pstmt.executeUpdate();
			
			if(i == 1) {
				result = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, pstmt);
		}
		
		return result;
		
	}
	
	// delete
	public static boolean deleteDept(int deptno) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DBUtil2.getConnection();
			pstmt = conn.prepareStatement("delete from dept where deptno=?");
			
			// ? 위치에 값 지정
			pstmt.setInt(1, deptno);
			
			// sql문장 실행
			int i = pstmt.executeUpdate();
			
			if(i == 1) {
				result = true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, pstmt);
		}
		
		return result;
	}
	
	// select * from dept;
	public static void selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;		
		
		try {
			conn = DBUtil2.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from dept"); 
			
			while(rset.next()) {  
				System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, stmt, rset);
		}
			
	}
	
	// select * from dept where deptno=?
	public static void selectOne(int deptno) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;		
		
		try {
			conn = DBUtil2.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select * from dept where deptno=" + deptno); 
			
			if(rset.next()) {  
				System.out.println(rset.getInt(1) + " " + rset.getString(2) + " " + rset.getString(3));
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, stmt, rset);
		}
	}
	
	// select dname from dept where deptno=?
	public static void selectOneDname(int deptno) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;		
		
		try {
			conn = DBUtil2.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select dname from dept where deptno=" + deptno); 
			if(rset.next()) {  
				System.out.println(rset.getString("dname"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil2.close(conn, stmt, rset);
		}		
	}
		
//	public static void main(String[] args) {
//		selectAll();
//		System.out.println("------------------------------");
//		selectOne(10);
//		System.out.println("------------------------------");
//		selectOne(20);
//		System.out.println("------------------------------");
//		selectOneDname(10);
//		System.out.println("------------------------------");
//		selectOneDname(70);
//		System.out.println("------------------------------");
//	}
		
	@Test
	public void crutTest() {
		try {
			selectAll();
			
//			insertDept(new DeptDTO(53, "IT", "CAL"));
			
			deleteDept(53);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
}