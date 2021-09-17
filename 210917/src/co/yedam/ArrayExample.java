package co.yedam;

public class ArrayExample {

	public static void main(String[] args) {
		int[] intAry = {1, 2, 3};
		String[] strAry = {"Hello", "World"};
		int num = 10;
		
		Student s1 = new Student(); // name, score라고 하는 변수들을 동시에 가짐 .. s1의 데이터 타입은 Student
		s1.name = "홍길동";
		s1.score = 80;
		
		Student s2 = new Student(); // 새로은 student타입의 값을 만듦
		s2.name = "김민수";
		s2.score = 90;
		
		System.out.println("s1학생이름: " + s1.name);
		System.out.println("s1학생점수: " + s2.score);
		
		Student s3 = new Student();
		s3.name = "최지우";
		s3.score = 85;
		
		Student[] students = { s1, s2, s3 }; // Student라는 데이터 타입을 가지는 배열
		System.out.println("배열첫번째 이름: " + students[0].name); 
		System.out.println("배열첫번째 점수: " + students[0].score);
		
		System.out.println("배열첫번째 이름: " + students[2].name); 
		System.out.println("배열첫번째 점수: " + students[2].score);
		
		s1.name = "박길동";
		s1.score = 70;
		
		for(int i=0; i<students.length; i++) {
			System.out.println("학생이름: " + students[i].name);
			System.out.println("학생이름: " + students[i].score);
		}

	}

}
