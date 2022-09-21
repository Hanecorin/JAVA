package model.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NonNull;

/*create table person(
	id int primary key AUTO_INCREMENT, 
	name varchar(10),
	age int
);
 * 
 */

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 10)
	private String name;
	
	private long age;
}
