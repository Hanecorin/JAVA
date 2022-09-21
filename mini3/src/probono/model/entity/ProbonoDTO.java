/*
CREATE TABLE probono (
       probono_id          	VARCHAR2(50) PRIMARY KEY,
       probono_name      VARCHAR2(50) NOT NULL,
       probono_purpose  	VARCHAR2(200) NOT NULL
);  */
package probono.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "Probono")
public class ProbonoDTO {
	@Id
	@Column(name = "probono_id")
	private String id;
	
	@Column(name = "probono_name")
	private String name;
	
	@Column(name = "probono_purpose")
	private String purpose;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 프로보노 ID : ");
		builder.append(id);
		builder.append(" 2. 프로보노 이름 : ");
		builder.append(name);
		builder.append(" 3. 프로보노 목적 : ");
		builder.append(purpose);
		return builder.toString();
	}
}