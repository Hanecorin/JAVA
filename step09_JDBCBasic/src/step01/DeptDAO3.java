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
	 * ���� ����
	 * ������ - pk �ߺ����� ���� ���� �߻�
	 * 	- IP ����, ���� �ٿ�, �޸� �������� ����
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
	 * ���� ���� ��ü ������ ������ ���� sql�������� ����
	 * �������� ���� setXxx()�� ����
	 * executeXxx()�� parameter���� ����
	 * ���� 
	 * 	: sql���� ������ ���� ����ǥ ��� �� ��
	 * 	: ���� �ӵ��� Statement���� ����	
	 * 		Statement - sql���� ����� db�� sql���� ���� -> ���� ���� -> db ���� ���� ��ȯ -> ����
	 * 		PreparedStatement
	 * 			- �ι�° ������ sql���� ��û�� 
	 * 				�̹� ��ȯ�� �ڵ�� ���ุ 
	 * 				�� ���� ���� �� ��ȯ �ܰ� ����
	 */

	public static boolean insertDept2(DeptDTO dept) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		boolean result = false;
		
		try {
			conn = DBUtil2.getConnection();
			// sql �������� ���� ���� ��ü ����
			pstmt = conn.prepareStatement("insert into dept (deptno, dname, loc) values (?, ?, ?)");
			
			// ? ��ġ�� �� ����
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			// sql���� ����
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
			
			// ? ��ġ�� �� ����
			pstmt.setString(1, newLoc);
			pstmt.setInt(2, deptno);
			
			// sql���� ����
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
			
			// ? ��ġ�� �� ����
			pstmt.setInt(1, deptno);
			
			// sql���� ����
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