package day08;

public class Ex05_test {

	public static void main(String[] args) {
		String str = "010-1234-5678";
		
		int idx = str.indexOf(' ');
		System.out.println(idx);
		idx = str.indexOf('-');
		System.out.println(idx);
	}

}
