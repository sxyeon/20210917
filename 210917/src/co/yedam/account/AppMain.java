package co.yedam.account;

import java.util.Scanner;

public class AppMain {
	
	// 싱글톤 : new 생성자 => 새로운 인스턴스(메모리를 다른 용도로 쓴다는 것)
	private static AppMain singleton = new AppMain();
	
	// 생성자 private
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
	
	public void accountList() {
		for (Account acnt : accountArray) {
			if (acnt != null) {
				System.out.println(acnt.getOwner() + " "+ acnt.getAno() + " "+ acnt.getBalance());
			}
		}
	}
	
	public void deposit() {
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
	
	public void withdraw() {
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
	
	public Account findAccount(String ano) {
		return null;
		
	}
	
	public void execute() {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("------");
		System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
		System.out.println("------");
		System.out.print("선택>>");
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
