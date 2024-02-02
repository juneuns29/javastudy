package day05;

/*

1.
*
**
***
****
*****

2.
*****
****
***
**
*

3.
    *
   **
  ***
 ****
*****

4.
     *			------ 5
    ***			------ 6
   *****		------ 7
  *******
 *********

5. 
11111
22222
33333
44444
55555

6.
01234
12345
23456
34567
45678

7.
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25

8. 
  5  4  3  2  1
 10  9  8  7  6
 15 14 13 12 11
 20 19 18 17 16
 25 24 23 22 21

 */
public class Ex01_star {

	public static void main(String[] args) {
		// 1.
		System.out.println("1.");
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
			(0,0) 
			(1,0)(1,1)
			(2,0)(2,1)(2,2)
			(3,0)(3,1)(3,2)(3,3)
			(4,0)(4,1)(4,1)(4,3)(4,4)
		 */
		System.out.println();
		// 2.
		System.out.println("2.");
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 - i ; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		// 3.
		System.out.println("3.");
		for(int i = 0 ; i < 5 ; i++ ) {
			for(int j = 0 ; j < 5 ; j++ ) {
				char ch = ' ';
				if(j >= 4-i) {
					ch = '*';
				}
				System.out.print(ch);
			}
			System.out.println();
		}
		
	}

}
