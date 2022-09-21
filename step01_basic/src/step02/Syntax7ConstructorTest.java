/*
 * User(){} - new User();
 * User(String id){} - new User("tester")
 * User(String id, String name){} - new User("tester", "홍길동")
 * User(String id, String name, int age){} - new User("tester", "홍길동", 30)
 */

package step02;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
class User {
	@NonNull // 반드시 값을 초기화 하는 강제 설정
	private String id;
	@NonNull
	private String name;
	private int age;
}

public class Syntax7ConstructorTest {

	public static void main(String[] args) {
		User u1 = new User();
//		User u2 = new User("tester");
		User u3 = new User("tester", "홍길동", 30);
		User u4 = new User("tester", "홍길동");

	}

}
