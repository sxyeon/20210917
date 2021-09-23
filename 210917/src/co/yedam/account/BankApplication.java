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
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------");
			System.out.println("선택 >> ");

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
				System.out.println("잘못된 값을 입력하였습니다.");
			}
		} // end of while
	} // end of main

	// 계좌생성
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌 생성");
		System.out.println("------");
		String ano = readStr("계좌번호: ");
		String owner = readStr("계좌주: ");
		int balance = readInt("초기금액: ");
		Account acnt = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = acnt;
				break;
			}
		}
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	// 계좌목록 보기
	private static void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt.getOwner() + " "+ acnt.getAno() + " "+ acnt.getBalance());
			}
		}
	}

	// 예금
	private static void deposit() {
		System.out.println("-----");
		System.out.println("예금");
		System.out.println("-----");
		String search = readStr("계좌번호: ");
		int dp = readInt("예금액: ");
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i] != null && accountArray[i].getAno().equals(search)) {
				accountArray[i].setBalance(accountArray[i].getBalance()+dp);
			}
		}

		System.out.println("결과 : 예금이 성공되었습니다.");
	}

	// 출금
	private static void withdraw() {
		System.out.println("-----");
		System.out.println("출금");
		System.out.println("-----");
		String search = readStr("계좌번호: ");
		int wd = readInt("출금액 : ");
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i].getBalance() >= wd &&
				accountArray[i] !=null && accountArray[i].getAno().equals(search)) {
				accountArray[i].setBalance(accountArray[i].getBalance()-wd);
				System.out.println("결과 : 출금이 성공되었습니다.");
				break;
			} else {
				System.out.println("잔액이 부족합니다.");
				break;
			}
		}

		System.out.println("결과 : 출금이 성공되었습니다.");
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < num; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}
		System.out.println("해당 계좌번호를 찾을 수 없습니다.");
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
