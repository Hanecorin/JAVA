package step01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class StreamAPI5FlatMap {

	@Test
	public void step01() {
		List<String> teamKorea = Arrays.asList("��ȫ��", "ȫ��", "����ȯ");
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith");
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad");
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori");
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf");
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine");
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan");
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad");

		// List Ÿ�� ���ο� String��ü���� ������ List�� element�� ���� ����
		List<List<String>> playersInWorldCup2022 = new ArrayList<>();

		playersInWorldCup2022.add(teamKorea);
		playersInWorldCup2022.add(teamAustralia);
		playersInWorldCup2022.add(teamEngland);
		playersInWorldCup2022.add(teamNewZeland);
		playersInWorldCup2022.add(teamSouthAfrica);
		playersInWorldCup2022.add(teamWestIndies);
		playersInWorldCup2022.add(teamSriLanka);
		playersInWorldCup2022.add(teamPakistan);

//		System.out.println(playersInWorldCup2022);
		
		// step01
//		for(List<String> v : playersInWorldCup2022) {
//			System.out.println(v);
//			for(String name : v) {
//				System.out.println(name);
//			}
//		}
		
		// step02
		
		// flatMap()
		/*
		 * - Stream�� ���ο� Stream���� ��ȯ
		 * 
		*  - playersInWorldCup2022.stream()
		 *  	- Stream<List<String>> java.util.Collection.stream()
		 *  
		 *  - playersInWorldCup2022.stream().flatMap(l -> l.stream())
		 *  	-  Stream<String> java.util.stream.Stream.flatMap
		 *  
		 *  -  playersInWorldCup2022.stream().flatMap(l -> l.stream()).collect(
		 *  	-  List<String> java.util.stream.Stream.collect 
		 *  
		 *  [[��ȫ��, ȫ��, ����ȯ], [Warner, Watson, Smith], [Alex, Bell, Broad], [Kane, Nathan, Vettori], ...]
		 *  
		 */
		System.out.println(playersInWorldCup2022.stream().flatMap(l -> l.stream()).collect(Collectors.toList()));
		
		List<String> l2 = playersInWorldCup2022.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
		System.out.println(l2);
		
	}
	
}
