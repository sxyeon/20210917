package co.yedam.lesson;

/*
 * ����Ŭ���� + ���̺귯���� Ŭ���� ���� �� => ���α׷� ����
 * ��ü ����(�л�, ������, ��) => ��ü������ .. �ʿ��� ��ü�� ����� �װ͵��� �����ϴ� ��
 * �л�(��ü) -> �л�(Ŭ����) .. �������� ��
 * ��ҿ� -> new �л�(): �ν��Ͻ� .. ��ü�� �ִ� �� .. �ν��Ͻ��� ����� ���� ��ü�� ������ִ� ��
 */

public class LessonExample {
	public static void main(String[] args) {
		teacher t1 = new teacher("ȫ�浿", "����");
		
		Student s1 = new Student("��ҿ�", "010-1111", "�뱸�߱�");
		Student s2 = new Student("������", "010-2222", "�뱸����");
		
	    // ������ - �л�1, �л�2, �л�3...
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3�г�1��");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		teacher t2 = l1.getteacher(); // teacher ��ȯ
		System.out.println("�������̸�: " + t2.getName());
		System.out.println("�����԰��� :" + l1.getteacher().getMajor());
		
		l1.showStudents();
	}

}
