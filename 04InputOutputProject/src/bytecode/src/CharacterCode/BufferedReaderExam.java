package CharacterCode;
import java.io.*;

public class BufferedReaderExam {
	public static void main(String []args) {
		InputStreamReader bi = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(bi);

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String aa = br.readLine();
			System.out.println(aa);	//Ű����� ���� ���δ����� �����͸� �о aa�� ����
			br.close();	//�ڿ� ����
			bi.close();
		}catch(IOException e) {}
		

	}
}
