package test;

//class CCC { //���������ڰ� default��
// String tel = "010-1234-5678";
// CCC() { //���������ڰ� default��  


//protected �鶧���� Modify���� �������� �ּ�ó���س���.

 public class CCC { //���������ڰ� default��
	public String tel = "010-1234-5678";	 
//	protected String tel = "010-1234-5678"; //�ٸ���Ű���� �ҷ����� ���Ѵ�.
	
	public CCC() { //���������ڰ� default��  
//	protected CCC() { // protected�� ��Ű���� �ٸ��� ���� ���Ѵ�.	
		System.out.println("CCC()������");
	}
	//void sum() { //���������ڰ� default��
	public void sum() { //���������ڰ� default��
//	protected void sum() { //�ٸ���Ű���� �ҷ����� ���Ѵ�.	
		int s=0;
		for(int i=0; i<=100; i++) {
			s+=i;
		}
		System.out.println("1~100������ ���� "+s);
	}
	public static CCC getInstance() {
		return new CCC();
		
	}
}
