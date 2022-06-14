package bytecode;

import java.io.*;

public class BufferedExam {

	public static void main(String[] args) {
		BufferedInputStream bi = new BufferedInputStream(System.in);
//		키보드로부터 1바이트를 읽을 수 있고 버퍼를 사용
//		bi 객체변수는 in 객체의 메소드들을 사용할 수 있다.
		
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
//		1바이트를 출력하는 객체인데 버퍼를 사용해서 출력
//		버퍼를 사용하는 이유는 데이터 양이 많을 경우에 속도가 빨라진다.
		
		int aa;
		try {
			while((aa = bi.read()) != -1) {
				bo.write(aa);	//bo가 가리키는 임시기억공간에 버퍼에 출력한다.
			}
			bo.flush();	//버퍼에 저장되어 있는 데이터를 한꺼번에 화면에 출력한다.
		}catch(IOException e) {
			
		}
	}

}
