package day21;

import java.io.*;
import java.util.*;
public class Test05_Properties_out {

	public Test05_Properties_out() {
		// 학생 정보를 Map에 기억시켜서 파일로 저장해보자.
		Properties map = new Properties(); // 이것은 맵이다.
		map.put("name", "choppa");
		map.put("kor", "70");
		map.put("eng", "65");
		map.put("math", "95");
		
//		System.out.println("국어점수 :  " + map.get("kor"));
		
		// 맵이 완성됬으니 파일로 저장해보자.
		FileOutputStream fout = null;
		try {
			// 내보낼 파일에 연결 작업
			fout = new FileOutputStream("src/day21/choppa_score.properties"); 
			
			// 맵의 내용을 파일에 저장
			map.store(fout, "* 파일의 맨 위쪽 주석문에 해당하는 내용 입력하는 부분...");
			System.out.println("파일 저장 완료~~~!");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05_Properties_out();
	}

}
