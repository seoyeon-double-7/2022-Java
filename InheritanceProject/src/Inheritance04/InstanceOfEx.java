package Inheritance04;

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)				//p�� Person �ڷ����̸� True�߻�
			System.out.println("Person");	//p�� Student �ڷ����̸� True�߻�
		if(p instanceof Student)
			System.out.println("Student");
		if(p instanceof Researcher)
			System.out.println("Researcher");
		if(p instanceof Professor)
			System.out.println("Professor");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("new Student() --> \t"); print(new Student());
		System.out.println("new Student() --> \t"); print(new Researcher());
		System.out.println("new Student() --> \t"); print(new Professor());
	}

}
