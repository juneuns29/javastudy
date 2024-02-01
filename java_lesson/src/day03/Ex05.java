package day03;

/*
	화씨 온도 100도는 섭씨 온도 몇도인지를 출력해주는 프로그램을 작성하세요.
	
	참고 ]
		섭씨온도 = 5 / 9 x (화씨온도 - 32)
 */
public class Ex05 {
	public static void main(String[] args) {
		double fe = 100;
		double cel = 5 / 9.0 * (fe - 32);
		
		System.out.printf("화씨 온도 %4.1f 는 섭씨온도 %4.1f 입니다.", fe, cel);
	}
}
