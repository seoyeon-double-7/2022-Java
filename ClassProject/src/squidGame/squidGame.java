package squidGame;

import java.util.Random;
import java.util.Scanner;

public class squidGame {

	//Ŭ����
	public static void progress(String[][] arr_glass, int turn) {
		for (int i = 0; i < arr_glass.length; i++) {
			System.out.print("��");
			for (int j = 0; j < arr_glass[i].length; j++) {
				System.out.print("   " + arr_glass[i][j] + "   ");
			}
			System.out.print("��");
			if (i == turn + 1)
				System.out.println("<-------����ġ");
			else
				System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int index = 17;
			int turn = 17;
			int life = 16;
			boolean[][] arr_bool = new boolean[18][2];
			String[][] arr_glass = new String[18][2];
			for (int i = 0; i < arr_bool.length; i++) {
				arr_bool[i][0] = new Random().nextBoolean();
				arr_bool[i][1] = !arr_bool[i][0];
				for (int j = 0; j < arr_bool[i].length; j++) {
					arr_glass[i][j] = "��";
					// System.out.print(arr_bool[i][j]);
				}
				// System.out.println();
			}
			
			//��ºκ�
			System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡٿ�¡�� ���� �ٸ� �ǳʱ�ڡ١ڡ١ڡ١ڡ١ڡ�");
			System.out.println("1.���� ���� 2.���� ���");
			int ch = sc.nextInt();
			
			//���ӽ���
			if (ch == 1) {
				while (true) {
					squidGame.progress(arr_glass, turn);
					System.out.println(17 - life + "�� ������ ����!");
					System.out.println("����� ������?\n1.���� 2.������");
					int ch2 = sc.nextInt();
					if (ch2 == 1 || ch2 == 2) {
						if (arr_bool[index][ch2 - 1] == true) {
							System.out.println("����!");
							index--;
							turn--;
						} else {
							System.out.println("���!");
							arr_glass[index][ch2 - 1] = " ";
							index = 17;
							turn = 17;
							life--;
						}

					} else
						System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
					if (life == 0) {
						System.out.println("���� ����");
						break;
					}
					if (turn == -1) {
						System.out.println("���!!!!!!!!!!!");
						break;
					}
				}
			} 
			//���ӹ��
			else if (ch == 2)
				System.out.println("��¡����� ���� ������");
			else
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���");
		}
		
	}
}