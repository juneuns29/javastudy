package day06;

/*
	25 ~ 34까지의 수를 기억하는 배열 nums에서
	30의 위치를 검색해서 출력하세요.
	
	보너스 ]
		찾을 숫자를 입력받아서
		위치값을 찾는 프로그램을 작성하세요.
		
		레어 문제 ]
			25 ~ 34 를 랜덤하게 중복없이 배열에 채워서
			찾을 숫자를 입력받아서
			위치값을 찾는 프로그램을 작성하세요.
			***
			로또번호 생성기 참고하세요.
 */
import java.util.*;
public class Ex01_search {

	public static void main(String[] args) {
		// 배열 준비하고
		int[] nums = new int[10]; // int데이터 10개를 기억할 배열 nums를 준비
		// 배열에 데이터 채우고
		for(int i = 0 ; i < nums.length ; i++ ) {
			nums[i] = 25 + i;
		}
		
		// 채워진 데이터 확인
		for(int i = 0 ; i < nums.length ; i++ ) {
			System.out.printf("| %2d ", nums[i]);
		}
		System.out.println("|");
		System.out.println();
		
		int target = 30;
		// 결과 변수
		int result = -1;
		for(int i = 0 ; i < nums.length ; i++ ) {
			// 데이터 하나씩 비교
			int no = nums[i]; // 하나 꺼내서 no에 기억
			if(target == no) {
				// 찾는 숫자를 꺼낸 경우
				// 결과값 변수에 기억시키고
				result = i;
				// 더이상 진행이 무의미하므로 즉시 종료시킨다.
				break;
			}
		}
		
		// 결과 출력
		System.out.println("배열 nums에서 찾는 숫자 [ " + target + " ] 은 " + 
											(result + 1) + " 번째에 있습니다.");
	}

}
