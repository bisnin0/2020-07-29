

public class BBBB {
	private String addr = "서울시 마포구 백범로";
//	String addr = "서울시 마포구 백범로";	
//	private BBBB() { //객체생성 불가. private가 있기때문에 modifyTest에서 BBBB를 사용할 수 없다.
	BBBB() { //public이 없다는건 default란 이야기
		System.out.println("BBB()생성자 메소드");
	}
	void output() {
		System.out.println("주소="+addr);
	}

}
