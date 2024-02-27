package day19;

public class Semo {
	private int width, height;
	private double area;
	public Semo() {
	}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	// 면적은 입력되어있는 밑변과 높이를 이용해서 계산해서 셋팅하는 함수
	public void setArea() {
		area = width * height * 0.5;
	}
	// 입력된 값으로 면적을 셋팅해주는 함수
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "^^^ 세모\n\t넓이 : " + area + "\n\t밑변 : " + width + 
						"\n\t높이 : " + height;
	}
}
