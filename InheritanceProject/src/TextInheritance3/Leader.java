package TextInheritance3;

public class Leader extends Student{
	boolean boss;
	
	Leader(String name, String hakbun, boolean boss) {
		super(name, hakbun);	//Student Ŭ�������� ����
		this.boss = boss;
	}
	
	public void isLeader() {
		if(boss) 	//boss�� ture�̸� ���� ������ �����Ѵ�
			System.out.println(name + "�� �б�ȸ���̴�.");
		else
			System.out.println(name + "�� �б�ȸ���� �ƴϴ�.");
	}
}
