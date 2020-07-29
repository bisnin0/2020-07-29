//익명의 내부클래스
public class AnoInner {
	int num = 2222;
	String addr = "서울시 서대문구";
	public AnoInner() {
		
	}

	public void start() {
		//익명의 내부클래스 생성 
		new Information(){
			//바디 영역이 Information 클래스 영역이 된다.
			
			public void print() {
				System.out.println("번호="+num);
				System.out.println("이름="+name);
				System.out.println("연락처="+tel);
				
			}
			public void output() {
				System.out.println("num="+num);
				System.out.println("addr="+addr);
			}
		}.output(); // .print();  세미콜론
		//원래 있는 클래스를 한 부분만 수정해서 쓰고 끝을 낼때 이걸 사용.
		
	}
	
	public static void main(String[] args) {
		AnoInner ai = new AnoInner();
		ai.start();
	}

}
