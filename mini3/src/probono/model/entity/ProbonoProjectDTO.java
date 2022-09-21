package probono.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "probono_project")
@Entity
public class ProbonoProjectDTO {
	
	@Id
	@Column(name = "probono_project_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int probonoProjectId;
	
	@Column(name = "probono_project_name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "probono_id")
	private ProbonoDTO probonoId;
	
	@ManyToOne
	@JoinColumn(name = "activist_id")
	private ActivistDTO activistId; 
	
	@ManyToOne
	@JoinColumn(name = "recipient_id")
	private RecipientDTO receiveId;
	
	@Column(name = "project_content")
	private String content;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 프로젝트 ID : ");
		builder.append(probonoProjectId);
		builder.append(" 2. 프로보노 프로젝트명 : ");
		builder.append(name);
		builder.append(" 3. 프로보노 정보 : ");
		builder.append(probonoId);
		builder.append(" 4. 재능 기부자 정보 : ");
		builder.append(activistId);
		builder.append(" 5. 수혜자 정보 : ");
		builder.append(receiveId);
		builder.append(" 6. 프로젝트 제공내용 : ");
		builder.append(content);
		return builder.toString();
	}
}