package day24;

/*
	기계어 처리는 반드시 바이트 단위로 처리해야 한다.
	여기서는 문자단위로 파일을 복사해보자.
 */
import java.io.*;
public class Test03_FileCopy {

	public Test03_FileCopy() {
		// 복사 작업이므로 읽어서 저장을 해야 한다.
		// 입력과 출력 두개의 스트림이 필요하다.
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day24/chopper.jpg");
			fw = new FileWriter("src/day24/chopper_01.jpg");
			
			// 문자 배열 준비
			char[] buff = new char[1024];
			// 몇번 반복할 지 알 수 없으므로...
			while(true) {
				// 읽는다.
				int len = fr.read(buff);
				if(len == -1) {
					// 읽은 데이터가 없는 경우
					break;
				}
				
				// 읽은 데이터를 내보낸다.
				fw.write(buff, 0, len);
			}
			System.out.println("### 파일 복사 완료 ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(Exception e) {}
			
		}
	}

	public static void main(String[] args) {
		new Test03_FileCopy();
	}

}
