package CharacterCode;

import java.io.*;

public class ReadLineFileExam {

	public static void main(String[] args) {
		String fname = "C:/Temp/BufferInput.txt";
		try {
			FileReader fr = new FileReader(fname);
//			fr�� "BufferInput.txt" ������ ����Ű�� ��ü����
			BufferedReader br = new BufferedReader(fr);
//			br�� "BufferInput.txt" ������ ����Ű�� ��ü�����̰�
//			����Ŭ������ �ִ� readLine()�޼ҵ带 ����ϱ� ����
//			����Ŭ������ ����� �ӵ� ����
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
