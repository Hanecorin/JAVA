package step01.util;

import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

public class SetTest {
	
	@Test
	public void m1() {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(1 + " " + set.size());
		System.out.println(2 + " " + set.isEmpty());
		
		set.add(1);
		set.add(1); //기존 1삭제하고 저장
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(3 + " " + set.size());
		System.out.println(4 + " " + set.isEmpty());
		System.out.println(5 + " " + set.contains(3));  // new Integer(3)
		System.out.println(6 + " " + set.contains(13));  // new Integer(13)
		
		
		System.out.println(set.toString());  //[1, 2, 3, 4]  set.toString()
		
		/* set 구조로 저장된 데이터를 하나씩 뽑기 위한 절차
		 * 데이터들을 열거 -> 열거된 데이터 존재 여부 확인 -> 데이터가 있으면 뽑아서 활용
		 * 데이터들을 열거(Iterator)
		 * 	 -> 열거된 데이터 존재 여부 확인(hasNext())
		 * 		 -> 데이터가 있으면 뽑아서 활용(next())
		 * 
		 *  public Iterator<E> iterator(){}
		 */
		Iterator<Integer> all = set.iterator();
		while( all.hasNext() ) {
			System.out.println(all.next());
		}
	}
	
}