public class Sedan extends Car {
//Car���� �����س��� ����� sedan�� �����Ǿ��ִ�.
	int speed = 150; //����Ŭ������ �ִ� ������ ����Ŭ�������� �Ȱ��� ������
					 //���� ����� ����������Ѵ�.
					 //speed�� ����Ŭ������ �����ϱ� �̰����� �������� 
					 //SPEED_MAX�� ����Ŭ������ ���� ����Ŭ������ ������ ����Ŭ���� ���� �����´�.
					 //����Ŭ������ speedUp�� ȣ���Ҷ��� ���� ����� ������ Car�� ������ spped�� 0�̴�.
	
	public Sedan() {
		//����Ŭ������ �Ű������� �ִ� ������ ȣ��
		//������ ȣ���Ҷ��� �ݵ�� ù�࿡�� ȣ���ؾ��Ѵ�.
		super("red");//����Ŭ���� Car�� ����. �ȿ� String�� �־������� CarŬ������ Car(String color)�� ����.
 
		System.out.println("Sedan()������");
	}
	//�������̵� overriding : ����Ŭ������ �޼ҵ带 ����Ŭ�������� ������
	public void speedUp() { //���� speed�� 1 ������ �ƴ϶� �ٸ� ���� �����ǰ� �ٲٰ� ������ ��ӹ��� Ŭ������ �ش� �κ��� �Ȱ��̸����.
		speed +=10;
		if(speed>=SPEED_MAX) {
			speed = SPEED_MAX;
		}
		System.out.println("speed="+speed);
		
//		super.speed +=10;  �̷��� super�� �ٿ��ָ� ����Ŭ������ ������ �̿��Ѵ�.
//		if(super.speed>=SPEED_MAX) {
//			super.speed = SPEED_MAX;
//		}
//		System.out.println("speed="+super.speed);		
//		super.speedUp(); //����Ŭ������ �ٽ� �������� ������
		
		//private��������� ����Ŭ�������� ����� �� ����.
		//private��������� ��ӵ��� �ʴ´�.
		//System.out.println("Car.color="+color); //protected�� ����
	}

		
	
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.speedUp(); //���ǵ尡 1���� .. ����Ŭ�������� ��ü�� ������ ��Ӱ���� ����Ŭ���� ���� ����
		
	}
	//�ٷ� �����ִ� 
} //�����ϸ� Car�� �ִ� �����ڵ� ����(��ӵǾ������ϱ�)
