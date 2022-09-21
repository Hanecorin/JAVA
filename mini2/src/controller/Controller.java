package controller;

import java.sql.SQLException;

import model.BookDAO;
import model.CustomerDAO;
import model.RentDAO;
import model.dto.BookDTO;
import model.dto.CustomerDTO;
import model.dto.RentDTO;
import view.EndView;

public class Controller {

	//모든 도서 정보 조회
	public static void getAllBooks() {
		try {
			EndView.bookListView(BookDAO.selectAllBooks());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}

	// 도서 번호로 정보 조회
	public static void getBook(int bookNo) {
		try {
			EndView.bookView(bookNo);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}

	// 신규 도서 입력
	public static void addBook(BookDTO book) {
		try {
			EndView.addBookView(book);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("도서 번호 중복");
		}
	}

	// 도서 번호로 재고 수정
	public static void updateBook(int bookNo, int inventory) {
		try {
			EndView.updateBookView(bookNo, inventory);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("도서 번호 확인");
		}
	}

	// 도서 정보 삭제
	public static void deleteBook(int bookNo) {
		try {
			EndView.deleteBookView(bookNo);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("도서 번호 확인");
		}
	}
	
	// 모든 회원 정보 조회
	public static void getAllCust() {
		try {
			EndView.custListView(CustomerDAO.selectAllCust());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}

	// 회원 번호로 정보 조회
	public static void getCust(int custId) {
		try {
			EndView.custView(custId);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}

	// 신규 회원 입력
	public static void addCust(CustomerDTO cust) {
		try {
			EndView.addCustView(cust);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("회원 번호 중복");
		}
	}

	// 회원 번호로 전화 번호 수정
	public static void updateCust(int custId, int num) {
		try {
			EndView.updateCustView(custId, num);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("회원 번호 확인");
		}
	}

	// 회원 정보 삭제
	public static void deleteCust(int custId) {
		try {
			EndView.deleteCustView(custId);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("회원 번호");
		}
	}
	
	// 모든 대여 내역 조회
	public static void getAllRent() {
		try {
			EndView.rentListView(RentDAO.selectAllRent());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}
	
	// 제목으로 대여 내역 조회
	public static void getRent(String bookName) {
		try {
			EndView.rentListView(RentDAO.selectOneRent(bookName));
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}
	
	// 대여 가능 여부 확인
	public static void checkRent(int bookNo) {
		try {
			EndView.checkRent(bookNo);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("조회 오류 발생");
		}
	}
	
	// 신규 대여 정보
	public static void addRent(RentDTO rent) {
		try {
			EndView.rentInsertView(rent);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("대여 불가");
		}
	}
}
