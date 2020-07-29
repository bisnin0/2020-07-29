
//멤버영역의 내부클래스
public class MemberInner { //외부클래스
	int num = 100;
	String name = "홍길동";
	public MemberInner() {
		
	}
	public void print() {
		
		System.out.println("번호="+num);
		System.out.println("이름 ="+name);
		//외부클래스에서 내부클래스의 정보를 접근할 수 없다.
//		System.out.pritnln("연락처="+tel); //하위클래스가 상위클래스의 변수는 쓸 수 있어도 상위클래스가 하위클래스의 변수는 못쓴다.
		
	}
	
	//내부클래스
	class Inner{
		int num=200;
		String tel = "010-1234-5678";
		Inner(){}
		Inner(int num){
			this.num = num;
		}
		public void output() {
			System.out.println("num="+num);
			System.out.println("tel="+tel);
			//내부클래스에서 외부클래스의 정보를 접근할 수 있다.
			System.out.println("name="+name); //홍길동은 내부에 없고 외부에 있다. 내부클래스에서 외부클래스의 정보를 사용한것. 상속관계라고 보면 된다.
			print(); //외부클래스의 메소드
		}
	}

	public static void main(String[] args) {
		MemberInner mi = new MemberInner();
		mi.print();
		
		//내부클래스 : 객체생성      = 외부클래스 객체 없이는 내부클래스 객체를 못만든다.
		MemberInner.Inner in1 = mi.new Inner();
		MemberInner.Inner in2 = new MemberInner().new Inner(300);  //둘 중에 하나
		
		in1.output();
		in2.output();
		
		
	}

}
