import java.util.ArrayList;
import java.util.List;

public class TypeCastMain {

	public TypeCastMain() {

	}
	//상속관계에서의 형변환. 하위를 상위로 넣을때는 그냥 들어가고, 상위를 하위로 넣을때는 강제로 형변환 해줘야한다.
	//상속관계가 아닐때는 형변환할수가없다.
	public static void main(String[] args) {
		TypeCast2 tc1 = new TypeCast2();
		tc1.prn(); //만약 TypeCast2에 prn이 없으면 TypeCast1의 prn이 실행된다. 1과2가 상속관계니까

		//하위클래스를 상위클래스변수에 대입시킬경우 하위클래스의 변수, 메소드를 호출한다.
		TypeCast1 tc2 = tc1;
		tc2.prn(); 

//		TypeCast2 tc3 = tc2; 
		//하위를 상위로 넣을때는 그냥 들어가는데 상위클래스에 있는 객체를 하위클래스로 넣으려고 했더니 에러가 난다.
		TypeCast2 tc3 = (TypeCast2)tc2; 		
		//상속관계에 있을때 상위클래스에 있는 객체를 하위클래스 변수에 넣으려면 강제로 형변환해서 넣어야 한다.
		tc3.prn();
		
		TypeCast1 tc4 = new TypeCast2();
		//이게 되는 이유는 상속관계때문
		
		List list = new ArrayList();
	
		InterfaceTest it = new InterfaceMain();
		System.out.println("it.minus="+it.minus(100, 50));
		
		InterfaceMain it2 = (InterfaceMain)it; //it는 상위고 it2는 하위라서 안들어가기때문에 형변환해야한다. 
		System.out.println("it2.minus="+it2.minus(1000, 200));
		
		System.out.println(tc1.equals(tc2));
		
		
	}

}
