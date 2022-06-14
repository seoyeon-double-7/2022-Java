package CharacterCode;

import java.io.*;

public class ReadLineFileExam {

	public static void main(String[] args) {
		String fname = "C:/Temp/BufferInput.txt";
		try {
			FileReader fr = new FileReader(fname);
//			fr은 "BufferInput.txt" 파일을 가리키는 객체변수
			BufferedReader br = new BufferedReader(fr);
//			br은 "BufferInput.txt" 파일을 가리키는 객체변수이고
//			버퍼클래스에 있는 readLine()메소드를 사용하기 위함
//			버퍼클래스는 입출력 속도 증가
			String s = "";
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
			br.close();
			fr.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
