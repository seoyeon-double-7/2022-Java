package CircleArray02;

public class ArrayParameterEx {
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
	}
	
	static void replaceSpace(char b[]) {
		for (int i = 0; i < b.length; i++)
			if (b[i] == ' ')
				b[i] = ',';
	}

	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}	
}
