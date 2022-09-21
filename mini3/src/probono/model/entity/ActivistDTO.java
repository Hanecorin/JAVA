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
@Entity(name = "Activist")
public class ActivistDTO {
	@Id
	@Column(name = "activist_id")
	@NonNull
	private String id;
	
	@Column
	@NonNull
	private String name;
	
	@Column
	@NonNull
	private String password;

	@Column
	@NonNull
	private String major;

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("1. 기부자 ID : ");
		builder.append(id);
		builder.append(" 2. 기부자 이름 : ");
		builder.append(name);
		builder.append(" 3. 기부자 비밀번호 : ");
		builder.append(password);
		builder.append(" 4. 재능 기부 분야 : ");
		builder.append(major);
		return builder.toString();
	}
	
}