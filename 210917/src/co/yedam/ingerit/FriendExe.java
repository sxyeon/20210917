package co.yedam.ingerit;

import co.yedam.ScanUtil;

public class FriendExe {

	private static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		// ģ��, �б�ģ��, ȸ��ģ�� = �迭�� ����
		// CompFriend -> Friend, UnivFriend -> Friend
		friends = new Friend[100];
		friends[0] = new Friend("ȫ�浿", "1111-2111");
		friends[5] = new Friend("ȫ�浿", "1111-2111");
		friends[1] = new Friend("��浿", "2222-2111");
		friends[2] = new Friend("ȫ����", "2222-1311");
		friends[3] = new UnivFriend("�ڼ���", "2345-1234", "���а�");
		friends[4] = new CompFriend("��ö��", "2222-1212", "������")
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {
		while (true) {
			System.out.println("--------------");
			System.out.println("1.ģ�� 2.��ȸ 3.���� 4.���� 5.����");
			System.out.println("--------------");
			ScanUtil.readInt("�޴��� �����ϼ���."); // �ν��Ͻ� �޸� �Ҵ� -> static
			int menu = ScanUtil.readInt("�޴��� �����ϼ���.");
			if (menu == 1) {
				System.out.println("���");
				addFriend();
			} else if (menu == 2) {
				System.out.println("��ȸ");
				showList();
			} else if (menu == 3) {
				System.out.println("����");
			} else if (menu == 4) {
				System.out.println("����");
			} else if (menu == 5) {
				System.out.println("�����մϴ�.");
				break;
			}

		}
		System.out.println("��");
	}

	private void addFriend() {
		// ģ��, �б�ģ��, ȸ��ģ��
		System.out.println("1.ģ�� 2.�б�ģ�� 3.ȸ��ģ��");
		int choice = ScanUtil.readInt("�޴��� ����");
		
		String name = ScanUtil.readStr("ģ���̸��� �Է�");
		String phone = ScanUtil.readStr("����ó�� �Է�");
		if(choice == 1) {
			Friend friend = new Friend(name, phone);
			
		} else if(choice == 2) {
			String major = ScanUtil.readStr("�����Է�");
			UnivFriend friend = new UnivFriend(name, phone, major);
					
		} else if(choice == 3) {
			String depart = ScanUtil.readStr("�μ��Է�");
			CompFriend friend = new CompFriend(name, phone, depart);
		
	}
		for(int i=0, i<friends.length; i++) {
			if(friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("��� ����.");

	}

	private void showList() {
		// �̸�, ����ó �Է� => ȫ�浿, ��浿 -> �˻������� "�浿"�̶�� ���� ������ �ǵ���
		// 1111-1211, 2222-1211�� ��� -> "1211"�� ��ȸ�ϸ� 1211�� �� ������ �� ��ȸ�ǵ���
		// �浿, 1211 -> �̸� & ����ó.
		String name = ScanUtil.readStr("��ȸ�� �̸� �Է�");
		String phone = ScanUtil.readStr("��ȸ�� ��ȭ �Է�");
		for (int i = 0; i < friends.length; i++)
			;
		{
			if (friends[i] != null) {
				// �̸�

			}
			if (!name.equals("") && !phone.equals("")) {
				if (friends[i].getName().indexOf(name) != -1 // �̸� && ��ȭ��ȣ
						&& friends[i].getPhone().indexOf(phone) != -1)
					System.out.println(friends[i].toString());

			} else if (!phone.equals("")) { // ��ȭ��ȣ
				if (friends[i].getPhone().indexOf(phone) != -1)
					System.out.println(friends[i].toString());

			} else if (!name.equals("")) { // �̸�
				if (friends[i].getName().indexOf(name) != -1)
					System.out.println(friends[i].toString());

			} else {
				System.out.println(friends[i].toString());
			}

		} // end of for
		
		private void modify() {
			
			System.out.println("[ģ�����]");
			for(int i=0; i<friends.length; i++) {
				if (friends[i] != null)
				System.out.println("[" + i + "]" + friends[i].toString())
			}
			int num = ScanUtil.readInt("ģ���� �����ϼ���");
			String phone = ScanUtil.readStr("�ٲ� ��ȣ�� �Է��ϼ���");
			
			friends[num].setPhone(null);
			if(friends[num] instanceof UnivFriend) {
				String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���");
				((UnivFriend) friends[num]).setMajor(major);
			} else if(friends[num] instanceof ComFriend) {
				String depart = ScanUtil.readStr("�ٲ� �μ��� �Է��ϼ���");
				((ComFriend) friends[num]).setDepart(depart);
			}
			
			System.out.println("�����Ϸ�");
		}
		
		private void remove() {
			System.out.println("[ģ�����]");
			for (int i=0; i<friends.length; i++) {
				if (friends[i] != null) {
					friends[num] = null;
					System.out.println("�����Ϸ�.");
					
				} else {
					System.out.println("������ ������ �����ϴ�.");
				}
			}
			
		}
		
	}
}
