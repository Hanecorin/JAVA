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
				System.out.println("\n      1. 도서 정보 데이터 | 2. 회원 정보 데이터 | 3. 대여 정보 데이터 | 4. 종료       ");
				System.out.println("\n");
				System.out.print("번호 선택 : ");
				int select = input.nextInt();
				switch (select) {
				
				case 1:
					boolean run1 = true;
					while (run1) {
						System.out.println("\ninfo");
						System.out.println("\n 1. 모든 도서 정보 | 2. 도서 번호 검색 | 3. 신규 도서 정보 입력 | 4. 도서 재고 변경 | 5. 도서 정보 삭제 | 6. 돌아가기 ");
						System.out.println("\n");
						System.out.print("번호 선택 : ");
						int select1 = input.nextInt();
						switch (select1) {
						
						case 1:
							System.out.println("------------------------------");
							Controller.getAllBooks();
							break;
							
						case 2:
							System.out.print("조회 대상 도서 번호 입력 : ");
							int bookNo = 0;
							try {
								bookNo = input.nextInt();
								System.out.println("------------------------------");
								Controller.getBook(bookNo);
							} catch (Exception e) {
								System.out.println("타입 에러");
								input.nextLine();
							}							
							break;
							
						case 3:
							System.out.println("신규 도서 번호 입력 : ");
							int nb1 = input.nextInt();
							System.out.println("도서 제목 입력 : ");
							String nb2 = input.next();
							System.out.println("저자 입력: ");
							String nb3 = input.next();
							System.out.println("출판사 입력 : ");
							String nb4 = input.next();
							System.out.println("재고량 입력 : ");
							int nb5 = input.nextInt();
							System.out.println("------------------------------");
							Controller.addBook(new BookDTO(nb1, nb2, nb3, nb4, nb5));
							Controller.getAllBooks();
							break;
							
						case 4:
							System.out.println("수정 대상 도서 번호 입력 : ");
							int ab1 = input.nextInt();
							System.out.println("수정 재고량 입력 : ");
							int ab2 = input.nextInt();
							System.out.println("------------------------------");
							System.out.println("수정 전");
							Controller.getBook(ab1);
							Controller.updateBook(ab1, ab2);
							Controller.getBook(ab1);
							break;
							
						case 5:
							System.out.println("삭제 대상 도서 번호 입력 : ");
							int db = input.nextInt();
							System.out.println("------------------------------");
							Controller.deleteBook(db);
							Controller.getAllBooks();
							break;
							
						case 6:
							System.out.println("메뉴");
							run1 = false;
							break;
						}
					}break;
					
				case 2:
					boolean run2 = true;
					while (run2) {
						System.out.println("\ninfo");
						System.out.println(" 1. 모든 회원 정보 | 2. 회원 번호 검색 | 3. 신규 회원 입력 | 4. 회원 연락처 변경 | 5. 회원 정보 삭제 | 6. 돌아가기 ");
						System.out.println("\n");
						System.out.print("번호 선택 : ");
						int select2 = input.nextInt();
						switch (select2) {
						
						case 1:
							System.out.println("------------------------------");
							Controller.getAllCust();
							break;
							
						case 2:
							System.out.print("조회 대상 회원 번호 입력 : ");
							int customerId = input.nextInt();
							System.out.println("------------------------------");
							Controller.getCust(customerId);
							break;
							
						case 3:
							System.out.println("신규 회원 번호 입력 : ");
							int nc1 = input.nextInt();
							System.out.println("회원 이름 입력 : ");
							String nc2 = input.next();
							System.out.println("회원 연락처 입력 : ");
							int nc3 = input.nextInt();
							System.out.println("------------------------------");
							Controller.addCust(new CustomerDTO(nc1, nc2, nc3));
							Controller.getAllCust();
							break;
							
						case 4:

							System.out.println("수정 대상 회원 번호 입력 : ");
							int ac1 = input.nextInt();
							System.out.println("변경 연락처 입력 : ");
							int ac2 = input.nextInt();
							System.out.println("------------------------------");
							System.out.println("수정 전");
							Controller.getCust(ac1);
							Controller.updateCust(ac1, ac2);
							Controller.getCust(ac1);
							break;
							
						case 5:
							System.out.println("삭제 대상 회원 번호 입력 : ");
							int dc = input.nextInt();
							System.out.println("------------------------------");
							Controller.deleteCust(dc);
							Controller.getAllCust();
							break;
							
						case 6:
							System.out.println("메뉴");
							run2 = false;
							break;
						}
					}break;
					
				case 3:
					boolean run3 = true;
					while (run3) {
						System.out.println("\ninfo");
						System.out.println(" 1. 모든 대여 내역 조회 | 2. 제목으로 대여 내역 조회 | 3. 대여 가능 확인 | 4. 신규 대여 정보 입력 | 5. 돌아가기 ");
						System.out.println("\n");
						System.out.print("번호 선택 : ");
						int select3 = input.nextInt();
						switch (select3) {
						
						case 1:
							System.out.println("------------------------------");
							Controller.getAllRent();
							break;
							
						case 2:
							input.nextLine();
							System.out.print("조회 대상 도서 제목 입력 : ");
							String bookName = input.nextLine();
							System.out.println("------------------------------");
							Controller.getRent(bookName);
							break;
							
						case 3:
							System.out.print("조회 대상 도서 번호 입력 : ");
							int bookNo = input.nextInt();
							System.out.println("------------------------------");
							Controller.checkRent(bookNo);
							break;
							
						case 4:
							input.nextLine();
							System.out.println("신규 대여 번호 입력 : ");
							int nr1 = input.nextInt();
							System.out.println("대여 일자 입력 : ");
							String nr2 = input.next();
							System.out.println("도서 번호 입력 : ");
							int nr3 = input.nextInt();
							input.nextLine();
							System.out.println("도서 제목 입력 : ");
							String nr4 = input.nextLine();
							System.out.println("회원 번호 입력 : ");
							int nr5 = input.nextInt();
							System.out.println("회원 이름 입력 : ");
							String nr6 = input.next();
							System.out.println("------------------------------");
							System.out.println("[대여 전]");
							Controller.getAllRent();
							Controller.getBook(nr3);
							System.out.println("\n[대여 후]");
							Controller.addRent(new RentDTO(nr1, nr2, nr3, nr4, nr5, nr6));
							Controller.getAllRent();
							Controller.getBook(nr3);
							break;
											
						case 5:
							System.out.println("메뉴");
							run3 = false;
							break;
						}
					}break;
					
				case 4:
					System.out.println("프로그램 종료");
					run = false;
					break;
				}
			}input.close();
		}
	}
}
