package day03;

/*
	소수이하 네자리 이상되는 숫자를 입력받아서(Scanner 사용)
	소수이하 셋째자리에서 반올림한 숫자를 만들어서 출력해주는 
	프로그램을 작성하세요.
	
	힌트 ]
		+ 0.005 해주고
		세째자리 이하는 지워야 한다.
			숫자 * 100 ==> 정수로 만든다.
			그 정수를 / 100.
 */

import java.util.*;
public class Ex06 {
	public static void main(String[] args) {
		// 할일
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("소수이하 세자리 이상 숫자 입력 : ");
		// 입력받아 기억하고
		double num = sc.nextDouble();
		/*
			키보드로 입력한 내용은 버퍼메모리에 기억이되고
			꺼내오는 순간 메모리에서 지워진다.
		 */
		// 계산해서 결과 만들고
//		double result = (int)((num + 0.005) * 100) / 100.0 ;
		double result = (int)(num * 100 + 0.5) / 100.0 ;
		double tmp = (int)((num * 1000 + 5) / 10 ) / 100.0;
		// 출력
		System.out.println("입력한 실수 : " + num);
		System.out.println("반올림한 실수1 : " + result);
		System.out.println("반올림한 실수2 : " + tmp);
	}
}
