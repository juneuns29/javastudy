package day18;

import java.util.*;
import static java.lang.Math.*;
public class Test04_ArrayList {

	public Test04_ArrayList() {
		String[] names = {"제니", "리사", "로제", "지수"};
		
		// 네학생의 정보를 기억하고 있는 리스트를 만들어보자.
		// 리스트 준비
		ArrayList list = new ArrayList();
		// 리스트에 네명의 정보를 기억할 리스트를 채워보자.
		for(int i = 0 ; i < names.length ; i++ ) {
			ArrayList l = new ArrayList(); // 멤버 한명을 기억할 리스트
			// 멤버리스트에 채우고
			list.add(l);
		}
		
		// 멤버들 이름 입력
		for(int i = 0 ; i < names.length ; i++ ) {
			// 한명이름 꺼내고
			String name = names[i];
			// 멤버리스트에서 멤버 한명 정보 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 꺼낸 멤버 정보에 이름 추가하고
			l.add(name);
		}
		
		// 확인 출력
		System.out.println(list);
		
		// 국어점수 입력
		for(int i = 0 ; i < list.size() ; i++ ) {
			// 국어점수 만들고
			int score = (int)(random()*41 + 60);
			// 한명 정보 리스트 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 국어점수 입력해주고
			l.add(score);
		}
		
		// 영어점수 입력
		for(int i = 0 ; i < list.size() ; i++ ) {
			// 영어점수 만들고
			int score = (int)(random()*41 + 60);
			// 한명 정보 리스트 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 영어점수 입력해주고
			l.add(score);
		}
		
		// 수학점수 입력
		for(int i = 0 ; i < list.size() ; i++ ) {
			// 수학점수 만들고
			int score = (int)(random()*41 + 60);
			// 한명 정보 리스트 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 수학점수 입력해주고
			l.add(score);
		}
		
		// 결과 확인
		System.out.println(list);
		
		// 총점 입력
		for(int i = 0 ; i < list.size() ; i++ ) {
			// 멤버한명 정보 리스트 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 총점 변수
			int total = 0;
			// 반복해서 과목점수 모두 꺼내서 누적
			for(int j = 1; j < l.size() ; j++ ) {
				int score = (int) l.get(j); // 꺼낸 점수 정수로 바꿔주고(왜?? Object 로 입력되어있으므로...)
				total += score;
			}
			// 누적이 완료되면 총점 추가해주고
			l.add(total);
		}
		// 결과출력
		System.out.println(list);
		
		// 평균계산
		for(int i = 0 ; i < list.size(); i++ ) {
			// 한명 리스트 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 총점 꺼내고
			int total = (int) l.get(4);
			// 평균계산하고
			double avg = total / 3.0;
			
			// 평균 추가
			l.add(avg);
		}
		// 결과 출력
		System.out.println(list);
		
		// 순위 추가
		for(int i = 0 ; i < list.size(); i++ ) {
			// 네명 모두 순위를 1로 채워넣는다.
			// 한명 데이터 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			l.add(1);
		}
		
		// 결과 확인
		System.out.println(list);
		
		// 순위계산
		for(int i = 0 ; i < list.size(); i++ ) {
			// 한명데이터 꺼내고
			ArrayList l = (ArrayList) list.get(i);
			// 총점 꺼내고
			int total = (int) l.get(4);
			// 순위 꺼내고
			int lank = (int) l.get(6);
			
			// 순위 계산하고
			for(int j = 0 ; j < list.size(); j++ ) {
				ArrayList l2 = (ArrayList) list.get(j);
				int ttl = (int) l2.get(4);
				if(total < ttl) {
					lank += 1;
				}
			}
			
			//  순위 변경
			l.set(6, lank);
		}
		
		System.out.println();
		// 결과 확인
		for(Object o : list) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test04_ArrayList();
	}

}
