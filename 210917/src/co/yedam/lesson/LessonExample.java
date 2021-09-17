package co.yedam.lesson;

/*
 * 실행클래스 + 라이브러리용 클래스 여러 개 => 프로그램 구성
 * 객체 구성(학생, 선생님, 반) => 객체지향언어 .. 필요한 객체를 만들고 그것들을 조합하는 것
 * 학생(객체) -> 학생(클래스) .. 개념적인 것
 * 김소영 -> new 학생(): 인스턴스 .. 실체가 있는 것 .. 인스턴스를 만드는 것은 실체를 만들어주는 것
 */

public class LessonExample {
	public static void main(String[] args) {
		teacher t1 = new teacher("홍길동", "국사");
		
		Student s1 = new Student("김소영", "010-1111", "대구중구");
		Student s2 = new Student("정혜윤", "010-2222", "대구서구");
		
	    // 선생님 - 학생1, 학생2, 학생3...
		Lesson l1 = new Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3학년1반");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		teacher t2 = l1.getteacher(); // teacher 반환
		System.out.println("선생님이름: " + t2.getName());
		System.out.println("선생님과목 :" + l1.getteacher().getMajor());
		
		l1.showStudents();
	}

}
