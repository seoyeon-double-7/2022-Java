package TextInheritance08;

public class DrawinExam {

	public static void main(String[] args) {
		Circle c = new Circle();	// c ��ü ����
		c.draw();	// Circle Ŭ������ �ִ� draw() ȣ��
		c.painting();	// Circle Ŭ������ �ִ� painting() ȣ��
		
		Shape s = new Shape();	// s�� Shape Ŭ������ �̾� �͸� ����
		s.draw();	// Shape Ŭ������ �ִ� draw() ȣ��
		//s.painting(); -> ���� �߻�
		
		s = c;	// UpCasting
		s.draw();	
//		CircleŬ������ ��ĳ������ �߱� ������
//		Shape Ŭ������ �ִ� draw() �޼ҵ带 ȣ������ �ʰ�
//		Circle Ŭ������ �ִ� draw() ȣ��
//		s.painting(); -> ���� ������ ����Ŭ������ Shape���� ���ǰ� �Ǿ� ���� ����
		

	}

}
