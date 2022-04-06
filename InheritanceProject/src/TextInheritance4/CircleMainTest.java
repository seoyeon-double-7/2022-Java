package TextInheritance4;

public class CircleMainTest extends CircleArea_Exam{

	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();
		//System.out.println("원의 면적은 " + cp.area(10));
//		area()메소드가 private로 되어 있기 때문에 해당 클래스 내에서만 사용
		System.out.println("원의 둘레는 " + cp.round(10));
//		protected -> 상속관계 접근 가능
//		같은 패키지 접근 가능
	}

}
