package package03;

public class WrapExam {

	public static void main(String[] args) {
		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		
		int i= 100;
		double d = 55.7;
		double dl;
		dl = d+i;
		System.out.println(i + d);
		System.out.println(Integer.toString(i) + Double.toString(d));
//		Integer Ŭ������ �ִ� toString(i)�޼ҵ�� i���� ���ڿ��� �����ϴ� �޼ҵ�
//		Double Ŭ������ �ִ� toString(d)�޼ҵ�� d���� ���ڿ��� �����ϴ� �޼ҵ�
//		���ڿ� + ���ڿ��� ���ڿ��̴�.
		
		System.out.println(wrapi.toString() + wrapd.toString());
//		wrapi�� Integer ��ü�����̱� ������ toString(i)�� ����� �� �ְ�, i���� ���ڿ��� ����
//		wrapid�� Double ��ü�����̱� ������ toString(d)�� ����� �� �ְ�, d���� ���ڿ��� ����

	}

}
