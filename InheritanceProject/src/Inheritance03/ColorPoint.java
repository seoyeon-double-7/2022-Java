package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super();
		this.color = color;
		// super(x, y); -- ColorPoint �������� ù��° ���忡 ��ġ�ؾ� �Ѵ�
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
	
}
