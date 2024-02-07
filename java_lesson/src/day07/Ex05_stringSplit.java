package day07;

/*
	주어진 문자열을 공백을 기준으로 분리해서
	단어의 위치를 바꿔서 
	새로운 문장을 만들어서 출력하세요.
	
	참고 함수 ]
		문자열.substring(시작위치)	:	문자열의 시작위치에서 부터 마지막까지 추출해주는 함수
		문자열.substring(시작위치, 종료위치) : 시작위치에서부터 종료위치 직전까지 추출해주는 함수
		
		문자열.charAt(위치값) : 문자열의 해당위치의 문자를 꺼내주는 함수
		
	* 공백 검색은 반복문을 이용해서 처리하세요.

 */
public class Ex05_stringSplit {

	public static void main(String[] args) {
//		System.out.println("Hello".charAt(0));
		String blackPink = "Black Pink"; // ==> "Pink Black"
		String result = "";
		int idx = 0;
		
		// 공백문자 위치 확인
		for(int i = 0 ; i < blackPink.length(); i++ ) {
			char ch = blackPink.charAt(i);
			if(ch == ' ') {
				// 공백문자를 꺼낸경우
				idx = i;
				// 찾는 작업을 완료했으므로 반복을 종료
				break;
			}
		}
		
		// 문자열 자른다.
		String front = blackPink.substring(0, idx);
		String after = blackPink.substring(idx + 1);
		
		result = after + " " + front;
		
		// 결과 출력
		System.out.printf("원본 문자열 [ %s ]를 공백을 기준으로 위치를 바꾸면\n" + 
							"[ %s ] 가 됩니다.", blackPink, result);
	}

}
