package methodreference;

interface Drawable {
	void say();
}

public class InstanceMethod {
	public void saySomething() {
		System.out.println("This is my darling chandu");
	}

	public static void main(String[] args) {
		InstanceMethod instancemethod = new InstanceMethod();

		// Referring non-static method using reference
		Drawable drw = instancemethod::saySomething;

		// Calling interface method
		drw.say();

		// Referring non-static method using anonymous object
		Drawable drw2 = new InstanceMethod()::saySomething;

		// calling interface method
		drw2.say();

	}

}
