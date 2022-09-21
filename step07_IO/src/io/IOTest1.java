//1�ܰ� - file(poem.txt)�� ���� ������ read(System.out)�ؼ� �ֿܼ� ���
/*
 * �߻� ������ ����� ��(�������)
 */
package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		// poem.txt ���Ϸ� read ����� ��ü ����
		try {
			// step02 - buffer ���
			BufferedReader in = new BufferedReader(new FileReader("poem.txt"));
			// while �ݺ������� file������ read�Ͽ� �ֿܼ� ���
			String data = in.readLine();
			
			while (data != null) {
				System.out.println(data);
				data = in.readLine();
			}
			
			
			
			// step01 - FileReader�� file�� ���� �ܼ� read ���
			/* �޼ҵ尡 �ѱ��� ��
			 * 
			 */
			System.out.println(in.read()); // 49324
			
			/*
			 * char v = '��'; // 16bit ������
			 * int i = v; // 32bit ������
			 * System.out.println(i);
			 */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
