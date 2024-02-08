package day08;

import java.util.*;

public class Ex05_calculator {
/*
	연산식을 입력하면 계산해서 결과를 출력해주는 프로그램을 작성하세요.
	단, 연산식의 내용을 문자 배열로 변환해서 처리하세요.
 */
	public static void main(String[] args) {
		char[] buho = {'+', '-', '*', '/', '%'};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계산식 : ");
		
		String str = sc.nextLine();
		sc.close();
		char[] sik = str.toCharArray();
		
		int idx = -1;
		// 연산기호 위치 추출
		for(int i = 0 ; i < buho.length ; i++ ) {
			int tmp = str.indexOf(buho[i]);
			if(tmp != -1) {
				idx = tmp;
				break;
			}
		}
		
		/*
		for(int i = 0 ; i < sik.length ; i++ ) {
			if(sik[i] < '0' || sik[i] > '9') {
				idx = i;
				break;
			}
		}
		*/
		
		// 숫자 만들고
		// 앞자리 숫자
		int front = 0;
		for(int i = 0 ; i < idx ; i++ ) {
			front = front * 10 + (sik[i] - '0');
		}
		
		// 뒷자리 숫자
		int back = 0;
		for(int i = idx + 1 ; i < sik.length ; i++ ) {
			back = back * 10 + (sik[i] - '0');
		}
		
		char giho = sik[idx];
		// 결과 변수
		double result = 0;
		switch(giho) {
		case '+':
			result = front + back;
			break;
		case '-':
			result = front - back;
			break;
		case '*':
			result = front * back;
			break;
		case '/':
			result = (double) front / back;
			break;
		case '%':
			result = front % back;
			break;
		}
		
		// 출력
		System.out.print("입력받은 연산식 [ ");
		for(int i = 0 ; i < sik.length; i++ ) {
			System.out.print(sik[i] + " ");
		}
		System.out.printf("] 의 결과는 [ %.2f ] 입니다.", result);
	}

}
