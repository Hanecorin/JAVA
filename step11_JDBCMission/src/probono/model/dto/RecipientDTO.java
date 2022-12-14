/*CREATE TABLE recipient (
       recipient_id         VARCHAR2(20) PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       receiveHopeContent   VARCHAR2(50) NULL
); */

package probono.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RecipientDTO extends People {
	private String receiveContent;
	
	@Builder(builderMethodName = "recipientDTOBuilder")
	public RecipientDTO(String id, String name, String password, String receiveContent) {
		super(id, name, password);
		this.receiveContent = receiveContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" 4. 제공받는 대상자가 제공받는 서비스 : ");
		builder.append(receiveContent);
		return builder.toString();
	}
}