package FileWriteExam;

import java.io.*;
import java.util.*;

public class sungDataRWExam {
   int length;
   String[] name = new String[10];
   String[] address = new String[10];
   double[] math = new double[10];
   double[] english = new double[10];
   double[] total = new double[10];
   double[] avg = new double[10];

   public void writingData(String fname) throws IOException {
      // String fname = "C:/Temp/writing.txt"
      FileWriter fw = null;
      BufferedWriter bw = null;
      try {
         fw = new FileWriter(new File(fname));
         // fw�� "writing.txt"������ ����Ű�� ��ü�����̴�.
         bw = new BufferedWriter(fw);
         // bw�� fw�� ��Ű�� ������ ����Ű��, ���۶�� Ŭ������ �߰��Ͽ� ����Ѵ�.
         
         for (int j = 0; j < length; j++) {
            bw.write(name[j] + "\t" + address[j] + "\t" + math[j] + "\t" + english[j] 
                  + "\t" + total[j] + "\t" + avg[j]);
            // bw�� ����Ű�� ���� "writing.txt"�� ����Ѵ�.
            bw.newLine(); // BufferedWriterŬ������ newLine()�޼ҵ带 ������ �ִ�.  
            // newLine()�� �ٹٲ�
         }
         bw.close(); // ������ �������� ��ü������ �������� �Ѵ�. 
         fw.close();
      } catch (FileNotFoundException e) {
         System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�");
      }
   }

   public void readingData(String fname) throws IOException {
      // String fname = "C:/Temp/writed.txt"
      // �迭�� �������� ���� �о���� �����͸� �����Ѵ�.
      try {
         String csvStr = "";
         String tmpStr = "";
         FileReader fr = new FileReader(new File(fname));
         BufferedReader br = new BufferedReader(fr);
         do {
            tmpStr = br.readLine();
            if (tmpStr != null) {
               csvStr += tmpStr + "\t";
            }
         } while (tmpStr != null);
         StringTokenizer parse = new StringTokenizer(csvStr, "\t");
         length = parse.countTokens() / 4;
         for (int i = 0; i < length; i++) {
            name[i] = parse.nextToken();
            address[i] = parse.nextToken();
            math[i] = Double.valueOf(parse.nextToken()).doubleValue();
            english[i] = Double.valueOf(parse.nextToken()).doubleValue();
            total[i] = math[i] + english[i];
            avg[i] = total[i] / 2.0;
         }
      } catch (FileNotFoundException e) {
         System.out.println("�߸��� ���� �̸��� �Է��߽��ϴ�");
      }
   }
}