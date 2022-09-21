// ��� DB ���� Ŭ������ �� �޼ҵ�� �� ������ �ڵ� �и�
/*
 * ������� : �׻� ����Ǵ� ������ �����̶� ����
 * driver �ε�
 * �ڿ� ��ȯ
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	// driver �ε�
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		}
		
	}
	
	// URI, IP, PW ������ �����ϴ� ��ü ��ȯ
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
	}
	
	// �ڿ� ��ȯ
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
		} catch (SQLException e) {
		}
	}
		
		// �ڿ� ��ȯ : insert.update
		public static void close2(Connection conn, Statement stmt) {
			try {
				if(stmt != null) {
					stmt.close();
					stmt = null;
				}
				if(conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
			}
		}

}
