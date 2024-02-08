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
public class Ex02_01 {

	public static void main(String[] args) {
		double pi = 3.14;
		double[][] circle = new double[3][5];
		
		// 반지름 입력하고 - circle[0][0 ~ 4]
		for(int i = 0 ; i < 5 ; i++ ) {
//			int r = (int)(Math.random()*20 + 1);
			circle[0][i] = (int)(Math.random()*20 + 1);
		}
		// 둘레 계산해서 입력하고
		for(int i = 0 ; i < 5 ; i++ ) {
//			double d = 2 * pi * circle[0][i];
			circle[1][i] = 2 * pi * circle[0][i];
		}
		// 넓이 계산해서 입력하고
		for(int i = 0 ; i < 5 ; i++ ) {
			circle[2][i] = circle[0][i] * circle[0][i] * pi;
		}
		// 꺼내서 출력하고
//		System.out.println(Arrays.toString(circle));
		// Arrays.toString() 함수는 1차원 배열의 경우는 기억된 데이터를 문자열로 보여주지만
		// 2차원 이상의 배열들은 기억하는 것이 배열의 주소이므로
		// 주소만 보여준다.
		for(int i = 0 ; i < 5 ; i++ ) {
			System.out.printf("반지름 : %2.0f, 둘레 : %6.2f, 넓이 : %7.2f\n", circle[0][i], circle[1][i], circle[2][i]);
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		
		double[][] won = new double[5][3];
		
		for(int i = 0 ; i < 3 ; i++ ) {
			/*
			double r1 = circle[0][0];
			double r2 = circle[0][1];
			double r3 = circle[0][2];
			double r4 = circle[0][3];
			double r5 = circle[0][4];
			
			won[0][0] = r1;
			won[1][0] = r2;
			won[2][0] = r3;
			won[3][0] = r4;
			won[4][0] = r5;
			
			double d1 = circle[1][0];
			double d2 = circle[1][1];
			double d3 = circle[1][2];
			double d4 = circle[1][3];
			double d5 = circle[1][4];
			
			won[0][1] = d1;
			won[1][1] = d2;
			won[2][1] = d3;
			won[3][1] = d4;
			won[4][1] = d5;
			*/
			for(int j = 0 ; j < 5 ; j++ ) {
				won[j][i] = circle[i][j];
			}
		}
		
		// 출력
		for(int i = 0 ; i < 5 ; i++ ) {
			System.out.printf("반지름 : %2.0f, 둘레 : %6.2f, 넓이 : %7.2f\n", 
												won[i][0], won[i][1], won[i][2]);
		}
	}

}
