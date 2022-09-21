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

	//��� ���� ���� ��ȸ
	public static void getAllBooks() {
		try {
			EndView.bookListView(BookDAO.selectAllBooks());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}

	// ���� ��ȣ�� ���� ��ȸ
	public static void getBook(int bookNo) {
		try {
			EndView.bookView(bookNo);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}

	// �ű� ���� �Է�
	public static void addBook(BookDTO book) {
		try {
			EndView.addBookView(book);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("���� ��ȣ �ߺ�");
		}
	}

	// ���� ��ȣ�� ��� ����
	public static void updateBook(int bookNo, int inventory) {
		try {
			EndView.updateBookView(bookNo, inventory);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("���� ��ȣ Ȯ��");
		}
	}

	// ���� ���� ����
	public static void deleteBook(int bookNo) {
		try {
			EndView.deleteBookView(bookNo);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("���� ��ȣ Ȯ��");
		}
	}
	
	// ��� ȸ�� ���� ��ȸ
	public static void getAllCust() {
		try {
			EndView.custListView(CustomerDAO.selectAllCust());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}

	// ȸ�� ��ȣ�� ���� ��ȸ
	public static void getCust(int custId) {
		try {
			EndView.custView(custId);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}

	// �ű� ȸ�� �Է�
	public static void addCust(CustomerDTO cust) {
		try {
			EndView.addCustView(cust);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("ȸ�� ��ȣ �ߺ�");
		}
	}

	// ȸ�� ��ȣ�� ��ȭ ��ȣ ����
	public static void updateCust(int custId, int num) {
		try {
			EndView.updateCustView(custId, num);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("ȸ�� ��ȣ Ȯ��");
		}
	}

	// ȸ�� ���� ����
	public static void deleteCust(int custId) {
		try {
			EndView.deleteCustView(custId);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("ȸ�� ��ȣ");
		}
	}
	
	// ��� �뿩 ���� ��ȸ
	public static void getAllRent() {
		try {
			EndView.rentListView(RentDAO.selectAllRent());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}
	
	// �������� �뿩 ���� ��ȸ
	public static void getRent(String bookName) {
		try {
			EndView.rentListView(RentDAO.selectOneRent(bookName));
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}
	
	// �뿩 ���� ���� Ȯ��
	public static void checkRent(int bookNo) {
		try {
			EndView.checkRent(bookNo);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("��ȸ ���� �߻�");
		}
	}
	
	// �ű� �뿩 ����
	public static void addRent(RentDTO rent) {
		try {
			EndView.rentInsertView(rent);
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("�뿩 �Ұ�");
		}
	}
}
