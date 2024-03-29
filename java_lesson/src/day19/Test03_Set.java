package day19;

import java.util.*;
public class Test03_Set {

	public Test03_Set() {
		HashSet set = new HashSet();
		/*
			HashSet에 추가되는 참조형 데이터는
			중복처리를 하려면
			equals()와 hashCode()를 오버라이드 해줘야 된다.
		 */
		
		set.add(new Circle(5));
		set.add(new Circle(10));
		set.add(new Circle(10));
		set.add(new Circle(3));
		set.add(new Circle(5));
		
		// 하나씩 꺼내서 출력
		// Set 은 꺼내는 함수가 없으므로 순차적으로 꺼내는 형태로 변환해줘야 한다.
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			// hasNext() : 아직 버퍼에 꺼낼 데이터가 있는지 여부를 반환해준다.
			Object o = itor.next();
			Circle c = (Circle) o;
			// 출력
			System.out.printf("반지름 : %3d\n둘레 : %5.2f\n넓이 : %5.2f\n\n", c.getRad(), c.getArround(), c.getArea());
		}
		System.out.println("--------------------------------------");
		// ArrayList로 변환해서 꺼내는 방법(숙제)
		ArrayList list = new ArrayList(set);
		for(Object o : list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test03_Set();
	}

}
