package CharacterCode;
import java.io.*;
public class BufferInputExam {

	public static void main(String[] args) {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		
		String s = "";
		try {
			s = in.readLine();	//Ű����κ��� ���� ������ �����͸� �Է��� �ϰԵǸ�
//			���ۿ� �ӽ������� ����Ǹ� �� ���� s���� �Ѱ��ش�.
		}catch(Exception e) {	//���ܰ� �߻��Ǿ��� ��쿡�� ����
			System.out.println("Error : " + e.toString());
		}
		System.out.println(s);
	}

}
