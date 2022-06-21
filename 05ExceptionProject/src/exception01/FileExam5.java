package exception01;

public class FileExam5 {
	public static void main(String[] args) {
		String[] irum = new String[3];
		int jumsu = 99;
		int count = 10;
		int avg = 0;
		
		try {
			avg = jumsu / count;
//			count가 0일때 catch(ArithmeticException ae1)이 실행된다.
			for(int i=0; i<=irum.length; i++) 
				System.out.println(irum[i]);
//			irum[3] 되었을 때 catch(ArrayIndexOutOfBoundsException ae2)			
		} catch(Exception e) {	// 위의 모든 예외를 여기에서 처리한다.
			System.out.println("exception"); //예외발생
		} catch(ArithmeticException ae1) {		//오류발생
			System.out.println("0 exception"); //0으로 나누는 예외발생
		} catch(ArrayIndexOutOfBoundsException ae2) {	//오류발생
			System.out.println("array exception"); //배열의 범위 벗어난 예외발생
		} 
//		catch 문자 작성시 상위 예외클래스가 맨 마지막에 위치해야 함.
	}
}