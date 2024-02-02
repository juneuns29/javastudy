package day05;

/*
	
*****
*****
*****
*****
*****

를 출력해보자.
 */
public class Test01_for_star {

	public static void main(String[] args) {
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				// 가로로 *을 다섯번 출력
				System.out.print("*");
			}
			// 줄바꿈을 해줘야 한다.
			// *****
			// 
			System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				// 가로로 *을 다섯번 출력
				if(i == j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			// 줄바꿈을 해줘야 한다.
			// *****
			// 
			System.out.println();
		}
		System.out.println();
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				// 가로로 *을 다섯번 출력
				if(i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			// 줄바꿈을 해줘야 한다.
			// *****
			// 
			System.out.println();
		}
	}

}
