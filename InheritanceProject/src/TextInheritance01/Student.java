package TextInheritance01;

public class Student {
//	������� �ۼ�
	String name;
	String hakbun;
	String telephone;
	String address;
	String department;
	
//	�޼ҵ� �ۼ�
	public Student() {};
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	public void study() {
		System.out.println("�����ϴ�.");
	}
	public void eat() {
		System.out.println("�Ļ��ϴ�.");
	}
	public void test() {
		System.out.println("���躸��.");
	}
	public void extra_act() {
		System.out.println("���Ƹ� Ȱ���ϴ�.");
	}
	
}
