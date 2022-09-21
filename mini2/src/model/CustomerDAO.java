package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.CustomerDTO;
import model.util.DBUtil;

public class CustomerDAO {
	// ��� ȸ�� ���� ��ȸ
	public static ArrayList<CustomerDTO> selectAllCust() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<CustomerDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from customer");
			rset = pstmt.executeQuery();

			list = new ArrayList<CustomerDTO>();
			while (rset.next()) {
				list.add(CustomerDTO.customerDTOBuilder().customerId(rset.getInt(1)).customerName(rset.getString(2)).phoneNum(rset.getInt(3)).build());
						
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	// ȸ�� ��ȣ�� �˻�
	public static CustomerDTO selectOneCust(int custId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		CustomerDTO list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from customer where customer_id=?");
			pstmt.setInt(1, custId);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				list = CustomerDTO.customerDTOBuilder().customerId(rset.getInt(1)).customerName(rset.getString(2)).phoneNum(rset.getInt(3)).build();
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}

	// �ű� ȸ�� �Է�
	public static boolean insertNewCust(CustomerDTO cust) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into customer values(?, ?, ?)");
			pstmt.setInt(1, cust.getCustomerId());
			pstmt.setString(2, cust.getCustomerName());
			pstmt.setInt(3, cust.getPhoneNum());


			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}

		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// ȸ�� ��ȣ�� ��ȭ ��ȣ ����
	public static boolean updateNum(int custId, int num) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update customer set phone_num=? where customer_id=?");
			pstmt.setInt(1, num);
			pstmt.setInt(2, custId);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

	// ȸ�� ���� ����
	public static boolean deleteCust(int custId) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from customer where customer_id=?");
			pstmt.setInt(1, custId);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}

}
