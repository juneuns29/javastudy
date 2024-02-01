package day03;

/*
	문제 3 ]
		1 ~ 10 까지의 랜덤한 정수 두개(밑변, 높이)를 만들어서
		삼각형의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
		
		공식 ] 
			삼각형면적 = 밑변 * 높이 / 2.0;
 */
public class Ex03 {
	public static void main(String[] args) {
		int width = (int)(Math.random()*(10 - 1 + 1) + 1);
		int height = (int)(Math.random()*(10 - 1 + 1) + 1);
		
		double area = width * height / 2.0 ;
		
		System.out.printf("밑변이 %2d 이고 높이가 %2d 인 삼각형의 넓이는 %4.1f 입니다.", 
									width, height, area);
	}
}
