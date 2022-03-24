package CircleArray01;

public class CircleArray {
	public static void main(String[] args) {
//		선언
		Circle[] c;
//		배열 방 잡아주기
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++)
			c[i] = new Circle(i);
		
		for (int i = 0; i < c.length; i++)
			System.out.print((int) (c[i].getArea()) + " ");
	}
}
