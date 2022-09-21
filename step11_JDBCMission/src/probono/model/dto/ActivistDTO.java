/**
CREATE TABLE activist (
       activist_id          	VARCHAR2(20)  PRIMARY KEY,
       name               	VARCHAR2(20) NOT NULL,
       password         	VARCHAR2(20) NOT NULL,
       major                	VARCHAR2(50) NOT NULL
); */
package probono.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//Builder with inheritance : https://www.baeldung.com/lombok-builder-inheritance

@Getter
@Setter
public class ActivistDTO extends People{
	private String major;
	
	//ActivistDTO.activistDTOBuilder()
	@Builder(builderMethodName = "activistDTOBuilder")
	public ActivistDTO(String id, String name, String password, String major) {
		super(id, name, password);
		this.major = major;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(" 4. 재능 기부 분야 : ");
		builder.append(major);		
		return builder.toString();
	}
	
}