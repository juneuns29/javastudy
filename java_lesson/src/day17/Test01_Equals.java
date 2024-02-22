package day17;

public class Test01_Equals {
/*
	Figure를 상속받아서
	반지름, 넓이, 둘레를 가지는 클래스를 7개 채우는 배열을 완성하세요.
	단, 중복은 없도록 채우세요. 
 */
	public Test01_Equals() {
		Figure[] fig = new Figure[7];
		
	}

	public static void main(String[] args) {
		new Test01_Equals();
		
/*
		Figure[] f = new Figure[5];
		// 무명 내부 클래스로 객체 채우기
		for(int i = 0 ; i < 5 ; i++ ) {
			f[i] = new Figure(){
				@Override
				public double setArea() {
					return 0;
				}
				@Override
				public int getRad() {
					return 0;
				}
			};
		}
		
		for(Figure ff : f) {
			System.out.println(ff.getRad());
		}
*/
	}
	
	public class Circle implements Figure {
		private int rad;
		private double area, arround;
		public Circle() {}
		public Circle(int rad) {
			this.rad = rad;
			setArround();
			setArea();
		}
		
		@Override
		public double setArea() {
			return rad * rad * 3.14;
		}
		@Override
		public int getRad() {
			return rad;
		}
		public double getArea() {
			return area;
		}
		public void setArea(double area) {
			this.area = area;
		}
		public double getArround() {
			return arround;
		}
		public void setArround() {
			arround = 2 * rad * 3.14;
		}
		public void setArround(double arround) {
			this.arround = arround;
		}
		public void setRad(int rad) {
			this.rad = rad;
		}
		
	}
}

interface Figure {
	double setArea();
	int getRad();
//	boolean equals(Object o);
}
