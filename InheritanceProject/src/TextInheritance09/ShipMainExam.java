package TextInheritance09;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship = new MyShip();	// myship 객체변수는 MyShip 클래스로 형변환 
		Ship yourship = new YourShip();	// yourship 객체변수는 YourShip 클래스로 형변환 
		ShipName.search(myship);
		// 1. search(myship); 메소드를 호출할 때 인자값으로 myship이 전달
		// ShipName 클래스에서 search(Ship s)이 문장이 실행될 때 
		// Ship s = myship이 문장과 같다. 따라서 s 객체변수는 MyShip클래스로 형변환(업캐스팅)
		// s는 MyShip 클래스 객체 타입이다.
		ShipName.search(yourship);
		// 2. search(yourship); 메소드를 호출할 때 인자값으로 yourship이 전달
		// ShipName 클래스에서 search(Ship s)이 문장이 실행될 때 
		// Ship s = yourship이 문장과 같다. 따라서 s 객체변수는 yourship클래스로 형변환(업캐스팅)
		// s는 yourship 클래스 객체 타입이다.
	}

}
