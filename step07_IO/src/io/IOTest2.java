
package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class IOTest2 {
	// 2�ܰ� - file�� ���� ������ 	read�ؼ� ���ο� ���Ϸ� ���(file upload ����)
	// @Test
	public void ioTest() {
		BufferedReader in = null;
		BufferedWriter out = null;
		
		try {
			in = new BufferedReader(new FileReader("poem.txt"));
			// ������ ���� ��� ���� ����, �̹� �����ϴ� ��� ���� ����
			out = new BufferedWriter(new FileWriter("playdata.txt"));
			String data = null;
			while((data = in.readLine()) != null) {
				out.write(data); // new line ������
				out.newLine(); // new line �ݿ� �޼ҵ�
				
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in != null) {
					in.close(); // �ڿ���ȯ - ��� �ս�
					in = null; // heap���� �޸� ȸ�� ��û�ϴ� ����
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
	
	// 3�ܰ� - �ǽð� Ű���� �Է��� ������ file�� ���

	//�ǽð� �Է��ϴ� �����͸� file�� ��� 
	@Test
	public void ioTest2() {
		BufferedReader in = null;  //buffer + 2byte
		BufferedWriter out = null;
		
		try {
			// in = new BufferedReader(new FileReader("poem.txt"));
			/* System.in - Ű����
			 * 1byte�� read -> 2byte �Է� API�� ȣȯ�ϱ� ���ؼ��� 
			 * ��ȯ �۾� �ʼ� : InputStreamReade ��ü ����
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