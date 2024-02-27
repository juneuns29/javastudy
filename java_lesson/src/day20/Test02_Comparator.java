package day20;

import java.util.*;
public class Test02_Comparator {

	public Test02_Comparator() {
		// Nemo 10개를 기억할 ArrayList 준비
		ArrayList list = new ArrayList();
		// 리스트에 Nemo 10개 채우고
		for(int i = 0 ; i < 10 ; i++ ) {
			// 가로, 세로 준비
			int width = (int)(Math.random()*20 + 1);
			int height = (int)(Math.random()*20 + 1);
			// Nemo 준비
			Nemo n = new Nemo(width, height);
			
			// list 에 추가
			list.add(n);
		}
		// 결과 확인
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println();
		
		// 세로기준 오름차순 정렬
		list.sort(new MyComp());
		// 결과 확인
		for(Object o : list) {
			System.out.println(o);
		}
		System.out.println();
		
		// 가로 기준 오름차순 정렬
		list.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int w1 = ((Nemo) o1).getWidth();
				int w2 = ((Nemo) o2).getWidth();
				return w1 - w2;
			}
		});
		
		// 결과 확인
		System.out.println("############# 가로 기준 오름차순 정렬 #############");
		for(Object o : list) {
			System.out.println(o);
		}
		
	}

	public static void main(String[] args) {
		new Test02_Comparator();
	}

}

class MyComp implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// 이 함수는  sort 함수가 호출되면
		// sort함수가 자동 호출하는 함수
		// 이함수의 반환값을 이용해서 정렬하게 된다.
		/*
		 	o1, o2는 비교할 객체들이고
		 	입력해주는 순간 Object 타입으로 자동형변환될 것이다.
		 	이 함수를 오버라이드 할때는
		 	원래 형태대로 강제형변환 해줘야
		 	그 객체들의 멤버를 사용할 수 있게될 것이다.
		 */
		int h1 = ((Nemo) o1).getHeight();
		int h2 = ((Nemo) o2).getHeight();
		
		// 세로기준 오름차순 정렬
		return h1 - h2;
	}
}