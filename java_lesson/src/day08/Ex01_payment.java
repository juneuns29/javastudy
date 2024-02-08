package day08;

import java.util.Arrays;

public class Ex01_payment {

	public static void main(String[] args) {
		int[] coin = {
			10000, 5000, 1000, 500, 100, 50, 10, 1	
		};
		
		int[] pay = new int[coin.length];
		/*
		 	1.
			 	79456원을 지불하려하는데
			 	위에 준비된 화폐단위로 몇장씩 지불해야 하는지
			 	계산해서 출력해주는 프로그램을 작성하세요.
		 	
		 	2.
		 		지불될 화폐 장 수를 기억할 배열을 만들어서
		 		채우고 내용을 출력하세요.
		 */
		
		int money = 79456;
		int calc = money;
		/*
		for(int i = 0 ; i < coin.length ; i++ ) {
			int qt = calc / coin[i];
			System.out.printf("%5d : %2d\n", coin[i], qt);
			calc = calc % coin[i];
		}
		
		for(int i = 0 ; i < coin.length ; i++ ) {
			pay[i] = calc / coin[i];
			calc = calc % coin[i];
		}
		
		// 출력
		for(int i = 0 ; i < coin.length ; i++ ) {
			System.out.printf("%6d : %2d\n", coin[i], pay[i]);
		}
		 */
		
		// 보너스
		// 이차원 배열에 기억시켜서 해보자.
		int[][] payment = new int[2][coin.length];
		// 이 배열은 int배열을 관리하는 배열
		
		payment[0] = coin;
		payment[1] = pay;
		
		System.out.println();
		for(int i = 0 ; i < payment[0].length ; i++ ) {
			System.out.printf("%6d : %2d\n", payment[0][i], payment[1][i]);
		}
		
		/*
		// 얕은 복사 확인
		coin[coin.length - 1] = 50000;
		// 내용 확인
		System.out.println("coin : " + Arrays.toString(coin));
		System.out.println("payment[0] : " + Arrays.toString(payment[0]));
		*/
		System.out.println("******************************************************");
		
		int[][] jibool = new int[2][coin.length];
		// coin 깊은 복사
		System.arraycopy(coin, 0, jibool[0], 0, coin.length);
		
		/*
		jibool[0][coin.length - 1] = 50000;
		
		// 내용 확인
		System.out.println("coin : " + Arrays.toString(coin));
		System.out.println("jibool : " + Arrays.toString(jibool[0]));
		*/
		
		for(int i = 0 ; i < jibool[0].length ; i++ ) {
			int qt = calc / jibool[0][i];
			jibool[1][i] = qt;
			// 다음 화폐 계산을 위해서 변경해준다.
			calc = calc % jibool[0][i];
		}
		
		// 출력
		for(int i = 0 ; i < jibool[0].length ; i++ ) {
			System.out.printf("%6d : %2d\n", jibool[0][i], jibool[1][i]);
		}
		System.out.println("******************************************************");
		
		// 별로 표현
		for(int i = 0 ; i < jibool[0].length ; i++ ) {
			System.out.printf("%6d : %2d - ", jibool[0][i], jibool[1][i]);
			for(int j = 0 ; j < jibool[1][i] ; j++ ) {
				// 화폐장수만큼 반복해준다.
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
