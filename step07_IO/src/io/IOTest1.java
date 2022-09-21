//1단계 - file(poem.txt)로 부터 데이터 read(System.out)해서 콘솔에 출력
/*
 * 발생 가능한 경우의 수(고려사항)
 */
package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		// poem.txt 파일로 read 기능의 객체 생성
		try {
			// step02 - buffer 기능
			BufferedReader in = new BufferedReader(new FileReader("poem.txt"));
			// while 반복문으로 file내용을 read하여 콘솔에 출력
			String data = in.readLine();
			
			while (data != null) {
				System.out.println(data);
				data = in.readLine();
			}
			
			
			
			// step01 - FileReader는 file로 부터 단순 read 기능
			/* 메소드가 한글자 씩
			 * 
			 */
			System.out.println(in.read()); // 49324
			
			/*
			 * char v = '사'; // 16bit 문자형
			 * int i = v; // 32bit 정수형
			 * System.out.println(i);
			 */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
