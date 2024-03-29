package day07;

/*
	10개의 피보나치 수열(Fibonacci Numbers)의 숫자를 출력하세요.
 */
public class Test04_Fibonacci {

	public static void main(String[] args) {
		// 두 숫자의 변수 준비
		int no1 = 1;
		int no2 = 1;
		
		System.out.print("| ");
		System.out.print(no1 + " | ");
		System.out.print(no2 + " | ");
		for(int i = 0; i < 8 ; i++ ) {
			int result = no1 + no2;
			System.out.print(result + " | ");
			no1 = no2;
			no2 = result;
		}
	}

}
