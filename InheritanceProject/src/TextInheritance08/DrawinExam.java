package TextInheritance08;

public class DrawinExam {

	public static void main(String[] args) {
		Circle c = new Circle();	// c 객체 생성
		c.draw();	// Circle 클래스에 있는 draw() 호출
		c.painting();	// Circle 클래스에 있는 painting() 호출
		
		Shape s = new Shape();	// s는 Shape 클래스에 이쓴 것만 접근
		s.draw();	// Shape 클래스에 있는 draw() 호출
		//s.painting(); -> 오류 발생
		
		s = c;	// UpCasting
		s.draw();	
//		Circle클래스로 업캐스팅을 했기 때문에
//		Shape 클래스에 있는 draw() 메소드를 호출하지 않고
//		Circle 클래스에 있는 draw() 호출
//		s.painting(); -> 오류 이유는 상위클래스인 Shape에서 정의가 되어 있지 않음
		

	}

}
