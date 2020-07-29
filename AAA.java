

public class AAA { //접근제한자가 default다
	String name="홍길동";
	protected AAA() { //protected 같은 팩키지 내에 있어서 사용 가능
		
		System.out.println("AAA()생성자 실행됨..");
	}
	void print() { //접근제한자가 default다
		System.out.println("AAA.name="+name);
	}
}
