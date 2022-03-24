package CircleArray03;

public class AccessEX {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		//aClass.b = 10; b에 접근 불가(private)
		aClass.c = 10;
	}
}
