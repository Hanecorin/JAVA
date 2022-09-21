/* CREATE TABLE activist (
       activist_id          VARCHAR2(20)  PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       major                VARCHAR2(50) NULL
);  */
package probono.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import probono.model.dto.ActivistDTO;
import probono.model.util.DBUtil;

//����� table�� ����� DAO Ŭ���� 
public class ActivistDAO {
	// ����� ���(insert)
	public static boolean addActivist(ActivistDTO activist) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into activist values(?, ?, ?, ?)");
			pstmt.setString(1, activist.getId());
			pstmt.setString(2, activist.getName());
			pstmt.setString(3, activist.getPassword());
			pstmt.setString(4, activist.getMajor());

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// ����
	// ����� id�� �ֿ� ��� ���� �����ϱ�
	public static boolean updateActivist(String activistId, String major) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement("update activist set major=? where activist_id=?");
			pstmt.setString(1, major);
			pstmt.setString(2, activistId);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// ??? ����
	// sql - delete from activist where activist_id=?
	public static boolean deleteActivist(String activistId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from activist where activist_id=?");

			pstmt.setString(1, activistId);

			int result = pstmt.executeUpdate();
			
			if (result != 0) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// id�� �ش� ������� ��� ���� ��ȯ
	public static ActivistDTO getActivist(String activistId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ActivistDTO activist = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from activist where activist_id=?");
			pstmt.setString(1, activistId);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				//@Builder(builderMethodName = "activistDTOBuilder")
				activist = ActivistDTO.activistDTOBuilder()
										.id(rset.getString(1))
										.name(rset.getString(2))
										.password(rset.getString(3))
										.major(rset.getString(4)).build();
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return activist;
	}

	// ???��� ����� �˻��ؼ� ��ȯ
	// sql - select * from activist
	public static ArrayList<ActivistDTO> getAllActivists() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<ActivistDTO> all = null;

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from activist");
			rset = pstmt.executeQuery();

			all = new ArrayList<ActivistDTO>();
			while (rset.next()) {
				all.add(ActivistDTO.activistDTOBuilder()
									.id(rset.getString(1))
									.name(rset.getString(2))
									.password(rset.getString(3))
									.major(rset.getString(4)).build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return all;
	}
}