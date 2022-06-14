package bytecode;

import java.io.IOException;

public class Echo2Exam {
	public static void main(String[] args) {
		int bt;
		try {
			while ((bt = System.in.read()) != -1) { // Ctrl + Z 입력하면 종료
				//CTRL + Z키를 동시에 누르면 -1값이 리턴된다
				//While문장이 flase가 되기 때문에 종료
				//여전히 한글처리 불가
				System.out.print((char) bt);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
