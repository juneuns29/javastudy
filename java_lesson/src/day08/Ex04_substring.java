package day08;

public class Ex04_substring {

	public static void main(String[] args) {
		String blackpink = "Black Pink";
		/*
			substring() 를 이용해서 한글자씩 추출해서 출력하세요.
		 */
		
		String str = "";
		for(int i = 0 ; i < blackpink.length() ; i++ ) {
			if(i >= blackpink.length() - 1) {
				str = blackpink.substring(i);
			} else {
				str = blackpink.substring(i, i + 1);
			}
			System.out.print(str);
		}
		
	}

}
