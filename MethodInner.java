//�޼ҵ� ���� ����Ŭ����
public class MethodInner {
	String username= "�̼���";
	int age=30;
	
	public MethodInner() {
	}

	public void getInfor() {
		String addr = "����� ������ �����";
		//�޼ҵ� ���� ���� Ŭ����
		class Inner{
			String tel = "010-1234-5678";
			String username= "�������";
			
			Inner(){}
			
			void print() {
				System.out.println("�̸�="+username);
				System.out.println("����ó="+tel);
				//�޼ҵ峻�� ����Ŭ���������� �ܺ�Ŭ������ ��������� ����� �� �ִ�.
				System.out.println("����="+age);
				//�޼ҵ��� ���������� Ŭ���� ���� ������ ������ ������ ������ �����ϴ�.
				System.out.println("�ּ�="+addr);
//				System.out.println("�̸���="+email); //Ŭ���� ���� ���Ŀ� �ۼ��� ������ ���� ���� ���Ѵ�.
			}
		}
		String email = "abcedf@nate.com"; //Ŭ���� ���� ���Ŀ� �ۼ��� ����
		//�޼ҵ� ���� ���� Ŭ���� ��ü�� class ���� �� ��ü�� �����Ѵ�.
		Inner i =new Inner();
		i.print();	
	}
	public static void main(String[] args) {
	MethodInner mi = new MethodInner();
	mi.getInfor();
	}

}
