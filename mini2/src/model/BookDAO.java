package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.dto.BookDTO;
import model.util.DBUtil;

public class BookDAO {
	// 모든 도서 정보 조회
	public static ArrayList<BookDTO> selectAllBooks() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		ArrayList<BookDTO> list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from book");
			rset = pstmt.executeQuery();

			list = new ArrayList<BookDTO>();
			while (rset.next()) {
				list.add(BookDTO.bookDTOBuilder().bookNo(rset.getInt(1)).bookName(rset.getString(2)).writer(rset.getString(3)).publisher(rset.getString(4)).inventory(rset.getInt(5)).build());
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
	// 도서 번호로 정보 검색
	public static BookDTO selectOneBook(int bookNo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		BookDTO list = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("select * from book where book_no=?");
			pstmt.setInt(1, bookNo);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				list = BookDTO.bookDTOBuilder().bookNo(rset.getInt(1)).bookName(rset.getString(2)).writer(rset.getString(3)).publisher(rset.getString(4)).inventory(rset.getInt(5)).build();
			}
		} finally {
			DBUtil.close(con, pstmt, rset);
		}
		return list;
	}
	
	// 신규 도서 입력
	public static boolean insertNewBook(BookDTO book) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("insert into book values(?, ?, ?, ?, ?)");
			pstmt.setInt(1, book.getBookNo());
			pstmt.setString(2, book.getBookName());
			pstmt.setString(3, book.getWriter());
			pstmt.setString(4, book.getPublisher());
			pstmt.setInt(5, book.getInventory());

			int result = pstmt.executeUpdate();

			if (result == 1) {
				return true;
			}

		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
		
	// 도서 번호로 재고 수정
	public static boolean updateInven(int bookNo, int inventory) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("update book set inventory=? where book_no=?");
			pstmt.setInt(1, inventory);
			pstmt.setInt(2, bookNo);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				return true;
			}
		} finally {
			DBUtil.close(con, pstmt);
		}
		return false;
	}
	
	// 도서 정보 삭제
	public static boolean deleteBook(int bookNo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("delete from book where book_no=?");
			pstmt.setInt(1, bookNo);
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