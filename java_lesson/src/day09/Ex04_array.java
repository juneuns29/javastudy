package day09;

import java.util.Arrays;

public class Ex04_array {

/*
	1.
		다섯학생들의 
		국어, 영어, 수학, 총점
		을 관리할 배열을 만들고
		데이터를 채워서
		정보를 출력하세요.
	2.
		위배열을 깊은복사해서 순위가 추가된 배열을 만들고
		
	3. 
		순위를 채워서
		오름차순 정렬하세요.
 */
	public static void main(String[] args) {
		int[][] stud1 = new int[5][4];
		
		for(int i = 0 ; i < stud1.length ; i++ ) {
			for(int j = 0 ; j < stud1[0].length - 1 ; j++ ) {
				int score = (int)(Math.random()*41 + 60);
				stud1[i][j] = score;
				stud1[i][3] += score;
			}
		}
		
		for(int[] s : stud1) {
			System.out.println(Arrays.toString(s));
		}
		
		int[][] stud = new int[5][5];
	}

}
