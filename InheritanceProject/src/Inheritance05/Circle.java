package Inheritance05;

public class Circle extends Shape{
	@Override	//������ �޼ҵ�, ������̼�
	public void draw() {
		System.out.println("Circle");
		super.draw();
	}
}
