package view;

import java.sql.SQLException;
import java.util.ArrayList;

import model.BookDAO;
import model.CustomerDAO;
import model.RentDAO;
import model.dto.BookDTO;
import model.dto.CustomerDTO;
import model.dto.RentDTO;


public class EndView {
	// 모든 도서 정보 조회
	public static void bookListView(ArrayList<BookDTO> books) {
		int listSize = books.size();
		if (listSize != 0) {
			int count = 1;
			for (BookDTO b : books) {
				System.out.println((count++) + " - " + b);
			}
		} else {
			System.out.println("정보 없음");
		}
	}

	// 도서 번호로 정보 조회
	public static void bookView(int bookNo) throws SQLException {
		if (bookNo != 0) {
			System.out.println(BookDAO.selectOneBook(bookNo));
		}
	}

	// 신규 도서 정보 입력
	public static void addBookView(BookDTO book) throws SQLException {
		if (BookDAO.insertNewBook(book) == true) {
			System.out.println("신규 도서 입력 완료");
		} else {
			System.out.println("입력 오류");
		}
	}

	// 도서 번호로 재고 수정
	public static void updateBookView(int bookNo, int inventory) throws SQLException {
		if (BookDAO.updateInven(bookNo, inventory) == true) {
			System.out.println("도서 정보 수정 완료");
		} else {
			System.out.println("수정 오류");
		}
	}

	// 도서 정보 삭제
	public static void deleteBookView(int bookNo) throws SQLException {
		if (BookDAO.deleteBook(bookNo) == true) {
			System.out.println("도서 정보 삭제 완료");
		} else {
			System.out.println("삭제 오류");
		}
	}
	
	// 모든 회원 정보 조회
	public static void custListView(ArrayList<CustomerDTO> cust) {
		int listSize = cust.size();
		if (listSize != 0) {
			int count = 1;
			for (CustomerDTO c : cust) {
				System.out.println((count++) + " - " + c);
			}
		} else {
			System.out.println("정보 없음");
		}
	}

	// 회원 번호로 정보 조회
	public static void custView(int custNo) throws SQLException {
		if (custNo != 0) {
			System.out.println(CustomerDAO.selectOneCust(custNo));
		}
	}

	// 신규 회원 입력
	public static void addCustView(CustomerDTO cust) throws SQLException {
		if (CustomerDAO.insertNewCust(cust) == true) {
			System.out.println("신규 회원 입력 완료");
		} else {
			System.out.println("입력 오류");
		}
	}

	// 회원 번호로 전화 번호 수정
	public static void updateCustView(int custId, int num) throws SQLException {
		if (CustomerDAO.updateNum(custId, num) == true) {
			System.out.println("회원 정보 수정 완료");
		} else {
			System.out.println("수정 오류");
		}
	}

	// 회원 정보 삭제
	public static void deleteCustView(int custId) throws SQLException {
		if (CustomerDAO.deleteCust(custId) == true) {
			System.out.println("회원 정보 삭제 완료");
		} else {
			System.out.println("삭제 오류");
		}
	}
	
	// 모든 대여 내역 조회
	public static void rentListView(ArrayList<RentDTO> rent) {
		int listSize = rent.size();
		if (listSize != 0) {
			int count = 1;
			for (RentDTO r : rent) {
				System.out.println((count++) + " - " + r);
			}
		} else {
			System.out.println("정보 없음");
		}
	}

	// 책 재목으로 대여 내역 조회
	public static void rentView(String bookName) throws SQLException {
		if (bookName != null) {
			System.out.println(RentDAO.selectOneRent(bookName));
		}
	}
	
	// 대여 가능 여부 확인
	
	public static void checkRent(int bookNo) throws SQLException {
		if (RentDAO.checkRent(bookNo) == true) {
			System.out.println("대여 가능");
		} else {
			System.out.println("대여 불가");
		}
	}
	
	// 신규 대여 정보
	public static void rentInsertView(RentDTO rent) throws SQLException {
		if (RentDAO.insertNewRent(rent) == true) {
			System.out.println("대여 완료");
		} else {
			System.out.println("대여 불가");
		}
	}
	
	// 오류 메세지 출력
	public static void showError(String msg) {
		System.out.println(msg);
	}
	
	
}