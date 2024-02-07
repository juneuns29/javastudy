package day08;

public class Test10_toCharArray {

	public static void main(String[] args) {
		String jennie = "jennie";
		char[] name = jennie.toCharArray();
		
		System.out.print("| ");
		for(char c : name) {
			System.out.print(c + " | ");
		}
		System.out.println();
		
		System.out.println(jennie.indexOf('n'));
		String blackpink = "Black Pink";
		System.out.println(blackpink.indexOf("-"));
	}

}
