package Inheritance08;

public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
// MobielPhoneInteface�� �߻� �޼ҵ� ����
	@Override
	public void sendSMS() {
		System.out.println("������������");
	}
	
	@Override
		public void receiveCall() {
			System.out.println("��ȭ�� �Ծ��");
		}
	@Override
		public void receiveSMS() {
			System.out.println("���ڰ��ϴ�..");	
		}
	
	public void receiveSMS() {
		System.out.println("���ڿԾ��");
		
	}
//	Mp3 Interface�� �߻�޼ҵ� ����
}
