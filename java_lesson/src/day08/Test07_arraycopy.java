package day08;

public class Test07_arraycopy {

	public static void main(String[] args) {
		// 1 ~ 20 까지의 랜덤한 숫자 10를 만들어서 배열에 기억시켜보자.
		int[] num = new int[10];
		
		// 랜덤한 숫자로 채워본다.
		for(int i = 0 ; i < 10 ; i++ ) {
			int n = (int)(Math.random()*20 + 1);
			num[i] = n;
		}
		
		System.out.print("num : | ");
		for(int n : num) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		// 깊은 복사
		// 1. 배열을 준비
		int[] no = new int[5];
		// 2. 복사한다.
		System.arraycopy(num, 1, no, 0, 5);
		
		System.out.print("no : | ");
		for(int n : no) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		System.out.println("---------------------------------------------");
		// num의 세번째 데이터를 수정
		num[2] = 100;
		// num 배열 출력
		System.out.print("num : | ");
		for(int n : num) {
			System.out.print(n + " | ");
		}
		System.out.println();
		
		// no 배열 출력
		System.out.print("no : | ");
		for(int n : no) {
			System.out.print(n + " | ");
		}
		System.out.println();
	}

}
