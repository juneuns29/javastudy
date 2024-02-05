package day06;

public class Test02_sort {

	/*
		오름차순 정렬하기
	 */
	public static void main(String[] args) {
		int[] nos = {5, 2, 7, 3, 1, 9, 6, 8, 0, 4};
		System.out.println("*** 정렬 전 ***");
		// 출력
		for(int num : nos) { // 향상된 for 명령(forEach 명령)
			System.out.print(num + ", ");
		}
		System.out.println(); // 줄바꿈
		
		// 정렬하기
		for(int i = 0 ; i < nos.length - 1 ; i++ ) { // i < 9 와 같은 의미
			// 비교대상 꺼내기
			for(int j =  i + 1 ; j < nos.length ; j++ ) {
				if(nos[i] > nos[j]) {
					// 원본 주소 기억시켜 놓고
					int tmp = nos[i];
					// 비교대상이 더 작은 경우
					nos[i] = nos[j];
					nos[j] = tmp;
				}
			}
		}
		

		System.out.println("### 정렬 후 ###");
		// 출력
		for(int num : nos) {
			System.out.print(num + ", ");
		}
		System.out.println(); // 줄바꿈
	}

}
