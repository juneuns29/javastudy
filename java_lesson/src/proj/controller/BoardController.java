package proj.controller;

import java.util.*;
import java.util.Date;
import java.sql.*;

import proj.dao.*;
import proj.vo.*;
public class BoardController {
	// 데이터베이스 작업 전담 클래스 변수
	private BoardDao bDao;
	private Scanner sc;
	
	// 클라이언트 회원번호 변수
	private int mno = 1000;
	
	public BoardController() {
		bDao = new BoardDao();
		sc = new Scanner(System.in);
		
		menu();
	}
	
	// 메뉴 출력 함수
	public void menu() {
		// 할일
		loop:
		while(true) {
			// 메시지 출력
			System.out.print("r : 조회기능\nu : 수정기능\nc : 게시글입력\nd : 게시글 삭제\nq : 프로그램종료\n메뉴를 선택하세요. : ");
			// 입력받고
			String scode = sc.nextLine();
			// 입력값 비교
			switch(scode) {
			case "r": // 조회기능
				selectFunc();
				break;
			case "u": // 수정기능
				editBody();
				break;
			case "c": // 입력기능
				
				break;
			case "d": // 삭제기능
				delBoard();
				break;
			case "q": // 종료
				break loop;
			}
		}
	}
	
	// 조회기능 메뉴 함수
	public void selectFunc() {
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("----------- 조회 기능 -----------");
			
			System.out.print("a : 전체 리스트 조회\n" + 
							"d : 게시글 상세보기\n" +
							"q : 이전메뉴이동\n" + 
							"기능을 선택하세요! : ");
			// 입력받고
			String selCode = sc.nextLine();
			// 입력값에 따라 처리하고
			
			switch(selCode) {
			case "a": // 전체 리스트 조회
				getList();
				break;
			case "d": // 게시글 상세조회
				getBnoDetail();
				break; // switch 문 탈출
			case "q": // 이전 메뉴 이동
				break loop;
			}
		}
	}
	
	// 글번호를 입력받아서 해당글의 상세 정보를 출력해주는 함수
	public void getBnoDetail() {
		// 할일
		while(true) {
			// 글번호 리스트 출력
			ArrayList<Integer> list = bDao.getBnoList();
			if(list.size() == 0) {
				System.out.println();
				System.out.println("***** 작성한 글이 없습니다. *****");
				System.out.println();
				return;
			} else {
				System.out.println("----------- 글번호 리스트 ----------");
				System.out.print("|");
				for(int no : list) {
					System.out.printf(" %6d |", no);
				}
				System.out.println();
				System.out.println("------------------------------------");
				System.out.println();
			}
			// 메세지 출력
			System.out.print("조회할 글 번호를 입력하세요. : ");
			// 조회할 글 번호 입력받고
			int bno = 0;
			
			try {
				bno = sc.nextInt();
				sc.nextLine();

				// 글번호를 Dao 에 전달 하면서 데이터베이스 작업을 처리해달라고 요청
				// 결과로 글 한개를 저장한 객체 BoardVO를 반환 받는다.
				int cnt = bDao.addViews(bno);
				if(cnt != 1) {
					// 이 경우는 데이터베이스 작업에 문제가 있는 경우
					// 다시 입력받아서 처리해준다.
					continue;
				}
				
				// 내용 꺼내오고...
				bodyDetail(bno);
			} catch(Exception e) {
				sc.nextLine();
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue; // 반복문 다시 실행
			}
			break; // 반복문 탈출
		}
		
	}
	
	public void bodyDetail(int bno) {
		BoardVO vo = bDao.getDetail(bno);
		System.out.println();
		System.out.println("--------------- 게시글 내용 ---------------");
		System.out.printf("게시글번호 : %6d\n"
						+ "글제목 : %s\n"
						+ "작성자 : %10s\n"
						+ "작성일 : %s\n"
						+ "조회수 : %s\n"
						+ "글내용 : %s"
						, vo.getBno(), vo.getTitle(), vo.getId(), 
						vo.getSdate(), vo.getViews(), vo.getBody());
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println();
		
	}
	
	// 게시글 리스트 조회 처리함수
	public void getList() {
		// 데이터 가져오고
		ArrayList<BoardVO> list = bDao.getAllList();
		
		// 출력한다.
		for(int i = 0 ; i < list.size(); i++ ) {
			BoardVO vo = list.get(i);
			
			int bno = vo.getBno();
			String title = vo.getTitle();
			String id = vo.getId();
			Date wdate = vo.getWdate();
			Time wtime = vo.getWtime();
			int views = vo.getViews();
			String sdate = vo.getSdate();
			
			System.out.printf("%4d ] %10s : %s : %s - %d\n", bno, id, sdate, title, views);
		}
	}
	
	// 작성글 수정기능
	public void editBody() {
		int bno = 0;
		// 할일
		// 작성 글번호 리스트 조회
		ArrayList<Integer> list = bDao.getMineBnoList(mno);
		
		if(list.size() == 0) {
			System.out.println();
			System.out.println("***** 작성한 글이 없습니다. *****");
			System.out.println();
			return;
		} else {
			// 출력
			System.out.println();
			System.out.print("|");
			for(int no : list) {
				System.out.printf(" %6d |", no);
			}
			System.out.println();
			System.out.println();
		}
		// 수정 글번호입력
		// 메세지 출력
		while(true) {
			System.out.print("수정할 글번호를 입력 : ");
			try {
				bno = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				// 여기를 실행하는 경우는 정수를 입력해주지 않은 경우...
				// 입력을 다시받는다.
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			break;
		}
		// 수정글 원본 내용 출력
		String body = bDao.getBody(bno);
		System.out.println();
		System.out.println("############### [ " + bno + " ] 글내용 ###############");
		System.out.println();
		System.out.println(body);
		System.out.println();
		// 수정내용을 입력
		System.out.println("------------------------------------");
		// 메세지 출력
		System.out.println("수정 내용 입력 :");
		// 입력받고
		String rebody = sc.nextLine();
		// 입력된 내용 데이터베이스에 입력
		int cnt = bDao.editBody(bno, rebody);
		// 결과 출력
		if(cnt == 1) {
			bodyDetail(bno);
		} else {
			System.out.println("#### 수정작업이 실패했습니다. ###");
		}
		
	}
	
	// 게시글 삭제 요청 전담 처리함수
	public void delBoard() {
		// 할일
		// 내가 작성한 글 번호 리스트 출력
		ArrayList<Integer> list = bDao.getMineBnoList(mno);
		// 출력
		System.out.println();
		System.out.print("|");
		for(int no : list) {
			System.out.printf(" %6d |", no);
		}
		System.out.println();
		System.out.println();
		
		// 삭제글번호 입력받고
		int bno = 0;
		// 메세지
		while(true) {
			System.out.print("삭제할 글 번호 입력 : ");
			try {
				bno = Integer.parseInt(sc.nextLine());
			} catch(Exception e) {
				System.out.println("# 잘못된 입력입니다.");
				continue;
			}
			break;
		}
		// 글 삭제하고
		int cnt = bDao.delBno(bno);
		// ==> 작업이 성공하면 1, 실패하면 0
		
		// 결과 출력
		if(cnt != 1) {
			System.out.println("#### 삭제작업이 실패했습니다. ####");
		}
	}
	
	public static void main(String[] args) {
		new BoardController();
	}

}
