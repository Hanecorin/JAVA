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
	// properties ������ ������ �����ϰԵǴ� ��ü ����
	static Properties p = new Properties();
	
	// driver �ε�
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
	
	/// URI, IP, PW ������ �����ϴ� ��ü ��ȯ
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(p.getProperty("url"), 
											p.getProperty("id"),
											p.getProperty("pw"));
	}
	
	//�ڿ���ȯ : insert, update, delete
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
	
	// �ڿ���ȯ - insert, update, delete �ߺ� ����
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

	// �ڿ���ȯ : select
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