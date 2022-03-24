package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super();
		this.color = color;
		// super(x, y); -- ColorPoint 생성자의 첫번째 문장에 위치해야 한다
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
