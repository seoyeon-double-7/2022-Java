package TextInheritance10;

public class ShapeTest extends ShapeExam{
//	�߻� Ŭ������ ��� ����
//	ShapeExam Ŭ������ �ִ� ��� �߻�޼ҵ带 ���⼭ ����
	
	@Override
	public double getArea(double r) {
		return 3.14 * r * r;
	}
	
	@Override
	public double getCircum(double r) {
		return 2 * 3.14 * r;
	}	
}
