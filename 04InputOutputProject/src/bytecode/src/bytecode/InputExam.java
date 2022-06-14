package bytecode;
import java.io.IOException;
import java.io.InputStream;

public class InputExam{
	public static void streamTest(InputStream is) {
		//InputSteam is = System.in으로 표현 가능
		//is 객체변수는 키보드로부터 입력받는 read()메소드 사용할 수 있다.
		try {
			while(true) {
				int i = is.read();	//키보드로부터 1개의 문자를 입력
				if(i == -1) break; //CTRL + Z 누르면 break
				char c = (char)i;	//형변환
				System.out.print(c);	//출력
				//한글데이터 처리 불가
			} 
		}catch(IOException e) {
				System.out.println(e);
			}
			System.out.println();
		}
	public static void main(String args[]) {
		streamTest(System.in);
	}
	}