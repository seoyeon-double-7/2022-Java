package package01;

public class ValueofExam {
	public static void main(String args[]) {
		char ch = 'A';	//����
		String strData1 = "A";	//���ڿ�
		String strDat2;
		strDat2 = String.valueOf(ch);
//		ch�� ������ �ִ� �����͸� ���ڿ��� ����
//		static�� �پ������� Ŭ���� �̸��� �� �� �ִ�. (Ŭ����.valueof())
		if(strData1.equals(strDat2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
	}
}
