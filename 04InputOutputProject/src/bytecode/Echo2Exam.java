package bytecode;

import java.io.IOException;

public class Echo2Exam {

	public static void main(String[] args) {
		int bt;
		try {
			bt = System.in.read();	//1byte �����͸� �Է�
			//���ڸ� �Է¹��� �� ���ϰ��� �ƽ�Ű�ڵ尪(ASCII CODE)
			System.out.print((char)bt);
		} catch(IOException e) {
			System.err.println(e);
		}
	}

}
