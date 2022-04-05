package Inheritance06;

public class GoodCalc extends Calculator{	//�߻� Ŭ������ ��� ����
	@Override	//������̼�
	public int add(int a, int b) {	//�ݵ�� ������(������ ���� ������ ���� �߻�)
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {	//�ݵ�� ������(������ ���� ������ ���� �߻�)
		return a - b;
	}
	@Override
	public double average(int[] a) {	//�ݵ�� ������(������ ���� ������ ���� �߻�)
		double sum = 0;
		for(int i = 0; i < a.length; i++) 
			sum += a[i];
		return sum / a.length;
	}
	public static void main(String [] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {1, 2, 3, 4}));
	}
}