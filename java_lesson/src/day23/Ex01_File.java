package day23;

import java.io.*;
public class Ex01_File {

	/*
		day22.Test02_File.java
		파일을 읽어서 준비된 변수에 모두 채워서 출력하세요.
	 */
	public Ex01_File() {
		// 스트림 준비
		FileInputStream fin = null;
		
		// 읽은 내용 기억할 변수
		
		// 1. 방법 1
		String result = "";
		
		// 2. 방법 2
		StringBuffer buffer = new StringBuffer(result);
		
		// 여기서부터 작업 시작
		try {
			// 스트림 초기화
			fin = new FileInputStream("src/day22/Test02_File.java");
			// 몇개를 읽어야 할지 모르므로 반복해서 처리한다.
			// 배열준비
			byte[] buff = new byte[256];
			
			while(true) {
				int len = fin.read(buff);
				if(len == -1) {
					// 읽은 데이터가 없는 경우
					break;
				}
				// 문자열로 변환
				String str = new String(buff, 0, len);
				/*
				// 1번 방법 : 문자열 누적
				result = result + str;
				*/
				
				// 2번 방법
				buffer.append(str);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch(Exception e) {}
		}
		
		// 결과 출력
//		System.out.println(result);
		
		// 2.
		System.out.println(buffer.toString());
	}

	public static void main(String[] args) {
		new Ex01_File();
	}

}
