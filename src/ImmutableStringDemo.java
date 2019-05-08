//1.Create the class as final
public final class ImmutableStringDemo {

	//Declare the member variables as final
	final int rollNo;
	final String name;

	//create a parameterized constructor
	ImmutableStringDemo(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}

	//define only the getter methods and no setter methods 
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}
}
