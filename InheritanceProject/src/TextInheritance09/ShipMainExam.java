package TextInheritance09;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship = new MyShip();	// myship ��ü������ MyShip Ŭ������ ����ȯ 
		Ship yourship = new YourShip();	// yourship ��ü������ YourShip Ŭ������ ����ȯ 
		ShipName.search(myship);
		// 1. search(myship); �޼ҵ带 ȣ���� �� ���ڰ����� myship�� ����
		// ShipName Ŭ�������� search(Ship s)�� ������ ����� �� 
		// Ship s = myship�� ����� ����. ���� s ��ü������ MyShipŬ������ ����ȯ(��ĳ����)
		// s�� MyShip Ŭ���� ��ü Ÿ���̴�.
		ShipName.search(yourship);
		// 2. search(yourship); �޼ҵ带 ȣ���� �� ���ڰ����� yourship�� ����
		// ShipName Ŭ�������� search(Ship s)�� ������ ����� �� 
		// Ship s = yourship�� ����� ����. ���� s ��ü������ yourshipŬ������ ����ȯ(��ĳ����)
		// s�� yourship Ŭ���� ��ü Ÿ���̴�.
	}

}
