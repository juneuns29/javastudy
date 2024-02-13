package day09;

public class Ex02_semo {
/*
	삼각형의 정보를 기억할
	Semo 클래스를 제작하고 --- V
	이 클래스를 이용해서
	10개의 삼각형을 기억하고 정보를 출력하세요.
 */
	public static void main(String[] args) {
		Semo[] semos = new Semo[10];
		// Semo 클래스를 10개 기억할 방만 준비되어있는 상태
		// 따라서 매 방마다 Semo를 만들어서 채워줘야 한다.
		for(int i = 0 ; i < 10 ; i++ ) {
			semos[i] = new Semo();
		}
		/*
		for(Semo s : semos) {
			System.out.printf("밑변 : %2d, 높이 : %2d, 넓이 : %5.1f\n", 
						s.width, s.height, s.area
					);
		}
		*/
		Semo[] samgak = new Semo[10];
		// 열개의 세모를 만들어서 채워넣는다.
		for(int i = 0 ; i < 10 ; i++ ) {
			// 밑변과 높이를 랜덤하게 만들고
			int width = (int)(Math.random()*20 + 1);
			int height = (int)(Math.random()*20 + 1);
			// 세모를 밑변과 높이를 입력해서 만들어서 채워준다.
			samgak[i] = new Semo(width, height);
		}
		// 출력
		for(Semo s : samgak) {
			System.out.printf("밑변 : %2d, 높이 : %2d, 넓이 : %5.1f\n", 
					s.width, s.height, s.area
					);
		}
	}

}
