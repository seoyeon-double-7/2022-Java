package CharacterCode;

import java.io.*;

public class FileExam {

	public static void main(String[] args) {
		char buffer[] = new char[100];
		try {
			FileReader fr = new FileReader("src/CharacterCode/datar.txt");
//			fr 객체변수는 datar.txt 파일을 가리킨다. 
			
			FileWriter fw = new FileWriter("src/CharacterCode/dataw.txt");
//			fw 객체변수는 dataw.txt 파일을 가리킨다.
			
			fr.read(buffer, 0, 100);
//			fr이 가리키는 datar.txt 파일의 내용을 읽어서 buffer 배열에 저장
			String str = new String(buffer);
//			Strring(buffer)는 buffer 배열에 저장되어 있는 데이터를 문자열로 변경
//			str에 저장
//			System.out.println(str);
			fw.write(buffer);
//			buffer 배열에 저장되어 있는 데이터를 임시기억공간에 출력
			fw.flush();
//			버퍼(임시기억공간)에 저장되어 있는 데이터를 한꺼번에 dataw.txt 파일에 출력
		}catch(Exception e) {
			System.out.println(e.toString());
		}

	}

}
