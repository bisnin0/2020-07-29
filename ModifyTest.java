//https://cafe.naver.com/goguma777/2122 접근제한자 카페 설명

import test.CCC;
public class ModifyTest {
	
	public ModifyTest() {
		//public : 어떤클래스에서든 접근을 허용한다.(클래스, 멤버변수, 생성자메소드, 메소드)
		//default : 접근제한자를 생략한것을 말한다. 같은 팩키지 내에서만 접근이 가능하다. 팩키지만 같으면 public 없이도 쓸 수 있다.
		//private : 다른클래스에서 접근할수 없다. 같은 클래스 내에서만 접근이 가능하다.
		//			멤버변수가 private일 경우 객체를 통한 접근이 불가능하다.
		//protected : 다른폴더(팩키지)면 상속받아서 쓸 수 있고 그렇지 않으면 안된다.
		
		AAA a=new AAA();
		System.out.println("a.name="+a.name);
		a.print();
		
//		CCC c= new CCC(); // CCC라는 클래스를 사용하려 하지만 팩키지가 다르다.  
		//protected 아래꺼를 위해서 주석처리
						  //접근제한자가 default기 때문에 사용할 수 없다. 
						  //public이면 사용 가능하지만 new CCC는 생성자인데 CCC의 생성자메소드는 default다. 
		                  //그래서 CCC의 생성자메소드도 public으로 바꿔주면 에러가풀린다. import 잊지 말것
		
		CCC c = CCC.getInstance(); //protected를 호출하기 위해서 
		System.out.println("c.tel="+ c.tel); //에러나는 이유 = 다른 팩키지에 있지만 디폴트라서
		c.sum(); //CCC에서 default로 설정되어 있기 때문에 CCC에서 public으로 바꿔야함
		
		BBBB b = new BBBB(); //BBBB를 사용하기 위해 객체를 만들었지만 에러
		//생성자 메소드가 private면 객체를 생성할 수 없다.
		// private 멤버변수 접근하기 : 불가능

		//System.out.println("addr = "+b.addr); //객체명.변수지만 에러. addr이 pirvate이기때문에.
		b.output(); //이건 가능한 이유는 BBBB에서 private가 아닌 default void output에 출력 실행문이 쓰여있고 그걸 불러왔기때문
		
		
		
	}

	public static void main(String[] args) {
		new ModifyTest();
	}

}
