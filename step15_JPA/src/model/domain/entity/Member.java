package model.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "member_id")
	private long memberid;
	
	@NonNull
	@Column(nullable = false)
	private String name;
	
	// step02 - step01의 문제점 해결
	@NonNull
	@ManyToOne(fetch = FetchType.LAZY) // 지연로딩 설정
//	@OneToMany
	@JoinColumn(name = "team_id") // Team table의 team_id값 참조 설정(fk)
//	@Column(name = "team_id")
	private Team teamId;
	
	// step01 논리적 오류
//	@NonNull
//	@Column(name = "team_id")
//	private long teamId;
	
}
