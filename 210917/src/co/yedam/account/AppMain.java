package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	// �̱��� : new ������ => ���ο� �ν��Ͻ�(�޸𸮸� �ٸ� �뵵�� ���ٴ� ��)
	private static AppMain singleton = new AppMain();
	
	// ������ private
	private AppMain() {
		
	}
	
	// method getInstance()
	public static AppMain getInstance() {
		return singleton;
	}
	
	
	Account[] accountArray = new Account[100];
	Scanner scanner = new Scanner(System.in);
	static int num = 0;
	
	public void createAccount() {
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
	
	public void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt.getOwner() + " "+ acnt.getAno() + " "+ acnt.getBalance());
			}
		}
	}
	
	public void deposit() {
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
	
	public void withdraw() {
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
	
	public Account findAccount(String ano) {
		return null;
		
	}
	
	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("------");
		System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
		System.out.println("------");
		System.out.print("����>>");
		int selectNo = scanner.nextInt();
		if(selectNo == 1) {
			createAccount();
		} else if(selectNo == 2) {
			accountList();
		} else if(selectNo == 3) {
			deposit();
		} else if(selectNo == 4) {
			withdraw();
		} else if(selectNo == 5) 
			run = false;
	}
	
	public String readStr(String msg) {
		System.out.print(msg);
		return scanner.next();
	}

	public int readInt(String msg) {
		System.out.print(msg);
		int num = scanner.nextInt();
		return num;
	}
	

}
