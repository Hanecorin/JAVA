/*
CREATE TABLE probono_project (
	   probono_project_id     		NUMBER(5) PRIMARY KEY,
	   probono_project_name 		VARCHAR2(50) NOT NULL,
       probono_id           			VARCHAR2(50) NOT NULL,       
       activist_id          				VARCHAR2(20) NOT NULL,
       receive_id           				VARCHAR2(20) NOT NULL, 
       project_content      			VARCHAR2(100) NOT NULL
);   */

package probono.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ProbonoProjectDTO {
	private int probonoProjectId;
	private String probonoProjectName;
	private String probonoId;
	private String activistId; 
	private String receiveId;
	private String projectContent;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. ������Ʈ id : ");
		builder.append(probonoProjectId);
		builder.append(" 2. ���κ��� ������Ʈ�� : ");
		builder.append(probonoProjectName);
		builder.append(" 3. ���κ��� ���� : ");
		builder.append(probonoId);
		builder.append(" 4. ��� ����� ���� : ");
		builder.append(activistId);
		builder.append(" 5. ������ ���� : ");
		builder.append(receiveId);
		builder.append(" 6. ������Ʈ �������� : ");
		builder.append(projectContent);
		return builder.toString();
	}
}