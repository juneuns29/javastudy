package day08;

import java.util.Arrays;

public class Ex03_deepCopy {

	public static void main(String[] args) {
		String blackpink = "Black Pink";
		/*
			문제 ]
				위 문자열을 문자배열로 바꾸고
				만들어진 문자배열과 같은 크기의 배열을 만든 후
				공백을 기준으로 문자들을 바꿔서 배열에 저장하세요.
				
				깊은 복사로 해결하세요.
				System.arraycopy()
		 */
		
		char[] before;
		char[] after;
		int idx = blackpink.indexOf(' ');
		
		String tmp = blackpink.substring(0, idx);
		before = tmp.toCharArray();
		
		after = blackpink.substring(idx + 1).toCharArray();
		
		char[] result = new char[blackpink.length()];
		result[after.length] = ' ';
		
		System.arraycopy(after, 0, result, 0, after.length);
		// 앞 문자열 뒤로 보내기
		System.arraycopy(before, 0, result, after.length + 1, before.length);
		
		for(char c : result) {
			System.out.print(c);
		}
		System.out.println();
	}

}
