package day06;

/*
	문제 2 ]
		1부터 n 까지 합한 결과중
		몇까지 더해야 100이 넘어서는지
		n을 찾아서 출력하세요. 합도 같이 출력하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		int sum = 0;
		int no = 0;
		/*
		// 1. for 명령
		for( ; sum < 100; ) {
			no += 1;
			sum = sum + no;
		}
		*/
		
		// 2. while 명령
		while(sum < 100) {
			no += 1;
			sum += no;
		}
		
		System.out.printf("1부터 n까지의 합중 처음 100이 넘어서는 순간은 %2d 까지의 합이고 합은 %3d 입니다.", no, sum);
	}

}
