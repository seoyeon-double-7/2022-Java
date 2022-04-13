package TextInheritance07;

public class CastingExam {

	public static void main(String[] args) {
//		객체변수 선언
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
//		객체 생성
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		System.out.println("[" + mycar.print() + "]");	//Car클래스에 있는 print() 호출
		System.out.println("[" + mybus.print() + "]");	//Bus클래스에 있는 print() 호출
		System.out.println("[" + mytruck.print() + "]");	//Tuck클래스에 있는 print() 호출
		
		yourcar = mybus;	
		System.out.println("[" + yourcar.print() + "]");
//		UpCasting 발생 - Bus 클래스로 업캐스팅이 되었기 때문에 Bus클래스에 있는 재정의된 print() 호출
		yourbus = (Bus)yourcar;	
//		DownCasting 발생 - 업캐스팅된 yourcar을 가지고 다운캐스팅 해야한다.
		System.out.println("[" + yourbus.print() + "]");
		//Bus 클래스에 있는 print()호출
		
		yourcar = mytruck;	
		System.out.println("[" + yourcar.print() + "]");
//		UpCasting 발생 - Tuck 클래스로 업캐스팅이 되었기 때문에 Bus클래스에 있는 재정의된 print() 호출
		yourtruck = (Truck)yourcar;	//yourtruck = new Truck(); 와 같은 의미
//		DownCasting 발생 - 업캐스팅된 yourcar을 가지고 다운캐스팅 해야한다.
		System.out.println("[" + yourtruck.print() + "]");
	}

}
