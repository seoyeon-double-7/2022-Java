package bytecode;
import java.io.*;

public class FileStreamExam2 {
	
	public static void main(String[] args) throws IOException{
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream("C:/Temp/tin.txt");
		// �����η�  �ص� �����ϴ�!
		FileOutputStream fos = new FileOutputStream("C:/Temp/tout.txt");
		// fos�� "tout.txt" ������ ����Ű�� ��ü����
		fis.read(b);
		// fis�� ����Ű�� "tin.txt" ���Ͽ��� �����͸� �о �迭 b�� ����
		fos.write(b);
		// �迭 b�� ����Ǿ��ִ� �����͸� fos�� ����Ű�� "tout.txt" ���Ͽ� ���
		fis.close();
		//������ ���� �� ��ü ������ �������� �Ѵ�.
		fos.close();
	}
}