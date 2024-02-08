package day09;

public class Ex01_stud {
/*
	Student 클래스를 이용해서 
	5 학생의 점수를 관리할 예정이다.
	배열로 만들어서 결과를 출력하세요.
 */
	public static void main(String[] args) {
		String[] names = {
				"제니", "리사", "로제", "지수", "광섭"
		};
		Student[] stud = new Student[5];
		
		for(int i = 0 ; i < stud.length ; i++ ) {
			int kor = (int)(Math.random()*41 + 60);
			int eng = (int)(Math.random()*41 + 60);
			int math = (int)(Math.random()*41 + 60);
			stud[i] = new Student(names[i], kor, eng, math);
		}
		
		// 출력
		for(int i = 0 ; i < stud.length ; i++ ) {
			Student s = stud[i];
			System.out.printf("%2s - 국어 : %3d, 영어 : %3d, 수학 : %3d, " + 
											"총점 : %3d, 평균 : %5.2f\n", 
											s.name, s.kor, s.eng, s.math, 
											s.total, s.avg);
		}
	}

}
