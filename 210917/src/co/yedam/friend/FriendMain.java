package co.yedam.friend;

import java.util.Scanner;

/*
 * ģ�� �ּҷ� ����.
 * �̸�, ����ó, email, Ű, ������.
 * 1.���, 2.��ȸ(�̸�), 3.���, 4.����, 5.����, 9.����
 */
public class FriendMain {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Friend[] jusolog = new Friend[3];
		jusolog[0] = new Friend("�̹���", "010-1111-1111", "minzi@naver.com", 160, 53);
		jusolog[1] = new Friend("�̼���", "010-2222-2222", "sr11@naver.com", 164, 55);
		jusolog[2] = new Friend("�����", "010-3333-3333", "sohyeon@naver.com", 159, 49);
		jusolog[3] = new Friend("������", "010-5555-5555", "minjj@daum.net", 170, 56);

		while (true) {
			System.out.println("1.��� 2.�̸���ȸ 3.��� 4.���� 5.���� 9.����");
			int menu = readInt("�޴��� �����ϼ���");
			if (menu == 1) {
				System.out.println("����ϼ���");

			} else if (menu == 2) {
				System.out.println("��ȸ�޴��Դϴ�.");

			} else if (menu == 3) {
				System.out.println("��ϸ޴��Դϴ�.");

			} else if (menu == 4) {
				System.out.println("�����޴��Դϴ�");

			} else if (menu == 5) {

			} // end of while

		}
	}
	
	// readInt
	
		
		
	}
	
}