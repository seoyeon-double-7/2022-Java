package test01;

import java.io.*;

public class studentDataMain {

	public static void main(String[] args) {
		studentDataExam sd = new studentDataExam();
		try {
			sd.readingData("C:/Temp/swrited.txt");
			sd.writingData("C:/Temp/swriting.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
