package bytecode;

import java.io.IOException;

public class Echo2Exam {

	public static void main(String[] args) {
		int bt;
		try {
			bt = System.in.read();	//1byte 데이터를 입력
			//문자를 입력받을 때 리턴값은 아스키코드값(ASCII CODE)
			System.out.print((char)bt);
		} catch(IOException e) {
			System.err.println(e);
		}
	}

}
