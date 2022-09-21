/*CREATE TABLE recipient (
       recipient_id         VARCHAR2(20) PRIMARY KEY,
       name                 VARCHAR2(20) NULL,
       password             VARCHAR2(20) NULL,
       receiveHopeContent   VARCHAR2(50) NULL
); */

package probono.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "Recipient")
public class RecipientDTO {
	@Id
	@Column(name = "recipient_id")
	@NonNull
	private String id;
	
	@Column
	@NonNull
	private String name;
	
	@Column
	@NonNull
	private String password;
	
	@Column(name = "receiveHopeContent")
	@NonNull
	private String content;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 수혜자 ID : ");
		builder.append(id);
		builder.append(" 2. 수혜자 이름 : ");
		builder.append(name);
		builder.append(" 3. 수혜자 비밀번호 : ");
		builder.append(password);
		builder.append(" 4. 수혜 내용 : ");
		builder.append(content);
		return builder.toString();
	}
}