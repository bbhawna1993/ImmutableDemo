
public class Test {

	public static void main(String[] args) {

		ImmutableStringDemo obj =new ImmutableStringDemo(1,"bhawna");
		System.out.println(obj.getName());
		System.out.println(obj.getRollNo());
		//obj.rollNo=2; //error since rollno is a final field
	}

}
