package co.yedam.kyobo;

import java.util.Scanner;
/*
 * 1.������� 2.�������� 3.������� 4.������ȸ 5.�������� 9.����
 * �������� : ��������/����/���ǻ�/����..Ŭ���� �����
 */

public class BookLibrary {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Book[] kyoboLib = new Book[100];
		kyoboLib[0] = new Book("ȥ�� �����ϴ� �ڹ�", "�ſ��", "�Ѻ����ǻ�", 25000);
		kyoboLib[1] = new Book("�̰��� �ڹٴ�", "�ſ��", "�Ѻ����ǻ�", 20000);
		kyoboLib[2] = new Book("ȥ�� �����ϴ� ������", "ȫ�浿", "�츮���ǻ�", 35000);

		while (true) {

			System.out.println("1.������� 2.�������� 3.������� 4.������ȸ 5.�������� 9.����");
			int menu = readInt("�޴��� �����ϼ���>>");
			if (menu == 1) {
				System.out.println("������ϸ޴��Դϴ�.");
				// �������: ����, ����, ���ǻ�, ����
				String title = readStr("å������ �Է��ϼ���.");
				String auth = readStr("���ڸ� �Է��ϼ���.");
				String press = readStr("���ǻ縦 �Է��ϼ���");
				int price = readInt("������ �Է��ϼ���");
				// �����ڸ� ȣ�� => book�̶�� ���� ����
				Book book = new Book(title, auth, press, price);
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] == null) { // �迭�� ����ִ� ��ġ�� ����
						kyoboLib[i] = book;
						break;
					}
				}
				System.out.println("����Ϸ�.");
			} else if (menu == 2) {
				System.out.println("���������޴��Դϴ�");
				// ���������� ã�ƿͼ� => ������(Ű)
				// ����, ���ǻ�, ���� => �׸񺯰�
				String search = readStr("������ �������� �Է��ϼ���.");
				String author = readStr("������ ���ڸ� �Է��ϼ���[�������� �������� ����].");
				String press = readStr("������ ���ǻ縦 �Է��ϼ���[�������� �������� ����].");
				String price = readStr("������ �ݾ��� �Է��ϼ���[�������� �������� ����].");
				boolean isExist = false;
				for (int i = 0; i < kyoboLib.length; i++) {
					// �� �� ã�ƿ� ���
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().equals(search)) {
						if (!author.equals("")) {
							kyoboLib[i].setAuthor(author);
						}
						if (!press.equals("")) {
							kyoboLib[i].setPress(press);
						}
						if (!price.equals(""))
							if (author.equals("")) {
								kyoboLib[i].setPrice(Integer.parseInt(price));
							}
						isExist = true;
					}
				}
			} else if (menu == 3) {
				System.out.println("������ϸ޴��Դϴ�");
				for (Book book : kyoboLib) {
					if (book != null)
						book.showInfo();
				}

			} else if (menu == 4) {
				System.out.println("������ȸ�޴��Դϴ�");
				String search = readStr("��ȸ�� �������� �Է��ϼ���.");
				for (Book book : kyoboLib) {
					if (book != null && book.getTitle().indexOf(search) != -1)
						book.showInfo();
				}

			} else if (menu == 5) {
				System.out.println("���������޴��Դϴ�");
				String search = readStr("������ �������� �Է��ϼ���.");
				for (int i = 0; i < kyoboLib.length; i++) {
					if (kyoboLib[i] != null && kyoboLib[i].getTitle().indexOf(search) != -1)
						kyoboLib[i] = null;
				}
				System.out.println("�����Ϸ�.");

			} else if (menu == 9) {
				System.out.println("����޴��Դϴ�");
				break;
			}
		} // end of while
		System.out.println("��.");

	} // end of main

	// ����� �Է°��� ��ȯ���ִ� �޼ҵ�
	public static String readStr(String msg) {
		System.out.println(msg);
		return scn.nextLine();
	}

	// ����� �Է°��� ��ȯ(int).
	public static int readInt(String msg) {
		System.out.println(msg);
		int result = 0;
		while (true) {
			String val = scn.nextLine();
			try {
				result = Integer.parseInt(val); // "1000" -> 1000 ����Ÿ������ ǥ���� ���� ����Ÿ������ �ٲ��ִ� ����
				break;
			} catch (Exception e) {
				System.out.println("�߸��� ���� �Է��߽��ϴ�. �ٽ� �Է��ϼ���");
			}

		}
		return result;
	}
}
