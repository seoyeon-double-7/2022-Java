package CharacterCode;
import java.io.*;

public class BufferedReaderExam {
	public static void main(String []args) {
		InputStreamReader bi = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(bi);

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String aa = br.readLine();
			System.out.println(aa);	//키보드로 부터 라인단위로 데이터를 읽어서 aa에 저장
			br.close();	//자원 해제
			bi.close();
		}catch(IOException e) {}
		

	}
}
