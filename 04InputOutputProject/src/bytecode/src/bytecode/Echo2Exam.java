package bytecode;

import java.io.IOException;

public class Echo2Exam {
	public static void main(String[] args) {
		int bt;
		try {
			while ((bt = System.in.read()) != -1) { // Ctrl + Z �Է��ϸ� ����
				//CTRL + ZŰ�� ���ÿ� ������ -1���� ���ϵȴ�
				//While������ flase�� �Ǳ� ������ ����
				//������ �ѱ�ó�� �Ұ�
				System.out.print((char) bt);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
