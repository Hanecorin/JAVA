package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.RentDTO;
import model.util.DBUtil;

public class RentDAO {
	// 모든 대여 내역 조회
	public static ArrayList<RentDTO> selectAllRent() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<RentDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from rent");
			rset = pstmt.executeQuery();

			list = new ArrayList<RentDTO>();
			while (rset.next()) {
				list.add(RentDTO.rentDTOBuilder().rentNo(rset.getInt(1)).rentDate(rset.getString(2)).bookNo(rset.getInt(3)).bookName(rset.getString(4)).customerId(rset.getInt(5)).customerName(rset.getString(6)).build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
	// 재목으로 대여 내역 조회
		public static ArrayList<RentDTO> selectOneRent(String bookName) throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rset = null;
			ArrayList<RentDTO> list = null;
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement("select * from rent where book_name=?");
				pstmt.setString(1, bookName);
				rset = pstmt.executeQuery();
				
				list = new ArrayList<RentDTO>();
				
				while (rset.next()) {
					list.add(new RentDTO(rset.getInt("rent_no"), rset.getString("rent_date"), rset.getInt("book_no"), rset.getString("book_name"), rset.getInt("customer_id"), rset.getString("customer_name")));
				}
			} finally {
				DBUtil.close(con, pstmt, rset);
			}
			return list;
		}
		
		// 대여 가능 여부 확인
		public static boolean checkRent(int bookNo) throws SQLException {
			if(BookDAO.selectOneBook(bookNo).getInventory() >= 1) {
				return true;
			}
			
			return false;
			
		}
		

		// 신규 대여 내역 입력
		public static boolean insertNewRent(RentDTO rent) throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			PreparedStatement pstmt2 = null;
			try {
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement("insert into rent values(?, ?, ?, ?, ?, ?)");
				pstmt.setInt(1, rent.getRentNo());
				pstmt.setString(2, rent.getRentDate());
				pstmt.setInt(3, rent.getBookNo());
				pstmt.setString(4, rent.getBookName());
				pstmt.setInt(5, rent.getCustomerId());
				pstmt.setString(6, rent.getCustomerName());
				
				pstmt2 = con.prepareStatement("update book set inventory=inventory-1 where book_no=?");
				pstmt2.setInt(1, rent.getBookNo());
				


				int result = pstmt.executeUpdate();
				int result2 = pstmt2.executeUpdate();

				if (result == 1 && result2 == 1) {
					return true;
				}

			} finally {
				DBUtil.close(con, pstmt, pstmt2);
			}
			return false;
		}
}