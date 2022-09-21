package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.domain.EmpDTO;
import util.DBUtil;


public class EmpDAO {
	//select * from emp
	public static ArrayList<EmpDTO> selectAll() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		ArrayList<EmpDTO> emps = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from emp");
			rset = pstmt.executeQuery();
			
			emps = new ArrayList<>();
			
			while(rset.next()) {
				emps.add(new EmpDTO(rset.getInt("empno"), rset.getString("ename"), rset.getString("job"), rset.getInt("mgr"), rset.getString("hiredate"), rset.getDouble("sal"), rset.getDouble("comm"), rset.getInt("deptno")));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt, rset);
		}
		
		return emps;
		
	}
	
	// select * from emp where empno=
	public static EmpDTO selectOne(int empno) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		EmpDTO emp = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from emp where empno=?");
			pstmt.setInt(1, empno);
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				emp = new EmpDTO(rset.getInt("empno"), rset.getString("ename"), rset.getString("job"), rset.getInt("mgr"), rset.getString("hiredate"), rset.getDouble("sal"), rset.getDouble("comm"), rset.getInt("deptno"));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt, rset);
		}
		
		return emp;
		
	}
	
	// insert into emp values (?, ?, ?, ...)
	public static boolean empInsert(EmpDTO emp) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("insert into emp values (?, ?, ?, ?, ?, ?, ?, ?)");
			//new EmpDTO(1234, "SMITH", "CLERK", 7902, "1980-12-17", 800.0, 20, 30));
			pstmt.setInt(1, emp.getEmpno());
			pstmt.setString(2, emp.getEname());
			pstmt.setString(3, emp.getJob());
			pstmt.setInt(4, emp.getMgr());
			pstmt.setString(5, emp.getHiredate());
			pstmt.setDouble(6, emp.getSal());
			pstmt.setDouble(7, emp.getComm());
			pstmt.setInt(8, emp.getDeptno());
			
			int i = pstmt.executeUpdate();
		
			if(i !=0 ) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt);
		}
		
		return false;
	}
	
	// update emp set sal = sal*? where deptno=?
	public static boolean empSalUpdate(int deptno, float salUp) throws Exception{
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("update emp set sal=sal*? where deptno=?");
			
			pstmt.setFloat(1, salUp);
			pstmt.setInt(2, deptno);
			
			int v = pstmt.executeUpdate();
			if(v != 0) {  
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			DBUtil.close(conn, pstmt);
		}
		
		return false;
	}

	
	// delete from emp where empno=?
	public static boolean empDelete(int deleteEmpno) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("delete from emp where empno=?");

			pstmt.setInt(1, deleteEmpno);

			int v = pstmt.executeUpdate();
			if (v != 0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			DBUtil.close(conn, pstmt);
		}

		return false;
	}

}