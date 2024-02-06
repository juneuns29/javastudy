package day06;

/*
	while 반복문으로 해결하세요.
0.
*****
*****
*****
*****
*****

1.
*	------------ (0, 0)
**	------------ (1, 0) (1, 1)
***
****
*****	-------- (4, 0)(4, 1)(4, 2)(4, 3)(4, 4)

2.				갯수	i
*****	-------- 5		0
****	-------- 4		1
***		-------- 3		2
** 		-------- 2		3
*		-------- 1		4

3.
    *
   **
  ***
 ****
*****


4. 
11111
22222
33333
44444
55555

*/
public class Ex04_while_star {

	public static void main(String[] args) {
		int i = 0 ;
		System.out.println("# 0.");
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				System.out.print("*");
				j = j+1;
			}
			System.out.println();
			i = i + 1;
		}
		
		System.out.println();
		System.out.println("# 1.");
		
		// i 초기화
		i = 0;
		while(i < 5) {
			// 아래 반복문에서 사용할 카운터 변수 만들고
			int j = 0;
			while(j <= i) {
				System.out.print("*"); // 별출력
				j = j + 1; // j 값 1 증가
			}
			System.out.println(); // 한행이 출력이 끝났으므로 줄바꿈해준다.
			i = i + 1; // i 값 1 증가
		}
		
		System.out.println();
		System.out.println("# 2.");
		
		// i 초기화
		i = 0; 
		while(i < 5) { // 다섯 행을 진행할 예정
			// 카운터 변수 j 만들고
			int j = 0;
			while(j < 5 - i) {
				// 별 출력
				System.out.print("*");
				// j 증가
				j += 1;
			}
			// 줄바꿈
			System.out.println();
			// i 증가시키고
			i += 1;
		}
		
		System.out.println();
		System.out.println("# 3.");
		// i 초기화
		i = 0; 
		while(i < 5) { // 다섯 행을 진행할 예정
			// 카운터 변수 j 만들고
			int j = 0;
			while(j < 4 - i) {
				// 공백 출력
				System.out.print(" ");
				// j 증가
				j += 1;
			}
			
			j = 0;
			while(j <= i) {
				System.out.print("*"); // 별출력
				j = j + 1; // j 값 1 증가
			}
			// 줄바꿈
			System.out.println();
			// i 증가시키고
			i += 1;
		}
		
		System.out.println();
		System.out.println("# 3 - 1.");
		// i 초기화
		i = 0;
		while(i < 5) {
			int j = 0 ; 
			while(j < 5) {
				String str = "*";
				if(j < 4 - i) {
					str = " ";
				}
				
				// 처리한 내용 출력
				System.out.print(str);
				j += 1;
			}
			System.out.println(); // 줄바꿈
			i += 1;
		}
		
		System.out.println();
		System.out.println("# 4.");
		// i 초기화
		i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				System.out.printf("%2d", i + 1);
				j += 1;
			}
			// 줄바꿈
			System.out.println();
			// i 증가
			i = i + 1;
		}
		
		System.out.println();
		System.out.println("# 4 - 1.");
		// i 초기화
		i = 0;
		while(i < 5) {
			int j = 0;
			while(j < 5) {
				/*
					
				j	0 1 2 3 4
					
					1 2 3 4 5
					2 3 4 5 6 
					3 4 5 6 7
				 */
				System.out.printf("%2d", i + 1 + j);
				j += 1;
			}
			// 줄바꿈
			System.out.println();
			// i 증가
			i = i + 1;
		}
		
	}

}
