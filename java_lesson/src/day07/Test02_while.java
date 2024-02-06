package day07;

/*
	2x + 4y = 10
	을 만족하는 
	x와 y의 조합들을 출력하세요.
 */
public class Test02_while {

	public static void main(String[] args) {
		// 할일
		// x가 정해질때 y를 증가시켜가면서 결과가 10되는지 확인해간다.
		int x = 0;
		while(x < 6) { // x를 증가시킬 반복문
			int y = 0;
			while(y < 3) { // y를 증가시킬 반복문
				if(2 * x + 4 * y == 10) {
					// 결과 출력
					System.out.printf("2x * 4y = 10 을 만족하는 " +
										"x와 y의 조합은 (%d, %d) 입니다.\n", x, y);
					break;
				}
				y = y + 1;
			}
			x = x + 1;
		}
	}

}
