package FileTestExam;

import java.io.*;

class sungDatasMain {
	public static void main(String[] args) {
		sungDatasExam wd = new sungDatasExam();
//		sungDatasExam Ŭ������ wd ��ü ����
		try {
			wd.readingData("C:/Temp/writed.txt");
//			readingData�޼ҵ带 ȣ��. ���ڰ����� writed.txt����
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
