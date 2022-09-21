// 모든 DB 연동 클래스의 각 메소드들 중 공동된 코드 분리
/*
 * 고려사항 : 항상 실행되는 서버의 로직이라 가정
 * driver 로딩
 * 자원 반환
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	
	// driver 로딩
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		}
		
	}
	
	// URI, IP, PW 등으로 접속하는 객체 반환
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/playdata?characterEncoding=UTF-8&serverTimezone=UTC", "bigdata", "bigdata");
	}
	
	// 자원 반환
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
		
		// 자원 반환 : insert.update
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
