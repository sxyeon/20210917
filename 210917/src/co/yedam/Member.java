package co.yedam;

public class Member {
	// �ʵ�(��������) - � ������ �����ϱ� ���� �뵵
	int memberId;
	String name;
	String phone;
	
	
	// �޼ҵ�(���) - ������ �������ų� �޾ƿ��� ���
	public void showInfo() {
		System.out.println("���̵�: " + memberId + ", �̸�: " + name + ", ����ó: " + phone);
	}
	

}
