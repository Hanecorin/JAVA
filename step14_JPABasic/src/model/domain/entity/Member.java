/*
create table Member (
	member_id bigint not null auto_increment, 
	name varchar(10), 
	team_id bigint, 
	primary key (member_id)
) engine=InnoDB

+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| member_id | bigint      | NO   | PRI | NULL    | auto_increment |
| name      | varchar(10) | YES  |     | NULL    |                |
| team_id   | bigint      | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+-------
 */

package model.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	@Column(name="member_id")
	private long memberId;

	@NonNull
	@Column(length = 10)
	private String name;
	
	@NonNull
	@Column(name="team_id")   
	private long teamId;
	
}