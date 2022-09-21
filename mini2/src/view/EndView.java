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
	// ��� ���� ���� ��ȸ
	public static void bookListView(ArrayList<BookDTO> books) {
		int listSize = books.size();
		if (listSize != 0) {
			int count = 1;
			for (BookDTO b : books) {
				System.out.println((count++) + " - " + b);
			}
		} else {
			System.out.println("���� ����");
		}
	}

	// ���� ��ȣ�� ���� ��ȸ
	public static void bookView(int bookNo) throws SQLException {
		if (bookNo != 0) {
			System.out.println(BookDAO.selectOneBook(bookNo));
		}
	}

	// �ű� ���� ���� �Է�
	public static void addBookView(BookDTO book) throws SQLException {
		if (BookDAO.insertNewBook(book) == true) {
			System.out.println("�ű� ���� �Է� �Ϸ�");
		} else {
			System.out.println("�Է� ����");
		}
	}

	// ���� ��ȣ�� ��� ����
	public static void updateBookView(int bookNo, int inventory) throws SQLException {
		if (BookDAO.updateInven(bookNo, inventory) == true) {
			System.out.println("���� ���� ���� �Ϸ�");
		} else {
			System.out.println("���� ����");
		}
	}

	// ���� ���� ����
	public static void deleteBookView(int bookNo) throws SQLException {
		if (BookDAO.deleteBook(bookNo) == true) {
			System.out.println("���� ���� ���� �Ϸ�");
		} else {
			System.out.println("���� ����");
		}
	}
	
	// ��� ȸ�� ���� ��ȸ
	public static void custListView(ArrayList<CustomerDTO> cust) {
		int listSize = cust.size();
		if (listSize != 0) {
			int count = 1;
			for (CustomerDTO c : cust) {
				System.out.println((count++) + " - " + c);
			}
		} else {
			System.out.println("���� ����");
		}
	}

	// ȸ�� ��ȣ�� ���� ��ȸ
	public static void custView(int custNo) throws SQLException {
		if (custNo != 0) {
			System.out.println(CustomerDAO.selectOneCust(custNo));
		}
	}

	// �ű� ȸ�� �Է�
	public static void addCustView(CustomerDTO cust) throws SQLException {
		if (CustomerDAO.insertNewCust(cust) == true) {
			System.out.println("�ű� ȸ�� �Է� �Ϸ�");
		} else {
			System.out.println("�Է� ����");
		}
	}

	// ȸ�� ��ȣ�� ��ȭ ��ȣ ����
	public static void updateCustView(int custId, int num) throws SQLException {
		if (CustomerDAO.updateNum(custId, num) == true) {
			System.out.println("ȸ�� ���� ���� �Ϸ�");
		} else {
			System.out.println("���� ����");
		}
	}

	// ȸ�� ���� ����
	public static void deleteCustView(int custId) throws SQLException {
		if (CustomerDAO.deleteCust(custId) == true) {
			System.out.println("ȸ�� ���� ���� �Ϸ�");
		} else {
			System.out.println("���� ����");
		}
	}
	
	// ��� �뿩 ���� ��ȸ
	public static void rentListView(ArrayList<RentDTO> rent) {
		int listSize = rent.size();
		if (listSize != 0) {
			int count = 1;
			for (RentDTO r : rent) {
				System.out.println((count++) + " - " + r);
			}
		} else {
			System.out.println("���� ����");
		}
	}

	// å ������� �뿩 ���� ��ȸ
	public static void rentView(String bookName) throws SQLException {
		if (bookName != null) {
			System.out.println(RentDAO.selectOneRent(bookName));
		}
	}
	
	// �뿩 ���� ���� Ȯ��
	
	public static void checkRent(int bookNo) throws SQLException {
		if (RentDAO.checkRent(bookNo) == true) {
			System.out.println("�뿩 ����");
		} else {
			System.out.println("�뿩 �Ұ�");
		}
	}
	
	// �ű� �뿩 ����
	public static void rentInsertView(RentDTO rent) throws SQLException {
		if (RentDAO.insertNewRent(rent) == true) {
			System.out.println("�뿩 �Ϸ�");
		} else {
			System.out.println("�뿩 �Ұ�");
		}
	}
	
	// ���� �޼��� ���
	public static void showError(String msg) {
		System.out.println(msg);
	}
	
	
}