package co.yedam.person;

public class PersonExample {
	public static void main(String[] args) {
		
		// p1 => 이름, 키, 몸무게, 혈액형, 나이
		// p2, p3
		// family => 가족정보(이름, 혈액형, 나이) : 끝1
		
		// family => 키가 165 이상 가족만 출력(이름, 키, 몸무게) : 끝2
		
		// p3 => AB로 변경
		// family => 혈액형이 AB형인 가족만 출력(이름, 혈액형) : 끝3
		
		Person p1 = new Person("김민희", 165, 53, "AB", 27);
		Person p2 = new Person("김지민", 162, 50, "A", 30);
		Person p3 = new Person("이유빈", 159, 55, "B", 40);
		
		Person[] family = {p1,p2, p3};
		
		for(int i=0; i<family.length; i++) {
			System.out.println("이름: " + family[i].getname() + "키: " + family[i].getheight() + "몸무게: " + family[i].getweight() + "혈액형: " + family[i].getbloodtype() + "나이: " + family[i].getage());
		}
		
	}
	
	

}
