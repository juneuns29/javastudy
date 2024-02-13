package day09;

public class Semo {
	int width; // 밑변
	int height; // 높이
	double area; // 면적
	
	// 기본생성자
	public Semo() {
		
	}
	// 밑변과 높이를 입력받아서 객체를 만드는 생성자
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		calcArea(); // == area = width * height * 0.5;
	}
	
	// 면적 계산해서 셋팅해주는 함수
	public void calcArea() {
		area = width * height * 0.5;
	}
}
