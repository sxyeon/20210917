package co.yedam.lesson;

/*
 * �̸�, ����
 */

public class teacher {
	// �ʵ� .. ������ �ʵ带 private���� ���Ƶΰ� �޼ҵ带 �����ش�
	private String name;
	private String major;
	
	// ������
	// teacher t1 new teacher(); => teacher�� ���� �������ֱ� ���� ������ ����µ� �̰� �ν��Ͻ��� �����Ѵٰ� ��
	public teacher(String name, String major) {
		this.name = name; // name, major�� �ʵ�
		this.major = major;
	}
	
	// �޼ҵ�
	public void setname(String name) {
		this.name = name; // �ʵ尪�� �ٲٰ� ���� �� �����ϱ�
		
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}

}
