package TextInheritance07;

public class CastingExam {

	public static void main(String[] args) {
//		��ü���� ����
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
//		��ü ����
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		System.out.println("[" + mycar.print() + "]");	//CarŬ������ �ִ� print() ȣ��
		System.out.println("[" + mybus.print() + "]");	//BusŬ������ �ִ� print() ȣ��
		System.out.println("[" + mytruck.print() + "]");	//TuckŬ������ �ִ� print() ȣ��
		
		yourcar = mybus;	
		System.out.println("[" + yourcar.print() + "]");
//		UpCasting �߻� - Bus Ŭ������ ��ĳ������ �Ǿ��� ������ BusŬ������ �ִ� �����ǵ� print() ȣ��
		yourbus = (Bus)yourcar;	
//		DownCasting �߻� - ��ĳ���õ� yourcar�� ������ �ٿ�ĳ���� �ؾ��Ѵ�.
		System.out.println("[" + yourbus.print() + "]");
		//Bus Ŭ������ �ִ� print()ȣ��
		
		yourcar = mytruck;	
		System.out.println("[" + yourcar.print() + "]");
//		UpCasting �߻� - Tuck Ŭ������ ��ĳ������ �Ǿ��� ������ BusŬ������ �ִ� �����ǵ� print() ȣ��
		yourtruck = (Truck)yourcar;	//yourtruck = new Truck(); �� ���� �ǹ�
//		DownCasting �߻� - ��ĳ���õ� yourcar�� ������ �ٿ�ĳ���� �ؾ��Ѵ�.
		System.out.println("[" + yourtruck.print() + "]");
	}

}
