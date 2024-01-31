package day03;

public class Test10 {
	public static void main(String[] args) {
		// 0에서 10 까지의 랜덤한 숫자 10개
		for(int i = 0 ; i < 10 ; i++ ) {
			int no1 = (int)(Math.random() * (10 - 0 + 1)) + 0;
			System.out.println("0 부터 10 까지의 랜덤한 숫자 :" + no1);
		}
		
		// -10에서 10 까지의 랜덤한 숫자 10개
		for(int i = 0 ; i < 10 ; i++ ) {
			int no1 = (int)(Math.random() * (10 - (-10) + 1)) + (-10);
			System.out.println("-10 부터 10 까지의 랜덤한 숫자 :" + no1);
		}
	}
}
