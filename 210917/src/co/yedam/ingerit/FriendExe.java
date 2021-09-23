package co.yedam.ingerit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// 친구, 학교친구, 회사친구 = 배열에 저장
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "1111-2111");
		friends[5] = new Friend("홍길동", "1111-2111");
		friends[1] = new Friend("김길동", "2222-2111");
		friends[2] = new Friend("홍수아", "2222-1311");
		friends[3] = new UnivFriend("박수진", "2345-1234", "수학과");
		friends[4] = new CompFriend("김철수", "2222-1212", "영업부")
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("--------------");
			System.out.println("1.친구 2.조회 3.수정 4.삭제 5.종료");
			System.out.println("--------------");
			ScanUtil.readInt("메뉴를 선택하세요."); // 인스턴스 메모리 할당 -> static
			int menu = ScanUtil.readInt("메뉴를 선택하세요.");
			if (menu == 1) {
				System.out.println("등록");
				addFriend();
			} else if (menu == 2) {
				System.out.println("조회");
				showList();
			} else if (menu == 3) {
				System.out.println("수정");
			} else if (menu == 4) {
				System.out.println("삭제");
			} else if (menu == 5) {
				System.out.println("종료합니다.");
				break;
			}

		}
		System.out.println("끝");
	}

	private void addFriend() {
		// 친구, 학교친구, 회사친구
		System.out.println("1.친구 2.학교친구 3.회사친구");
		int choice = ScanUtil.readInt("메뉴를 선택");
		
		String name = ScanUtil.readStr("친구이름을 입력");
		String phone = ScanUtil.readStr("연락처를 입력");
		if(choice == 1) {
			Friend friend = new Friend(name, phone);
			
		} else if(choice == 2) {
			String major = ScanUtil.readStr("전공입력");
			UnivFriend friend = new UnivFriend(name, phone, major);
					
		} else if(choice == 3) {
			String depart = ScanUtil.readStr("부서입력");
			CompFriend friend = new CompFriend(name, phone, depart);
		
	}
		for(int i=0, i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록 성공.");

	}

	private void showList() {
		// 이름, 연락처 입력 => 홍길동, 김길동 -> 검색조건이 "길동"이라는 값을 넣으면 되도록
		// 1111-1211, 2222-1211인 경우 -> "1211"로 조회하면 1211이 들어간 값들은 다 조회되도록
		// 길동, 1211 -> 이름 & 연락처.
		String name = ScanUtil.readStr("조회할 이름 입력");
		String phone = ScanUtil.readStr("조회할 전화 입력");
		for (int i = 0; i < friends.length; i++)
			;
		{
			if (friends[i] != null) {
				// 이름

			}
			if (!name.equals("") && !phone.equals("")) {
				if (friends[i].getName().indexOf(name) != -1 // 이름 && 전화번호
						&& friends[i].getPhone().indexOf(phone) != -1)
					System.out.println(friends[i].toString());

			} else if (!phone.equals("")) { // 전화번호
				if (friends[i].getPhone().indexOf(phone) != -1)
					System.out.println(friends[i].toString());

			} else if (!name.equals("")) { // 이름
				if (friends[i].getName().indexOf(name) != -1)
					System.out.println(friends[i].toString());

			} else {
				System.out.println(friends[i].toString());
			}

		} // end of for
		
		private void modify() {
			
			System.out.println("[친구목록]");
			for(int i=0; i<friends.length; i++) {
				if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString())
			}
			int num = ScanUtil.readInt("친구를 선택하세요");
			String phone = ScanUtil.readStr("바꿀 번호를 입력하세요");
			
			friends[num].setPhone(null);
			if(friends[num] instanceof UnivFriend) {
				String major = ScanUtil.readStr("바꿀 전공을 입력하세요");
				((UnivFriend) friends[num]).setMajor(major);
			} else if(friends[num] instanceof ComFriend) {
				String depart = ScanUtil.readStr("바꿀 부서를 입력하세요");
				((ComFriend) friends[num]).setDepart(depart);
			}
			
			System.out.println("수정완료");
		}
		
		private void remove() {
			System.out.println("[친구목록]");
			for (int i=0; i<friends.length; i++) {
				if (friends[i] != null) {
					friends[num] = null;
					System.out.println("삭제완료.");
					
				} else {
					System.out.println("삭제할 정보가 없습니다.");
				}
			}
			
		}
		
	}
}
