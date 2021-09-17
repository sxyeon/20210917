package co.yedam.lesson;

public class Lesson {
	private teacher teacher;
	private String group; // 3-1
	private Student[] students;

	public Lesson() {
		students = new Student[3];

	}

	public void setTeacher(teacher teacher) {
		this.teacher = teacher;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void addStudent(Student student) {
		for (int i = 0; i < students.length; i++)
			;
		{
			if (students[i] == null) {
				
				students[i] = student;
				break;
			
		}
	}

	public teacher getteacher() {
		return this.teacher;
	}

	public String getGroup() {
		return this.group;
	}

	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("이름: " + students[i].getStudentName() + "연락처: " + students[i].getPhone() + "주소: "
						+ students[i].getAddress());
			}
		}
	}

}