package TextInheritance11;

public class SoundExam {

	public static void main(String[] args) {
		Sound radio = new Radio();	//업캐스팅과 유사
		//radio 객체 변수는 Radio 클래스에서 재정의 된  메소드에 접근
		Sound tv = new TV();	// 업캐스팅과 유사
		//tv 객체 변수는 Radio 클래스에서 재정의 된  메소드에 접근
		radio.SoundUp(5);
		tv.SoundUp(5);

	}

}
