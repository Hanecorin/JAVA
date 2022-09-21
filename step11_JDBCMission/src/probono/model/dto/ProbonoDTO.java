/*
CREATE TABLE probono (
       probono_id          	VARCHAR2(50) PRIMARY KEY,
       probono_name      VARCHAR2(50) NOT NULL,
       probono_purpose  	VARCHAR2(200) NOT NULL
);  */
package probono.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class ProbonoDTO {
	private String probonoId;
	private String probonoName;
	private String probonoPurpose;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("���κ��� ���� 1. ���κ��� ���̵� = ");
		builder.append(probonoId);
		builder.append(" 2. ���κ��� �̸� : ");
		builder.append(probonoName);
		builder.append(" 3. ���κ��� ���� : ");
		builder.append(probonoPurpose);
		return builder.toString();
	}
}