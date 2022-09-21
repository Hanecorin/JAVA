package model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookDTO {
	// 변수 선언
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
			builder.append("도서 번호 : ");
			builder.append(bookNo);
			builder.append(" | 도서 제목 : ");
			builder.append(bookName);
			builder.append(" | 저자 : ");
			builder.append(writer);
			builder.append(" | 출판사 : ");
			builder.append(publisher);
			builder.append(" | 재고 : ");
			builder.append(inventory);			
			return builder.toString();
		}
		
	}
