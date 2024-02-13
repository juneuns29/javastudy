package day09;

public class Student {
	int kor, eng, math;
	int total;
	double avg;
	String name;
	/*
		1.
			이 클래스가 객체가 될때
			국어, 영어, 수학 점수를 입력받아서 
			셋팅이 되도록 생성자를 제작하세요.
		
		2. 
			객체가 만들어질 때
			과목점수를 이용해서 총점과 평균도 셋팅이 되도록 하세요.
	 */
	
	public Student() {}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal();
		setAvg();
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal(); // ==> total = kor + eng + math;
		setAvg(); 	// ==> avg = total / 3.0;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
//		return;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTotal() {
		total = kor + eng + math;
	}
	
	public void setAvg() {
		avg = total / 3.0;
	}
}
