package test;

//class CCC { //접근제한자가 default다
// String tel = "010-1234-5678";
// CCC() { //접근제한자가 default다  


//protected 들때문에 Modify에서 에러나서 주석처리해놨음.

 public class CCC { //접근제한자가 default다
	public String tel = "010-1234-5678";	 
//	protected String tel = "010-1234-5678"; //다른팩키지라 불러오지 못한다.
	
	public CCC() { //접근제한자가 default다  
//	protected CCC() { // protected는 팩키지가 다르면 쓰지 못한다.	
		System.out.println("CCC()생성자");
	}
	//void sum() { //접근제한자가 default다
	public void sum() { //접근제한자가 default다
//	protected void sum() { //다른팩키지라 불러오지 못한다.	
		int s=0;
		for(int i=0; i<=100; i++) {
			s+=i;
		}
		System.out.println("1~100까지의 합은 "+s);
	}
	public static CCC getInstance() {
		return new CCC();
		
	}
}
