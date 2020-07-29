public class Sedan extends Car {
//Car에서 구현해놓은 기능은 sedan에 구현되어있다.
	int speed = 150; //하위클래스에 있는 변수가 상위클래스에도 똑같이 있을때
					 //가장 가까운 변수를사용한다.
					 //speed는 하위클래스에 있으니까 이곳에서 가져오고 
					 //SPEED_MAX는 하위클래스에 없고 상위클래스에 있으니 상위클래스 값을 가져온다.
					 //상위클래스의 speedUp을 호출할때는 가장 가까운 변수가 Car에 있으니 spped는 0이다.
	
	public Sedan() {
		//상위클래스의 매개변수가 있는 생성자 호출
		//생성자 호출할때는 반드시 첫행에서 호출해야한다.
		super("red");//상위클래스 Car는 슈퍼. 안에 String을 넣어줬으니 Car클래스의 Car(String color)가 실행.
 
		System.out.println("Sedan()생성자");
	}
	//오버라이딩 overriding : 상위클래스의 메소드를 하위클래스에서 재정의
	public void speedUp() { //만약 speed가 1 증가가 아니라 다른 값이 증가되게 바꾸고 싶으면 상속받은 클래스의 해당 부분을 똑같이만든다.
		speed +=10;
		if(speed>=SPEED_MAX) {
			speed = SPEED_MAX;
		}
		System.out.println("speed="+speed);
		
//		super.speed +=10;  이렇게 super을 붙여주면 상위클래스의 변수를 이용한다.
//		if(super.speed>=SPEED_MAX) {
//			super.speed = SPEED_MAX;
//		}
//		System.out.println("speed="+super.speed);		
//		super.speedUp(); //상위클래스껄 다시 가져오고 싶을때
		
		//private멤버변수는 하위클래스에서 사용할 수 없다.
		//private멤버변수는 상속되지 않는다.
		//System.out.println("Car.color="+color); //protected는 가능
	}

		
	
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.speedUp(); //스피드가 1증가 .. 하위클래스에서 객체를 만들었어도 상속관계라 상위클래스 실행 가능
		
	}
	//바로 위에있는 
} //실행하면 Car에 있는 생성자도 실행(상속되어있으니까)
