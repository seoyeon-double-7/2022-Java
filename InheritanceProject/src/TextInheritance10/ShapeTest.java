package TextInheritance10;

public class ShapeTest extends ShapeExam{
//	추상 클래스를 상속 받음
//	ShapeExam 클래스에 있는 모든 추상메소드를 여기서 구현
	
	@Override
	public double getArea(double r) {
		return 3.14 * r * r;
	}
	
	@Override
	public double getCircum(double r) {
		return 2 * 3.14 * r;
	}	
}
