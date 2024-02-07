package day08;

/*
	정수를 입력받아 그 숫자가 짝수인지 홀수인지 출력하세요. 
     7번 반복하고 중간에 3이 나오면 종료하세요.
 */
import javax.swing.*;
public class Test04_for_break {

	public static void main(String[] args) {
		int coin = 7;
		for(int i = 0 ; i < coin ; i++ ) {
			String sno = JOptionPane.showInputDialog("*** 정수 입력 ***");
			int no = Integer.parseInt(sno);
			if(no == 3) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				break;
			}
			String result = "홀수";
			if(no % 2 == 0) {
				result = "짝수";
			}
			
			JOptionPane.showMessageDialog(null, 
					"입력받은 숫자 "+ no + " 는 " + result + " 입니다.");
			if(i == 6) {
				JOptionPane.showMessageDialog(null, 
						"적립금을 모두 소진했습니다.\n프로그램을 종료합니다.");
			}
		}
	}

}
