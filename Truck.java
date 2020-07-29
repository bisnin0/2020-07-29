import test.Car2; //test팩키지 안에 있는 Car2
public class Truck extends Car2 {

	public Truck() {
		System.out.println("Truck()생성자");
		wheel = 10;
		System.out.println("Truck.wheel="+wheel);
	}

	public static void main(String[] args) {
		new Truck().speedUp(); 
		
		
		//protected접근제한자는 다른 팩키지 클래스를 사용할경우 
		//반드시 상속을 받아야 한다. ??
//		Car2 car2 = Car2.getInstance(); 왜 에러?
//		car2.wheel = 12; //에러 이유는 protected.. 같은 팩키지 안에 없으니까
		
		//같은 팩키지인 경우 객체를 생성하여 접근 가능하다.
		Car car= new Car();
		car.wheel = 15;

	}

}
