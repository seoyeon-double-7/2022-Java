package package03;

public class IntegerEqualExam {

	public static void main(String[] args) {
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		
		int a = 100;
		int b = 100;
		
		System.out.println("in1.equals(in2) --> " + (in1.equals(in2)));
		System.out.println("in1.equals(in3) --> " + (in1.equals(in3)));
		System.out.println(" a == b ==>" + (a==b));
	}

}
// wraper Ŭ���� �������
// 1. java.util ��Ű���� Ŭ�������� ��ü �����͸� ó��
// 2. ArrayList, Collection ������ ��ũ�� ������ ��üŸ�Ը� ����(�ڷᱸ
// 3. ��Ƽ�����忡�� ����ȭ�� �����Ϸ��� ��ü �ʿ�