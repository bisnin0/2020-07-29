
//Ŭ�������� Ŭ������ ��ӹ޴°�� 1���� Ŭ������ ��� �����ϴ�.
public class Car extends Object{ //Car Ŭ�������� Object Ŭ������ ��ӹ޾Ҵ�.
	private String color="white";
	protected int wheel = 4;
	final int SPEED_MAX = 200;
	int speed;
	public Car() { //�Ű����� ���� ������
		System.out.println("Car()������");
	}
	public Car(String color) { //�Ű����� �ִ� ������
		this.color = color; //this = ���� Ŭ���� 
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
