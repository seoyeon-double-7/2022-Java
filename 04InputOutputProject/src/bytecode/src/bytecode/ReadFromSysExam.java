package bytecode;

import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b);
			//배열 b에 입력한 데이터들을 저장하는데 입력한 데이터의
			//길이 값을 리턴해서 len에 저장
			//만약 입력한 값이 'meister'이면 len에 7이 저장된다! 
			System.out.write(b,0,len);
			//배열 b에 저장되어 있는 데이터를 0번째부터 시작하여
			//len 길이만큼 출력
		}catch(IOException ioe) {
			System.out.println("입력 실패");
		}

	}

}
