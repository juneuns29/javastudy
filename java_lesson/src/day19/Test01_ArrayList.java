package day19;

import java.util.*;

public class Test01_ArrayList {

	public Test01_ArrayList() {
		// 멤버들을 기억할 리스트 만들고
		ArrayList blackPink = new ArrayList();
		// 리스트에 멤버들 데이터 채우고
		
		// 멤버 이름 준비
		ArrayList names = new ArrayList();
		names.add("제니");
		names.add("리사");
		names.add("로제");
		names.add("지수");
		
		// 반복해서 채우고
		for(int i = 0 ; i < names.size() ; i++ ) {
			// 필요한 데이터 준비
			// 이름
			String name = (String) names.get(i);
			// 과목점수
			Random rand = new Random();
			int kor = rand.nextInt(41) + 60;
			int eng = rand.nextInt(41) + 60;
			int math = rand.nextInt(41) + 60;
			
			// 멤버객체 만들어서 채워주고
			BlackPink memb = new BlackPink(name, kor, eng, kor);
			blackPink.add(memb);
		}
		
		// 출력
		for(int i = 0 ; i < blackPink.size(); i++ ) {
			// 데이터 꺼내고
			Object memb = blackPink.get(i);
//			BlackPink memb = (BlackPink) blackPink.get(i);
			System.out.println(memb);
		}
		
		// 순위 구하기
		for(int i = 0 ; i < blackPink.size(); i++ ) {
			// 현재 멤버의 순위를 1로 셋팅
			BlackPink memb = (BlackPink) blackPink.get(i);
			memb.setRank(1);
			// ((BlackPink) blackPink.get(i)).setRank(1);
			
			// 현재 멤버보다 점수가 높은 멤버가 있으면 랭크를 1 올려준다.
			for(int j = 0 ; j < blackPink.size(); j++ ) {
				BlackPink next = (BlackPink) blackPink.get(j);
				// 다른 멤버 총점
				int chong = next.getTotal();
				// 내 랭크
				int total = memb.getTotal();
				if(total < chong) {
					// 현재 내 랭크
					int rank = memb.getRank();
					memb.setRank(rank + 1);
				}
			}
			
		}
		
		// 출력
		for(int i = 0 ; i < blackPink.size(); i++ ) {
			// 데이터 꺼내고
			Object memb = blackPink.get(i); // 함수(toString() 함수)는 마지막 고쳐쓴 함수가 호출된다.
			System.out.println(memb);
		}
		System.out.println();
		System.out.println("*********** 오름차순 정렬 **************");
		// 정렬하기
		for(int i = 0 ; i < blackPink.size() - 1 ; i++ ) {
			for(int j = i + 1; j < blackPink.size(); j++ ) {
				int me = (int) ((BlackPink) blackPink.get(i)).getRank();
				int nam = (int)((BlackPink) blackPink.get(j)).getRank();
				
				if(me > nam) {
					// 임시저장
					BlackPink tmp = (BlackPink) blackPink.get(i);
					blackPink.set(i, blackPink.get(j));
					blackPink.set(j, tmp);
				}
			}
		}
		
		// 출력
		for(int i = 0 ; i < blackPink.size(); i++ ) {
			// 데이터 꺼내고
			Object memb = blackPink.get(i); // 함수(toString() 함수)는 마지막 고쳐쓴 함수가 호출된다.
			System.out.println(memb);
		}
	}

	public static void main(String[] args) {
		new Test01_ArrayList();
	}

}
