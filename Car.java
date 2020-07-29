
//클래스에서 클래스를 상속받는경우 1개의 클래스만 상속 가능하다.
public class Car extends Object{ //Car 클래스에서 Object 클래스를 상속받았다.
	private String color="white";
	protected int wheel = 4;
	final int SPEED_MAX = 200;
	int speed;
	public Car() { //매개변수 없는 생성자
		System.out.println("Car()생성자");
	}
	public Car(String color) { //매개변수 있는 생성자
		this.color = color; //this = 현재 클래스 
		System.out.println("color="+color);
	}
	public void speedUp() {
		speed++;
		if(speed>=SPEED_MAX) {
			speed = SPEED_MAX;
		}
		System.out.println("speed="+speed);
	}
	public void speedDown() {
		speed--;
		if(speed<=0) {
			speed=0;
		}
		System.out.println("speed="+speed);
	}
}
