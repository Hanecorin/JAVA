package model.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil { 
	// properties 파일의 내용을 보유하게되는 객체 생성
	static Properties p = new Properties();
	
	// driver 로딩
	static {
		try {  
			p.load(new FileInputStream("db.properties"));

			Class.forName(p.getProperty("driver"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();   
		}
	}  
	
	/// URI, IP, PW 등으로 접속하는 객체 반환
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(p.getProperty("url"), 
											p.getProperty("id"),
											p.getProperty("pw"));
	}
	
	//자원반환 : insert, update, delete
	public static void close(Connection con, Statement stmt) {
		try {
	
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}		
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
	
	// 자원반환 - insert, update, delete 중복 실행
	public static void close(Connection con, Statement stmt, Statement stmt2) {
		try {
	
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (stmt2 != null) {
				stmt2.close();
				stmt2 = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}		
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	// 자원반환 : select
	public static void close(Connection con, Statement stmt, ResultSet rset) {
		try {
			if (rset != null) {
				rset.close();
				rset = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null) {
				con.close();
				con = null;
			}
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}
}