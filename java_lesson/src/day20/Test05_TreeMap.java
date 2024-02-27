package day20;

import java.util.*;
public class Test05_TreeMap {

	public Test05_TreeMap() {
		// Nemo 객체 두개 준비
		Nemo n1 = new Nemo(1, 2);
		Nemo n2 = new Nemo(3, 4);
		
		// TreeMap 준비
		TreeMap map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				// 가로 기준으로 정렬되게...
				return ((Nemo) o1).getWidth() - ((Nemo) o2).getWidth();
			}
		});
		map.put(n1, "(3, 4)"); //   키값 :  n2, 데이터 : "(3, 4)"
		map.put(n2, "(1, 2)"); //   키값 :  n1, 데이터 : "(1, 2)"
		
		// 꺼내서 출력하기
		// 1. Map은 키값을 알아야 데이터를 꺼낼 수 있으므로
		//		키값부터 꺼낸다.
		Set set = map.keySet();
		ArrayList keylist = new ArrayList(set);
		// 반복해서 꺼내고 출력
		for(int i = 0 ; i < keylist.size(); i++ ) {
			Object key = keylist.get(i);
			Nemo n = (Nemo) key;
			String value = (String) map.get(n);
			System.out.println(n + "\n-------------------------\n데이터 : " + value);
			System.out.println("#########################################");
		}
	}

	public static void main(String[] args) {
		new Test05_TreeMap();
	}

}
