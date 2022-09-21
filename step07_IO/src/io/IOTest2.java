
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class IOTest2 {
	// 2단계 - file로 부터 데이터 	read해서 새로운 파일로 출력(file upload 개념)
	// @Test
	public void ioTest() {
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("poem.txt"));
			// 파일이 없는 경우 새로 생성, 이미 존재하는 경우 덮어 쓰기
			out = new BufferedWriter(new FileWriter("playdata.txt"));
			String data = null;
			while((data = in.readLine()) != null) {
				out.write(data); // new line 미적용
				out.newLine(); // new line 반영 메소드
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close(); // 자원반환 - 기능 손실
					in = null; // heap에서 메모리 회수 요청하는 로직
				}
				if(out != null) {
						out.close();
						out = null;
				}	
			}catch(IOException e) {
				e.printStackTrace();
				}
		}
	}
	
	// 3단계 - 실시간 키보드 입력한 내용을 file에 출력

	//실시간 입력하는 데이터를 file에 출력 
	@Test
	public void ioTest2() {
		BufferedReader in = null;  //buffer + 2byte
		BufferedWriter out = null;
		
		try {
			// in = new BufferedReader(new FileReader("poem.txt"));
			/* System.in - 키보드
			 * 1byte씩 read -> 2byte 입력 API와 호환하기 위해서는 
			 * 변환 작업 필수 : InputStreamReade 객체 생성
			 * 
			 */
			in = new BufferedReader(new InputStreamReader(System.in));
			
			out = new BufferedWriter(new FileWriter("playdata.txt", true));
			
			String data = null;
			while(  ( data = in.readLine() ) != null  ) {
				out.write(data);  
				out.newLine();  
			} 
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close(); 
					in = null; 
				}
				
				if(out != null) {
					out.close();
					out = null;
				}
			}catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

}