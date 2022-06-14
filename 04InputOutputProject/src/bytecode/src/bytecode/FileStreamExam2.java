package bytecode;
import java.io.*;

public class FileStreamExam2 {
	
	public static void main(String[] args) throws IOException{
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream("C:/Temp/tin.txt");
		// 절대경로로  해도 무방하다!
		FileOutputStream fos = new FileOutputStream("C:/Temp/tout.txt");
		// fos는 "tout.txt" 파일을 가리키는 객체변수
		fis.read(b);
		// fis가 가리키는 "tin.txt" 파일에서 데이터를 읽어서 배열 b에 저장
		fos.write(b);
		// 배열 b에 저장되어있는 데이터를 fos가 가리키는 "tout.txt" 파일에 출력
		fis.close();
		//파일을 닫을 때 객체 생성의 역순으로 한다.
		fos.close();
	}
}