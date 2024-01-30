package day02;

/*
	PI 를 기억할 변수를 float 형태로 만들고
	이것을 이용해서
		반지름이 5
		원의 넓이
		둘레
	를 계산해서 1. 출력하세요.
	
	bonus ]
		2. 넓이와 둘레를 정수로 출력하세요.
	
 */
public class Ex02 {
	public static void main(String[] args) {
		int rad = 5;
		float PI = 3.14f;
		System.out.println(3.14f * 10);
		System.out.println("넓이 : " + (int)(PI * rad * rad));
	}
}
