import java.util.ArrayList;
import java.util.List;

public class TypeCastMain {

	public TypeCastMain() {

	}
	//��Ӱ��迡���� ����ȯ. ������ ������ �������� �׳� ����, ������ ������ �������� ������ ����ȯ ������Ѵ�.
	//��Ӱ��谡 �ƴҶ��� ����ȯ�Ҽ�������.
	public static void main(String[] args) {
		TypeCast2 tc1 = new TypeCast2();
		tc1.prn(); //���� TypeCast2�� prn�� ������ TypeCast1�� prn�� ����ȴ�. 1��2�� ��Ӱ���ϱ�

		//����Ŭ������ ����Ŭ���������� ���Խ�ų��� ����Ŭ������ ����, �޼ҵ带 ȣ���Ѵ�.
		TypeCast1 tc2 = tc1;
		tc2.prn(); 

//		TypeCast2 tc3 = tc2; 
		//������ ������ �������� �׳� ���µ� ����Ŭ������ �ִ� ��ü�� ����Ŭ������ �������� �ߴ��� ������ ����.
		TypeCast2 tc3 = (TypeCast2)tc2; 		
		//��Ӱ��迡 ������ ����Ŭ������ �ִ� ��ü�� ����Ŭ���� ������ �������� ������ ����ȯ�ؼ� �־�� �Ѵ�.
		tc3.prn();
		
		TypeCast1 tc4 = new TypeCast2();
		//�̰� �Ǵ� ������ ��Ӱ��趧��
		
		List list = new ArrayList();
	
		InterfaceTest it = new InterfaceMain();
		System.out.println("it.minus="+it.minus(100, 50));
		
		InterfaceMain it2 = (InterfaceMain)it; //it�� ������ it2�� ������ �ȵ��⶧���� ����ȯ�ؾ��Ѵ�. 
		System.out.println("it2.minus="+it2.minus(1000, 200));
		
		System.out.println(tc1.equals(tc2));
		
		
	}

}
