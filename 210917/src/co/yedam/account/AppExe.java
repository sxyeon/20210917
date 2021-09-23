package co.yedam.account;

public class AppExe {

	public static void main(String[] args) {
		AppMain main = AppMain.getInstance();  // 인스턴스 생성
		main.execute();
		
		AppMain main2 = AppMain.getInstance();  // 인스턴스 생성
		
		if(main == main2) { // 메모리의 주소값 == 메모리의 주소값
			System.out.println("같은 값");
		} else {
			System.out.println("다른 값"); // 다른 메모리 주소값을 참고하기 때문에 다른 값이 뜸
		}

	}

}
