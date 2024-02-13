package day10;

/*
	랜덤하게 반지름을 만들어서
	원의 둘레와 넓이를 계산해서 출력하세요.
	각 기능은 함수로 처리하세요.
	
	PI값은 3.14로 하기로 한다.
 */
public class Test05_Method {
	
	// 반지름 만들어주는 함수
	public int getRad() {
		int rad = (int)(Math.random()*20 + 1);
		return rad;
	}
	
	// 둘레 계산해주는 함수
	public double getArround(int rad) {
		double result = 2 * 3.14 * rad;
		return result;
	}
	
	// 넓이 계산해주는 함수
	public double getArea(int rad) {
		// 결과값 변수
		double result = rad * rad * 3.14;
		// 반환해주고
		return result;
	}
	
	/*
		*****
		함수는 호출하지않으면 절대로 실행되지 않는다.
	 */
	public static void main(String[] args) {
		Test05_Method t1 = new Test05_Method();
		// ==> 함수들을 사용할 준비만 해놓은 상태
		// 반지름만들고
		int rad = t1.getRad();
		// 둘레 계산하고
		double arround = t1.getArround(rad);
		// 넓이 계산하고
		double area = t1.getArea(rad);
		// 출력하고
		System.out.printf("반지름을 [ %2d ] 로 하는 원의 둘레는 [ %5.2f ] 이고 면적은 [ %6.2f ] 입니다.", rad, arround, area);
	}

}
