
public class Information {
	int num = 1111;
	String name = "홍길동";
	String tel = "010-1234-5678";
	
	public Information() {
		
	}

	public Information(int num, String name, String tel) { //객체생성할때 정수 문자 문자를 받아서 멤버변수에 넣어준다.
		this.num = num;
		this.name = name;
		this.tel = tel;
		
	}
	public void print() {
		System.out.println(num+":"+name+":"+tel); //멤버변수에 있는 넘버 이름 번호를 출력
	}
	
	
}
