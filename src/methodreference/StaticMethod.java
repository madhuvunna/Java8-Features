package methodreference;

interface Sayable {
	void say();
}

public class StaticMethod {

	public static void saySomething() 
	{
		System.out.println("This is my darling chandu");
	}

	public static void main(String[] args) {
		
		// Referring static method
		Sayable sayable = StaticMethod::saySomething;

		// calling interface method
		sayable.say();
	}

}
