package day10;

/*
	가로와 세로를 입력받아서
	사각형의 넓이를 계산해서 출력해주는 프로그램을 작성하세요.
	각 기능은 함수를 만들어서 처리하세요.
 */
import java.util.*;
public class Ex01_Method {
	Scanner sc;
	int width, height, area;
	
	// 생성자
	public Ex01_Method() {
		sc = new Scanner(System.in);
	}
	
	// 가로 세로를 입력받아서 기억시키는 함수
	public void setLen() {
		// 메세지
		System.out.print("가로 : ");
		// 가로 입력받고
		width = sc.nextInt();
		// 메세지
		System.out.print("세로 : ");
		// 세로 입력받고
		height = sc.nextInt();
		// 사용이 끝난 자원은 반환해주고
		sc.close();
	}
	
	// 넓이 계산해서 셋팅해주는 함수
	public void setArea() {
		area = width * height;
	}
	
	// 사각형 정보를 출력해주는 함수
	public void toPrint() {
		System.out.printf("입력받은 가로 [ %d ] 와 세로 [ %d ] 로 하는 사각형의 넓이는 [ %d ] 입니다.\n", 
				width, height, area);
	}
	
	public static void main(String[] args) {
		Ex01_Method e1 = new Ex01_Method();
		e1.setLen();
		e1.setArea();
		e1.toPrint();
	}

}
