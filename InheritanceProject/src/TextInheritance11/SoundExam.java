package TextInheritance11;

public class SoundExam {

	public static void main(String[] args) {
		Sound radio = new Radio();	//��ĳ���ð� ����
		//radio ��ü ������ Radio Ŭ�������� ������ ��  �޼ҵ忡 ����
		Sound tv = new TV();	// ��ĳ���ð� ����
		//tv ��ü ������ Radio Ŭ�������� ������ ��  �޼ҵ忡 ����
		radio.SoundUp(5);
		tv.SoundUp(5);

	}

}
