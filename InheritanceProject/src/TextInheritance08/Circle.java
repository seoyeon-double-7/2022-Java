package TextInheritance08;

public class Circle extends Shape {
	private String type = "원";
	
	// 재 정의(Overriding)
	public void draw() {
		System.out.println( type + "도형 그리기");
	}
	
	// 일반 메소드
	public void painting() {
		System.out.println("색 칠하기");
	}
	
}

