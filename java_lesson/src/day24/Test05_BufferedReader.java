package day24;

import java.io.*;
public class Test05_BufferedReader {
/*
	byte 단위 기본스트림에
	char 단위 보조스트림을 연결해서 
	 Test02_FileReader.java
	파일을 읽어보자.
 */
	public Test05_BufferedReader() {
		// 바이트단위 기본스트림 준비
		FileInputStream fin = null;
		// 연결 스트림 준비
		InputStreamReader tmp = null;
		// 문자단위 보조스트림 준비
		BufferedReader br = null;
		
		try {
			// 스트림 만들고
			fin = new FileInputStream("src/day24/Test02_FileReader.java");
			// 연결 스트림
			tmp = new InputStreamReader(fin);
			// 보조스트림
			br = new BufferedReader(tmp);
			
			while(true) {
				// 읽고
				String line = br.readLine();
				if(line == null) {
					// 읽기 작업이 끝난 상황
					break;
				}
				// 출력하고
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				tmp.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05_BufferedReader();
	}

}
