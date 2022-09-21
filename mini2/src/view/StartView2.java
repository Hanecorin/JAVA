package view;


import java.util.Scanner;

import controller.Controller;
import model.dto.BookDTO;
import model.dto.CustomerDTO;
import model.dto.RentDTO;

public class StartView2 {
	public static class StartView {

		public static void main(String[] args) throws Exception {

			LoginView.loginStartView();
			
			Scanner input = new Scanner(System.in);
			boolean run = true;
	
									
			while (run) {
				System.out.println("\ninfo");
				System.out.println("\n      1. ���� ���� ������ | 2. ȸ�� ���� ������ | 3. �뿩 ���� ������ | 4. ����       ");
				System.out.println("\n");
				System.out.print("��ȣ ���� : ");
				int select = input.nextInt();
				switch (select) {
				
				case 1:
					boolean run1 = true;
					while (run1) {
						System.out.println("\ninfo");
						System.out.println("\n 1. ��� ���� ���� | 2. ���� ��ȣ �˻� | 3. �ű� ���� ���� �Է� | 4. ���� ��� ���� | 5. ���� ���� ���� | 6. ���ư��� ");
						System.out.println("\n");
						System.out.print("��ȣ ���� : ");
						int select1 = input.nextInt();
						switch (select1) {
						
						case 1:
							System.out.println("------------------------------");
							Controller.getAllBooks();
							break;
							
						case 2:
							System.out.print("��ȸ ��� ���� ��ȣ �Է� : ");
							int bookNo = 0;
							try {
								bookNo = input.nextInt();
								System.out.println("------------------------------");
								Controller.getBook(bookNo);
							} catch (Exception e) {
								System.out.println("Ÿ�� ����");
								input.nextLine();
							}							
							break;
							
						case 3:
							System.out.println("�ű� ���� ��ȣ �Է� : ");
							int nb1 = input.nextInt();
							System.out.println("���� ���� �Է� : ");
							String nb2 = input.next();
							System.out.println("���� �Է�: ");
							String nb3 = input.next();
							System.out.println("���ǻ� �Է� : ");
							String nb4 = input.next();
							System.out.println("��� �Է� : ");
							int nb5 = input.nextInt();
							System.out.println("------------------------------");
							Controller.addBook(new BookDTO(nb1, nb2, nb3, nb4, nb5));
							Controller.getAllBooks();
							break;
							
						case 4:
							System.out.println("���� ��� ���� ��ȣ �Է� : ");
							int ab1 = input.nextInt();
							System.out.println("���� ��� �Է� : ");
							int ab2 = input.nextInt();
							System.out.println("------------------------------");
							System.out.println("���� ��");
							Controller.getBook(ab1);
							Controller.updateBook(ab1, ab2);
							Controller.getBook(ab1);
							break;
							
						case 5:
							System.out.println("���� ��� ���� ��ȣ �Է� : ");
							int db = input.nextInt();
							System.out.println("------------------------------");
							Controller.deleteBook(db);
							Controller.getAllBooks();
							break;
							
						case 6:
							System.out.println("�޴�");
							run1 = false;
							break;
						}
					}break;
					
				case 2:
					boolean run2 = true;
					while (run2) {
						System.out.println("\ninfo");
						System.out.println(" 1. ��� ȸ�� ���� | 2. ȸ�� ��ȣ �˻� | 3. �ű� ȸ�� �Է� | 4. ȸ�� ����ó ���� | 5. ȸ�� ���� ���� | 6. ���ư��� ");
						System.out.println("\n");
						System.out.print("��ȣ ���� : ");
						int select2 = input.nextInt();
						switch (select2) {
						
						case 1:
							System.out.println("------------------------------");
							Controller.getAllCust();
							break;
							
						case 2:
							System.out.print("��ȸ ��� ȸ�� ��ȣ �Է� : ");
							int customerId = input.nextInt();
							System.out.println("------------------------------");
							Controller.getCust(customerId);
							break;
							
						case 3:
							System.out.println("�ű� ȸ�� ��ȣ �Է� : ");
							int nc1 = input.nextInt();
							System.out.println("ȸ�� �̸� �Է� : ");
							String nc2 = input.next();
							System.out.println("ȸ�� ����ó �Է� : ");
							int nc3 = input.nextInt();
							System.out.println("------------------------------");
							Controller.addCust(new CustomerDTO(nc1, nc2, nc3));
							Controller.getAllCust();
							break;
							
						case 4:

							System.out.println("���� ��� ȸ�� ��ȣ �Է� : ");
							int ac1 = input.nextInt();
							System.out.println("���� ����ó �Է� : ");
							int ac2 = input.nextInt();
							System.out.println("------------------------------");
							System.out.println("���� ��");
							Controller.getCust(ac1);
							Controller.updateCust(ac1, ac2);
							Controller.getCust(ac1);
							break;
							
						case 5:
							System.out.println("���� ��� ȸ�� ��ȣ �Է� : ");
							int dc = input.nextInt();
							System.out.println("------------------------------");
							Controller.deleteCust(dc);
							Controller.getAllCust();
							break;
							
						case 6:
							System.out.println("�޴�");
							run2 = false;
							break;
						}
					}break;
					
				case 3:
					boolean run3 = true;
					while (run3) {
						System.out.println("\ninfo");
						System.out.println(" 1. ��� �뿩 ���� ��ȸ | 2. �������� �뿩 ���� ��ȸ | 3. �뿩 ���� Ȯ�� | 4. �ű� �뿩 ���� �Է� | 5. ���ư��� ");
						System.out.println("\n");
						System.out.print("��ȣ ���� : ");
						int select3 = input.nextInt();
						switch (select3) {
						
						case 1:
							System.out.println("------------------------------");
							Controller.getAllRent();
							break;
							
						case 2:
							input.nextLine();
							System.out.print("��ȸ ��� ���� ���� �Է� : ");
							String bookName = input.nextLine();
							System.out.println("------------------------------");
							Controller.getRent(bookName);
							break;
							
						case 3:
							System.out.print("��ȸ ��� ���� ��ȣ �Է� : ");
							int bookNo = input.nextInt();
							System.out.println("------------------------------");
							Controller.checkRent(bookNo);
							break;
							
						case 4:
							input.nextLine();
							System.out.println("�ű� �뿩 ��ȣ �Է� : ");
							int nr1 = input.nextInt();
							System.out.println("�뿩 ���� �Է� : ");
							String nr2 = input.next();
							System.out.println("���� ��ȣ �Է� : ");
							int nr3 = input.nextInt();
							input.nextLine();
							System.out.println("���� ���� �Է� : ");
							String nr4 = input.nextLine();
							System.out.println("ȸ�� ��ȣ �Է� : ");
							int nr5 = input.nextInt();
							System.out.println("ȸ�� �̸� �Է� : ");
							String nr6 = input.next();
							System.out.println("------------------------------");
							System.out.println("[�뿩 ��]");
							Controller.getAllRent();
							Controller.getBook(nr3);
							System.out.println("\n[�뿩 ��]");
							Controller.addRent(new RentDTO(nr1, nr2, nr3, nr4, nr5, nr6));
							Controller.getAllRent();
							Controller.getBook(nr3);
							break;
											
						case 5:
							System.out.println("�޴�");
							run3 = false;
							break;
						}
					}break;
					
				case 4:
					System.out.println("���α׷� ����");
					run = false;
					break;
				}
			}input.close();
		}
	}
}
