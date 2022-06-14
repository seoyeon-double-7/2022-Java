package test01;

public class rankTest {
// 87 77 62 85 66 84 84 63 72 45
// 1  5  9  2  7  3  3  8  6  10
	public static void main(String[] args) {
		int score[] = {87, 77, 62, 85, 66, 84, 84, 63, 72, 45};
		int count[] = new int[10];
		for(int i=0; i<score.length; i++) {
			int cnt = 1;
			for(int j=0; j<score.length; j++) {
				if(score[j] > score[i]) cnt++;
			}
			count[i] = cnt;
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i] + " ");
		}

	}

}
