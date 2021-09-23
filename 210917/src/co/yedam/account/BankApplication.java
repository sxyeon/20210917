package co.yedam.account;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("--------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------");
			System.out.println("���� >> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			} else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
			}
		} // end of while
	} // end of main

	// ���»���
	private static void createAccount() {
		System.out.println("------");
		System.out.println("���� ����");
		System.out.println("------");
		String ano = readStr("���¹�ȣ: ");
		String owner = readStr("������: ");
		int balance = readInt("�ʱ�ݾ�: ");
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
	}

	// ���¸�� ����
	private static void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt.getOwner() + " "+ acnt.getAno() + " "+ acnt.getBalance());
			}
		}
	}

	// ����
	private static void deposit() {
		System.out.println("-----");
		System.out.println("����");
		System.out.println("-----");
		String search = readStr("���¹�ȣ: ");
		int dp = readInt("���ݾ�: ");
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i] != null && accountArray[i].getAno().equals(search)) {
				accountArray[i].setBalance(accountArray[i].getBalance()+dp);
			}
		}

		System.out.println("��� : ������ �����Ǿ����ϴ�.");
	}

	// ���
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("���");
		System.out.println("-----");
		String search = readStr("���¹�ȣ: ");
		int wd = readInt("��ݾ� : ");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getBalance() >= wd &&
				accountArray[i] !=null && accountArray[i].getAno().equals(search)) {
				accountArray[i].setBalance(accountArray[i].getBalance()-wd);
				System.out.println("��� : ����� �����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�ܾ��� �����մϴ�.");
				break;
			}
		}

		System.out.println("��� : ����� �����Ǿ����ϴ�.");
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < num; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("�ش� ���¹�ȣ�� ã�� �� �����ϴ�.");
		return null;
	}

	public static String readStr(String msg) {
		System.out.print(msg);
		return scanner.next();
	}

	public static int readInt(String msg) {
		System.out.print(msg);
		int num = scanner.nextInt();
		return num;
	}

}
