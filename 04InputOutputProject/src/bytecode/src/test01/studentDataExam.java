package test01;

import java.io.*;
import java.util.*;

public class studentDataExam {
	int length; 
	String[] snum = new String[10];
	String[] sname = new String[10];
	double[] korean = new double[10];
	double[] english = new double[10];
	double[] math = new double[10];
	double[] total = new double[10];
	double[] avg = new double[10];
	String[] level = new String[10];
	int[] rank = new int[10];
	
	public void writingData(String fname) throws IOException{
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(fname));
			bw = new BufferedWriter(fw);
			bw.write("학번\t이름\t\t국어\t영어\t수학\t총점\t평균\t학점\t등수\n");
			bw.write("===========================================================\n");
			for(int j=0; j<length; j++) {
				bw.write(snum[j]  + "\t" + sname[j] + "\t" + korean[j] + "\t" + english[j] + "\t" + math[j] + "\t" + total[j] + "\t" + avg[j] + "\t" + level[j]+"\t"+rank[j]);
				bw.newLine();
			}
			bw.close();	fw.close();
		}catch(FileNotFoundException e) {
			System.out.println("잘못된 파일 이름 입력했습니다");
		}
	}
	
	public void readingData(String fname) throws IOException{
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
			do {
				tmpStr = br.readLine();
				if(tmpStr != null)	csvStr += tmpStr + "\t";
			}while(tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			length = parse.countTokens() / 5;
			for(int i=0; i< length; i++) {
				snum[i] = parse.nextToken();
				sname[i] = parse.nextToken();
				korean[i] = Double.valueOf(parse.nextToken()).doubleValue();
				english[i] = Double.valueOf(parse.nextToken()).doubleValue();
				math[i] = Double.valueOf(parse.nextToken()).doubleValue();
				total[i] = korean[i] + english[i] + math[i];
				avg[i] = (int)(total[i] / 3.0);
				if(avg[i] >= 90) level[i] = "A";
				else if(avg[i] >= 80) level[i] = "B";
				else if(avg[i] >= 70) level[i] = "C";
				else if(avg[i] >= 60) level[i] = "D";
				else level[i] = "E";
			}
//			순위
			for(int i=0; i<length; i++) {
				int count[] = new int[10];
				for(int a=0; a<10; a++) {
					int cnt = 1;
					for(int b=0; b<10; b++) if(avg[b] > avg[a]) cnt++;
					count[a] = cnt;
				}
				rank[i] = count[i];
			}
		}catch (FileNotFoundException e) {
	         System.out.println("잘못된 파일 이름을 입력했습니다");
	      }
	}
}
