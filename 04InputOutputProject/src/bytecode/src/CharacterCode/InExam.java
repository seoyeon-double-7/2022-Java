package CharacterCode;

import java.io.*;

public class InExam {

	public static void main(String[] args) {
		String a="", b="";
		int sum = 0;
		float average = 0;
		InputStreamReader nn = new InputStreamReader(System.in);
//		Ű����� ���� �����͸� �Է� ����
		BufferedReader in = new BufferedReader(nn);
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter the string(����) > ");
			a = in.readLine();	//�� �پ� �Է�
			System.out.print("Enter the string(����) > ");
			b = in.readLine();	//�� �پ� �Է�
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Your input is "+a+", "+b);
		int c = Integer.parseInt(a);
//		Integer Ŭ�����ȿ� parseInt(a)���� a���� ���������� ��ȯ�ؼ� c�� ����
		int d = Integer.parseInt(b);
//		Integer Ŭ�����ȿ� parseInt(b)���� b���� ���������� ��ȯ�ؼ� d�� ����
		sum = c+d;
		average = (float)sum/2;
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println("��� = "+average);
	}
}
