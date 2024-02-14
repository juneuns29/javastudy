package day11;

/*
	속성으로 면적만 0.0으로 가지는 Figure 클래스를 만들고
	이 클래스를 상속받는 Semo 클래스를 정의해서 
	Semo의 정보를 출력해보세요.
 */
public class Test02_extends {

	public Test02_extends() {
		Semo samgak = new Semo(10, 5);
		System.out.println(samgak);
		
		Figure f = samgak;
		System.out.println(f);
		
		Semo semo = (Semo)f;
		System.out.println(semo);
		
		Figure f1;
		f1 = new Semo(3, 5);
		
		f1 = new Nemo(4, 10);
		
		Figure[] fig = new Figure[5];
		
		fig[0] = new Semo(3, 10);
		fig[1] = new Nemo(4, 20);
	}

	public static void main(String[] args) {
		new Test02_extends();
	}

}
