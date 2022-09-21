// ��� DB ���� Ŭ������ �� �޼ҵ�� �� ������ �ڵ� �и�
/*
 * ������� : �׻� ����Ǵ� ������ �����̶� ����
 * driver �ε�
 * �ڿ� ��ȯ
 */
package util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	//properties ������ ������ �����ϰԵǴ� ��ü ����
	static Properties pros = new Properties();
	
	//driver �ε�
	static {
		try {
			pros.load(new FileInputStream("C:\\99.encore\\08.java\\step09_JDBCBasic\\src\\db.properties"));
			Class.forName(pros.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

		
	
	// URI, IP, PW ������ �����ϴ� ��ü ��ȯ
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(pros.getProperty("url"), pros.getProperty("id"), pros.getProperty("pw"));
	}
	
	//�ڿ���ȯ : select
		public static void close(Connection conn, Statement stmt, ResultSet rset) {
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
			}catch (SQLException e) {  
				e.printStackTrace();
			}
		}
		
		//�ڿ���ȯ : insert.update.delete
		public static void close(Connection conn, Statement stmt) {
			try {			
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			}catch (SQLException e) {  
				e.printStackTrace();
			}
		}
		
	}
