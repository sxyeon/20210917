package co.yedam.account;

public class AppExe {

	public static void main(String[] args) {
		AppMain main = AppMain.getInstance();  // �ν��Ͻ� ����
		main.execute();
		
		AppMain main2 = AppMain.getInstance();  // �ν��Ͻ� ����
		
		if(main == main2) { // �޸��� �ּҰ� == �޸��� �ּҰ�
			System.out.println("���� ��");
		} else {
			System.out.println("�ٸ� ��"); // �ٸ� �޸� �ּҰ��� �����ϱ� ������ �ٸ� ���� ��
		}

	}

}
