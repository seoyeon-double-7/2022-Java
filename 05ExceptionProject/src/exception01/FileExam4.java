package exception01;

public class FileExam4 {
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
		} catch(ArithmeticException ae1) {
			System.out.println("0 exception"); //0으로 나누는 예외발생
		} catch(ArrayIndexOutOfBoundsException ae2) {
			System.out.println("array exception"); //배열의 범위 벗어난 예외발생
		} catch(Exception e) {	// 위의 2가지의 예외가 아닌 경우 실행한다.
			System.out.println("exception"); //예외발생
		}
	}
}