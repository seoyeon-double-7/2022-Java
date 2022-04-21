package package03;

public class WrapExam {

	public static void main(String[] args) {
		Integer wrapi = new Integer(100);
		Double wrapd = new Double(55.7);
		
		int i= 100;
		double d = 55.7;
		double dl;
		dl = d+i;
		System.out.println(i + d);
		System.out.println(Integer.toString(i) + Double.toString(d));
//		Integer 클래스에 있는 toString(i)메소드는 i값을 문자열로 변경하는 메소드
//		Double 클래스에 있는 toString(d)메소드는 d값을 문자열로 변경하는 메소드
//		문자열 + 문자열은 문자열이다.
		
		System.out.println(wrapi.toString() + wrapd.toString());
//		wrapi는 Integer 객체변수이기 때문에 toString(i)를 사용할 수 있고, i값을 문자열로 변경
//		wrapid는 Double 객체변수이기 때문에 toString(d)를 사용할 수 있고, d값을 문자열로 변경

	}

}
