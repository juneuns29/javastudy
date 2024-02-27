package day19;

/*
	Semo 클래스를 정의하고
	ArrayList에 Semo 7개를 밑변과 높이를 랜덤하게 만들어서 기억시키고
	넓이 기준으로 오름차순 정렬해서 
	출력하세요.
 */
import java.util.*;
public class Ex02 {

	public Ex02() {
		ArrayList list = new ArrayList();
		Random rnd = new Random();
		for(int i = 0 ; i < 7 ; i++ ) {
			// Semo 준비
			// 밑변, 높이 랜덤하게 만들고
			int w = rnd.nextInt(20) + 1;
			int h = rnd.nextInt(20) + 1;
			Semo tmp = new Semo(w, h);
			// 준비된 Semo를 리스트에 채워주고
			list.add(tmp);
		}
		// 결과 확인
		for(int i = 0 ; i < list.size(); i++ ) {
			Object o = list.get(i);
			System.out.println(o);
		}
		
		// 정렬하기
		for(int i = 0 ; i < list.size() - 1 ; i++ ) {
			for(int j = i + 1; j < list.size(); j++ ) {
				Semo s1 = (Semo) list.get(i);
				Semo s2 = (Semo) list.get(j);
				double a1 = s1.getArea();
				double a2 = s2.getArea();
				if(a1 > a2) {
					// 임시변수
					Object tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		
		// 결과 확인
		System.out.println("-----------------------------------");
		System.out.println();
		for(Object o : list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
