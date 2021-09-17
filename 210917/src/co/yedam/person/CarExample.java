package co.yedam.person;

public class CarExample {
	public static void main(String[] args) {
		// sonata
		Car sonata = new Car("¼Ò³ªÅ¸", "SonataHybrid", 2000, 200, new Tire());
		sonata.getCarName();
		sonata.getCarModel();
		sonata.getCarprice();
		sonata.getMaxSpeed();
		sonata.getTire();
	}

}
