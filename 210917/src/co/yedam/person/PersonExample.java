package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		
		// p1 => �̸�, Ű, ������, ������, ����
		// p2, p3
		// family => ��������(�̸�, ������, ����) : ��1
		
		// family => Ű�� 165 �̻� ������ ���(�̸�, Ű, ������) : ��2
		
		// p3 => AB�� ����
		// family => �������� AB���� ������ ���(�̸�, ������) : ��3
		
		Person p1 = new Person("�����", 165, 53, "AB", 27);
		Person p2 = new Person("������", 162, 50, "A", 30);
		Person p3 = new Person("������", 159, 55, "B", 40);
		
		Person[] family = {p1,p2, p3};
		
		for(int i=0; i<family.length; i++) {
			System.out.println("�̸�: " + family[i].getname() + "Ű: " + family[i].getheight() + "������: " + family[i].getweight() + "������: " + family[i].getbloodtype() + "����: " + family[i].getage());
		}
		
	}
	
	

}
