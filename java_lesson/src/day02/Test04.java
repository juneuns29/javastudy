package day02;

public class Test04 {
	public static void main(String[] args) {
		int num = 10;
		String str = "제니";
		boolean bool = true;
		System.out.println(num + 1 + " : " + str); // ==> 11 : 제니
		// 이 경우 처음 나오는 + 의 경우만 산술연산자 이고
		// 1 다음의 + 기호는 뒤에 오는 문자열과 결합하는 결합연산자로 작동한다.
		System.out.println("--------------------");
		System.out.println(str + " : " + num + 1);
		// 1. 제니 : ==> 결합연산
		// 2. 제니 : 10==> 결합연산
		// 3. 제니 : 101==> 결합연산
		System.out.println(str + " : " + (num + 1));
		// (num + 1) ==> 산술연산
		// 나머지 + 는 모두 문자열 데이터가 만들어지기 때문에 결합연산자로 작동한다.
		// ==> 제니 : 11
		System.out.println("boolean : " + bool);
		// 참고 ] 자바의 경우 논리형 데이터로 0, 1을 절대로 사용하지 않는다.
		// ==> boolean : true
		System.out.println(bool + " : result");
		// true : result
		
	}
}
