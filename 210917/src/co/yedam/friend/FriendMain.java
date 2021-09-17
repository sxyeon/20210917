package co.yedam.friend;

import java.util.Scanner;

/*
 * 친구 주소록 관리.
 * 이름, 연락처, email, 키, 몸무게.
 * 1.등록, 2.조회(이름), 3.목록, 4.수정, 5.삭제, 9.종료
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] jusolog = new Friend[3];
		jusolog[0] = new Friend("이민지", "010-1111-1111", "minzi@naver.com", 160, 53);
		jusolog[1] = new Friend("이수련", "010-2222-2222", "sr11@naver.com", 164, 55);
		jusolog[2] = new Friend("김소현", "010-3333-3333", "sohyeon@naver.com", 159, 49);
		jusolog[3] = new Friend("구민정", "010-5555-5555", "minjj@daum.net", 170, 56);

		while (true) {
			System.out.println("1.등록 2.이름조회 3.목록 4.수정 5.삭제 9.종료");
			int menu = readInt("메뉴를 선택하세요");
			if (menu == 1) {
				System.out.println("등록하세요");

			} else if (menu == 2) {
				System.out.println("조회메뉴입니다.");

			} else if (menu == 3) {
				System.out.println("목록메뉴입니다.");

			} else if (menu == 4) {
				System.out.println("수정메뉴입니다");

			} else if (menu == 5) {

			} // end of while

		}
	}
	
	// readInt
	
		
		
	}
	
}