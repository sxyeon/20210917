package co.yedam.person;

public class Car {
	// �ʵ�
	private String carName;
	private String carModel;
	private int carprice;
	private int maxSpeed;
	private Tire tire;
	
	// ������
	public Car(String carName, String carModel, int carprice, int maxSpeed, Tire tire) {
		this.carName = carName;
		this.carModel = carModel;
		this.carprice = carprice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}
	
	
    // �޼ҵ�
	public String getCarName() { // select * from employee;
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarprice() {
		return carprice;
	}

	public void setCarprice(int carprice) {
		this.carprice = carprice;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	
	
	
}
