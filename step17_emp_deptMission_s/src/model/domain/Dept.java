package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Builder  
@Entity
public class Dept {
	@Id
	@Column
	private Long deptno;
	
	@Column
	private String dname;
	
	@Column
	private String loc;

}