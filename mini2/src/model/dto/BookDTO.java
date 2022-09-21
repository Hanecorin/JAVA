package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
	// ���� ����
	private int bookNo;
	private String bookName;
	private String writer;
	private String publisher;
	private int inventory;
	
	
	
		@Builder(builderMethodName = "bookDTOBuilder")
		public BookDTO(int bookNo, String bookName, String writer, String publisher, int inventory) {
			super();
			
			this.bookNo = bookNo;
			this.bookName = bookName;
			this.writer = writer;
			this.publisher = publisher;
			this.inventory = inventory;
			
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("���� ��ȣ : ");
			builder.append(bookNo);
			builder.append(" | ���� ���� : ");
			builder.append(bookName);
			builder.append(" | ���� : ");
			builder.append(writer);
			builder.append(" | ���ǻ� : ");
			builder.append(publisher);
			builder.append(" | ��� : ");
			builder.append(inventory);			
			return builder.toString();
		}
		
	}
