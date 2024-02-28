package day20;

/*
 	학생들의 이름, 국어, 영어, 수학, 총점, 평균 을 기억할 VO클래스 Student 클래스를 제작하고
 	TreeMap에 학생의 이름을 키값으로 하고
 	 해당학생의  Student 객체를 데이터로 하는
 	 Map을 완성해서 출력하세요.
 	 출력할 때는 키값들을 꺼내서 출력하는 방식으로 처리하세요.( keySet() 사용하세요 )
 */
import java.util.*;
public class Ex01 {
	// 변수 준비
	Random rnd;
	public ArrayList<String> names;
	TreeMap<String, Student> stud;
	
	public Ex01() {
		rnd = new Random();
		setNames();
		setStud();
		toPrint();
	}
	
	public void setNames() {
		names = new ArrayList<String>();
		names.add("쵸파");
		names.add("루피");
		names.add("조로");
		names.add("상디");
		names.add("우솝");
		names.add("나미");
		names.add("로빈");
		names.add("보아핸콕");
	}
	
	public void setStud() {
		// 데이터 채울 공간 만들고
		stud = new TreeMap<String, Student>();
		
		// 데이터 채우고
		for(int i = 0 ; i < names.size(); i++ ) {
			// 키값으로 사용할 이름꺼내고
			String name = names.get(i);
			// 과목점수만들고
			int ko = rnd.nextInt(41) + 60;
			int en = rnd.nextInt(41) + 60;
			int mt = rnd.nextInt(41) + 60;
			
			// 학생 객체 만들고
			Student s = new Student(name, ko, en, mt);
			
			// 맵에 채우고
			stud.put(name, s);
		}
	}
	
	// 출력함수
	public void toPrint() {
		ArrayList<String> list = new ArrayList<String>(names);
		list.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				int result = s1.compareTo(s2);
				return result;
			}
		});
		
		for(String s : list) {
			System.out.println(stud.get(s));
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
