import test.Car2; //test��Ű�� �ȿ� �ִ� Car2
public class Truck extends Car2 {

	public Truck() {
		System.out.println("Truck()������");
		wheel = 10;
		System.out.println("Truck.wheel="+wheel);
	}

	public static void main(String[] args) {
		new Truck().speedUp(); 
		
		
		//protected���������ڴ� �ٸ� ��Ű�� Ŭ������ ����Ұ�� 
		//�ݵ�� ����� �޾ƾ� �Ѵ�. ??
//		Car2 car2 = Car2.getInstance(); �� ����?
//		car2.wheel = 12; //���� ������ protected.. ���� ��Ű�� �ȿ� �����ϱ�
		
		//���� ��Ű���� ��� ��ü�� �����Ͽ� ���� �����ϴ�.
		Car car= new Car();
		car.wheel = 15;

	}

}
