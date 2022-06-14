package FileTestExam;

import java.io.*;
import java.util.*;

class sungDatasExam {
	public void readingData(String fname) throws IOException {
//		String fname = "writed.txt"
		
		try {
			//File ff = new File(fname)
			FileReader fr = new FileReader(new File(fname));
//			new File(fname)�� �ӽ� ��ü
//			fr�� writed.txt������ ����Ű�� ���� ��ü����
			BufferedReader br = new BufferedReader(fr);
//			����Ŭ������ �߰��� ��ü������ br�̴�.
//			����Ŭ������ ����ϴ� ������ �ӵ� ����
			String csvStr = "";
			String tmpStr = "";
			
			do {
				tmpStr = br.readLine();	//readLine()�� ���ϰ��� String�̴�.
//				br�� ����Ű�� ������ 1���� �о tmpStr�� ����
//				tmpStr�� null�� �ƴ�
//				���� �����Ͱ� ������ tempstr�� null�� �ȴ�
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
//					\t�� �ش�.
				}
			} while (tmpStr != null); //true�̸� do�� �ݺ�ó��
			
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			// csvStr�� ����Ǿ� �ִ� ���ڿ����� "\t"�� �������� ��ū(����)�� ����
			int length = parse.countTokens() / 4;	//length = 4
//			parse.countTokens()���� 16�̴�. �� "\t"�� �����ڷ� �Ͽ�
//			��ū(���ڿ� ����)�� 16���� ������ ���̴�.
			
			String[] name = new String[length];	// 4���l �޸� ����
			String[] address = new String[length];
			
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
//			������ �迭�� ������ 4���� ���������.
			
			for (int i = 0; i < length; i++) {
				name[i] = parse.nextToken();
//				parse�� ù��° ��ū�� ����Ų��. ù��° ���ڿ��� �о
//				name[i]�� �����Ѵ�. ������ �Ŀ��� nextRoken()�޼ҵ� ���ؼ�
//				parse�� ���� ��ū�� ����Ű�� �ȴ�.
				address[i] = parse.nextToken();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
//				Double����Ŭ������ valueOf()�޼ҵ�� parse�� ����Ű�� ���ڿ��� 
//				��üŸ���� �Ǽ������� ��ȯ�Ѵ�. doubleValue()�޼ҵ�� ��ü Ÿ���� 
//				�Ǽ����� �⺻�� Ÿ������ ��ȯ�Ŀ� math[i]�� �����Ѵ�.
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2.0;
			}
			for (int j = 0; j < length; j++) {
				System.out.println(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] + "\t" + total[j]
						+ "\t" + avg[j]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�");
		}
	}
}

