package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RentDTO {
	// 변수 선언
	private int rentNo;
	private String rentDate;
	private int bookNo;
	private String bookName;
	private int customerId;
	private String customerName;
	
	
	
		@Builder(builderMethodName = "rentDTOBuilder")
		public RentDTO(int rentNo, String rentDate, int bookNo, String bookName, int customerId, String customerName) {
			super();
			this.rentNo = rentNo;
			this.rentDate = rentDate;
			this.bookNo = bookNo;
			this.bookName = bookName;
			this.customerId = customerId;			
			this.customerName = customerName;	
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("대여 번호 : ");
			builder.append(rentNo);
			builder.append(" | 대여일 : ");
			builder.append(rentDate);
			builder.append(" | 도서 번호 : ");
			builder.append(bookNo);
			builder.append(" | 도서 제목 : ");
			builder.append(bookName);
			builder.append(" | 회원 번호 : ");
			builder.append(customerId);
			builder.append(" | 회원명 : ");
			builder.append(customerName);	
			return builder.toString();
		}
		
	}
