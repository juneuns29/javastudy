package day11;

public class Nemo extends Figure {
	public int width, height;
	
	public Nemo() {} // 기본 생성자
	
	// 가로와 세로를 입력해서 객체를 만들 수 있는 생성자
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = width * height;
	}
	
	@Override
	public String toString() {
		String result = "가로가 " + width + " 이고 세로가 " + 
						height + " 이고 면적이 " + area + " 인 사각형";
		return result;
	}
}
