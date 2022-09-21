package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RentDTO {
	// ���� ����
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
			builder.append("�뿩 ��ȣ : ");
			builder.append(rentNo);
			builder.append(" | �뿩�� : ");
			builder.append(rentDate);
			builder.append(" | ���� ��ȣ : ");
			builder.append(bookNo);
			builder.append(" | ���� ���� : ");
			builder.append(bookName);
			builder.append(" | ȸ�� ��ȣ : ");
			builder.append(customerId);
			builder.append(" | ȸ���� : ");
			builder.append(customerName);	
			return builder.toString();
		}
		
	}
