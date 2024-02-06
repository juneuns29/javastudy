package day07;

/*
	다섯자리 숫자를 입력받아서
	이 숫자가 회문수 인지 아닌지 판별해서 출력하세요.
	
	참고 ]
		회문수 
			12321 ===> 회문수
			12312 ===> 회문수 아님
			
	문자열로 해결하고
	정수로 해결하고
	배열로도 해결하고
	
	힌트 1 ]
		12345
		
		45 ==> 54
		앞자리 두수 를 떼어내서 ==> 54
		
	힌트 2 ]
		
		0 * 10 + 5 			===> 5
			12345 % 10 		===> 5
			12345 / 10 		===> 1234
			
		5 * 10 + 4			===> 54
			1234 % 10  		===> 4
			1234 / 10  		===> 123
			
		54 * 10 + 3			===> 543
			123 % 10  		===> 3
			123 / 10  		===> 12
			
		543 * 10 + 2		===> 5432
			12 % 10  		===> 2
			12 / 10  		===> 1
			
		5432 * 10 + 1		===> 54321
			1 % 10  		===> 1
			1 / 10  		===> 0
 */
import java.util.*;
public class Ex01 {

	public static void main(String[] args) {
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		// 메세지
		System.out.print("다섯자리 숫자 입력 : ");
		
		/*
		// 입력받고
		String sno = sc.nextLine();
		sc.close();
		// 반복해서 처리
		// 계산 변수
		String msg = "";
		int lastIndex = sno.length() - 1;
		for(int i = 0 ; i < sno.length(); i++ ) {
			
			msg += sno.charAt(lastIndex - i);
			System.out.println("***** " + msg);
		}
		*/
		
		/*
		// 결과 출력
		if(msg.equals(sno)) {
			System.out.println("입력받은 숫자 " + sno + " 는 회문수 입니다.");
		} else {
			System.out.println("입력받은 숫자 " + sno + " 는 회문수가 아닙니다.");
		}
		*/
		
		/*
		int no = Integer.parseInt(sno);
		int result = Integer.parseInt(msg);
		
		if(no == result) {
			System.out.println("입력받은 숫자 " + sno + " 는 회문수 입니다.");
		} else {
			System.out.println("입력받은 숫자 " + sno + " 는 회문수가 아닙니다.");
		}
		*/
		
		/*
		// 입력받고
		String sno = sc.nextLine();
		sc.close();
		
		boolean result = true;
		for(int i = 0 ; i < sno.length() ; i++ ) {
			
//				12341
//				==>
//					앞 		뒤
//					1		1
//					2		4
			
			char before = sno.charAt(i);
			char after = sno.charAt(4 - i); 
			// == char after = sno.charAt(sno.length() - 1 - i);
			if(before != after) {
				// 다른 숫자가 있는 경우
				result = false;
				break;
			}
		}
		// 결과 출력
		if(result) {
//		if(result == true) {
			System.out.println("입력받은 숫자 " + sno + " 는 회문수 입니다.");
		} else {
			System.out.println("입력받은 숫자 " + sno + " 는 회문수가 아닙니다.");
		}
		 */
		
	}

}
