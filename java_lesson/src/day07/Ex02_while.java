package day07;

/*
	1 - 2 + 3 - 4 + 5 - 6 + ..... 로 진행할 경우
	결과가 100을 넘어서는 숫자는 몇인지 출력하세요.
	
	힌트 ]
		1 * -1 	====> -1
		-1 * -1 ====> 1
		
		-1 * -1 ===> 1 
		1 * -1  ===> -1
		-1 * -1 ===> 1
		...
 */
public class Ex02_while {

	public static void main(String[] args) {
		// 부호 변수
		int buho = -1;
		int sum = 0;
		int no = 1;
		while(true) {
			buho = buho * -1;
			sum = sum + no * buho;
			if(sum > 100) {
				// 100을 넘어서는 순간이므로 반복을 즉시 종료한다.
				break;
			}
			no++;
		}
		
		// 결과 출력
		System.out.printf("[ %d ] 까지의 합이 [ %3d ] 로 처음 100을 넘어서게 된다.", no, sum);
	}

}
