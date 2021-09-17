package co.yedam.member;

public class Member {
	// user1(���̵�), ȫ�浿(�̸�), �뱸 �߱� ���ϵ�(�ּ�)
	private String memberId;  // public�� memberŬ���� �ܿ� �ٸ� Ŭ�������� �� �� �ֵ��� ���µǾ��ִٴ� �ǹ� private�� memberŬ���� ���� �ٸ� Ŭ���������� ������� ���ϵ��� ������� �ǹ�
    private String name;
	private String address;
	
	// ������ : �ʵ忡 ���� �ʱ�ȭ
	public Member() {
		
	}
	
	public Member(String mId) {
		memberId = mId;
	}
	
	public Member(String mId, String n, String a) {
		memberId = mId;
		name = n;
		address = a;
	}
	
	public void setMemberId(String mId) {
		memberId = mId;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getMemberId() {
		return memberId; // ��ȯ���ִ� �ʵ� : ���̵�
	}
	
	public String getName() {
		return name; // ��ȯ���ִ� �ʵ� : �̸�
	}
	
	public String getAddress() {
		return address; // ��ȯ���ִ� �ʵ� : �ּ�
	}
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println("���̵�: " + memberId + ", �̸�: " + name + ", �ּ�: " + address);
	}
	
	public void showMemberId() {
		System.out.println("���̵�: " + memberId);
	}
	
	public void showName() {
		System.out.println("�̸�: " + name);
	}
	
	public void showAddress() {
		System.out.println("�ּ�: " + address);
	}

}
