package Inheritance08;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
// MobielPhoneInteface의 추상 메소드 구현
	@Override
	public void sendSMS() {
		System.out.println("따르릉따르릉");
	}
	
	@Override
		public void receiveCall() {
			System.out.println("전화가 왔어요");
		}
	@Override
		public void receiveSMS() {
			System.out.println("문자갑니다..");	
		}
	
	public void receiveSMS() {
		System.out.println("문자왔어요");
		
	}
//	Mp3 Interface의 추상메소드 구현
}
