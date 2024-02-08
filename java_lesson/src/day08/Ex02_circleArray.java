package day08;

import java.util.Arrays;

/*
	1.
		반지름(1 ~ 20) 5개를 기억할 배열을 만들고
		랜덤하게 반지름을 채워서
		원의 넓이, 둘레를 출력하는 프로그램을 작성하세요.
	
	2. 
		double[][] circle = new double[3][5];
		의 배열에
			반지름,
			둘레,
			넓이
		를 기억시키고 출력하세요.
		
		
	3. 
		2번에서 완성한 2차원 배열을
		
			double[][] dongl = new double[5][3];
			
		dongl 배열에 채워넣으세요.
		
 */
public class Ex02_circleArray {

	public static void main(String[] args) {
		/*
			1.
				반지름(1 ~ 20) 5개를 기억할 배열을 만들고
				랜덤하게 반지름을 채워서
				원의 넓이, 둘레를 출력하는 프로그램을 작성하세요.
		 */
		// 반지름 기억할 배열 준비
		int[] rad = new int[5];
		
		// 반지름을 랜덤하게 만들어서 채워준다.
		for(int i = 0 ; i < 5 ; i++ ) {
			// 랜덤한 반지름 만들고
			int r = (int)(Math.random()*20 + 1);
			// 만들어진 반지름 채우고
			rad[i] = r;
		}
		
		// 원의 둘레 계산해서 출력
		// 		공식 ]  2 * 3.14 * 반지름
		for(int i = 0 ; i < 5 ; i++ ) {
			int r = rad[i];
			double pi = 3.14;
			// 넓이 계산
			double arround = 2 * pi * r;
			// 계산결과 출력
			System.out.printf("반지름 : %2d, 둘레 : %6.2f\n", r, arround);
		}
		System.out.println("***********************************************************");
		System.out.println();
		double[] arround = new double[5];
		for(int i = 0 ; i < 5 ; i++ ) {
			int r = rad[i];
			double pi = 3.14;
			double ar = 2 * pi * r;
			// i번째 반지름으로 계산한 결과를
			// i번째 둘레에 채워준다.
			arround[i] = ar;
		}
		
		// 결과 출력
		for(int i = 0 ; i < 5 ; i++ ) {
			int r = rad[i];
			double ar = arround[i];
			System.out.printf("반지름 : %2d, 둘레 : %6.2f\n", r, ar);
		}
		
		System.out.println("***********************************************************");
		// 넓이
		double pi = 3.14;
		for(int i = 0 ; i < 5 ; i++ ) {
			// 반지름 꺼내고
			int r = rad[i];
			// 넓이 계산하고
			double area = r * r * pi;
			// 출력하고
			System.out.printf("반지름 : %2d, 넓이 : %6.2f\n", r, area);
		}
		// 넓이를 배열에 채워보자.
		// 넓이 기억할 배열 준비
		double[] area = new double[5];
		// 계산해서 넓이 채우고
		for(int i = 0 ; i < 5 ; i++ ) {
			int r = rad[i];
			double myunjuk = r * r * pi;
			area[i] = myunjuk;
		}
		
		System.out.println("********************* 면적 배열 출력 **********************");
		for(int i = 0 ; i < 5 ; i++ ) {
			// 반지름
			int r = rad[i];
			// 면적
			double myunjuk = area[i];
			// 출력
			System.out.printf("반지름 : %2d, 넓이 : %6.2f\n", r, myunjuk);
		}
		
		// 2차원 배열에 기억시켜보자.
		double[][] won = new double[3][5];
		double[] banjirm = new double[5];
		// rad 배열의 int 데이터를 하나씩 꺼내서 위 배열에 채워준다.
		for(int i = 0 ; i < 5 ; i++ ) {
			//  반지름 꺼내고
			int r = rad[i];
			// 채워주고
			banjirm[i] = r;
		}
		
		// 필요한 1차원 배열이 모두 준비 됬으므로
		// won 배열에 채워준다.
		won[0] = banjirm;
		won[1] = arround;
		won[2] = area;
		
		// 출력
		for(int i = 0 ; i < 5 ; i++ ) {
			// 필요한 데이터 꺼내고
			// 반지름
			double r = won[0][i];
			// 둘레
			double d = won[1][i];
			// 넓이
			double a = won[2][i];
			// 출력
			System.out.printf("반지름 : %2.0f, 둘레 : %6.2f, 넓이 : %7.2f\n", r, d, a);
		}
	}
}
