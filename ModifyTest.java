//https://cafe.naver.com/goguma777/2122 ���������� ī�� ����

import test.CCC;
public class ModifyTest {
	
	public ModifyTest() {
		//public : �Ŭ���������� ������ ����Ѵ�.(Ŭ����, �������, �����ڸ޼ҵ�, �޼ҵ�)
		//default : ���������ڸ� �����Ѱ��� ���Ѵ�. ���� ��Ű�� �������� ������ �����ϴ�. ��Ű���� ������ public ���̵� �� �� �ִ�.
		//private : �ٸ�Ŭ�������� �����Ҽ� ����. ���� Ŭ���� �������� ������ �����ϴ�.
		//			��������� private�� ��� ��ü�� ���� ������ �Ұ����ϴ�.
		//protected : �ٸ�����(��Ű��)�� ��ӹ޾Ƽ� �� �� �ְ� �׷��� ������ �ȵȴ�.
		
		AAA a=new AAA();
		System.out.println("a.name="+a.name);
		a.print();
		
//		CCC c= new CCC(); // CCC��� Ŭ������ ����Ϸ� ������ ��Ű���� �ٸ���.  
		//protected �Ʒ����� ���ؼ� �ּ�ó��
						  //���������ڰ� default�� ������ ����� �� ����. 
						  //public�̸� ��� ���������� new CCC�� �������ε� CCC�� �����ڸ޼ҵ�� default��. 
		                  //�׷��� CCC�� �����ڸ޼ҵ嵵 public���� �ٲ��ָ� ������Ǯ����. import ���� ����
		
		CCC c = CCC.getInstance(); //protected�� ȣ���ϱ� ���ؼ� 
		System.out.println("c.tel="+ c.tel); //�������� ���� = �ٸ� ��Ű���� ������ ����Ʈ��
		c.sum(); //CCC���� default�� �����Ǿ� �ֱ� ������ CCC���� public���� �ٲ����
		
		BBBB b = new BBBB(); //BBBB�� ����ϱ� ���� ��ü�� ��������� ����
		//������ �޼ҵ尡 private�� ��ü�� ������ �� ����.
		// private ������� �����ϱ� : �Ұ���

		//System.out.println("addr = "+b.addr); //��ü��.�������� ����. addr�� pirvate�̱⶧����.
		b.output(); //�̰� ������ ������ BBBB���� private�� �ƴ� default void output�� ��� ���๮�� �����ְ� �װ� �ҷ��Ա⶧��
		
		
		
	}

	public static void main(String[] args) {
		new ModifyTest();
	}

}
