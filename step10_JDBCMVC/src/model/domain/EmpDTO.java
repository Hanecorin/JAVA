/*
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| empno    | int          | NO   | PRI | NULL    |       |
| ename    | varchar(20)  | YES  |     | NULL    |       |
| job      | varchar(20)  | YES  |     | NULL    |       |
| mgr      | smallint     | YES  |     | NULL    |       |
| hiredate | date         | YES  |     | NULL    |       |
| sal      | decimal(7,2) | YES  |     | NULL    |       |
| comm     | decimal(7,2) | YES  |     | NULL    |       |
| deptno   | int          | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
*/

package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmpDTO {  //new EmpDTO(1234, "SMITH", "CLERK", 7902, "1980-12-17", 800.0, 20, 30));
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private double sal;
	private double comm;
	private int deptno;
}
