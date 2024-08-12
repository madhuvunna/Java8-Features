package functionalinterface;

@FunctionalInterface
interface sayable{
	void say(String msg);
}
public class FuncInterfaceExample implements sayable {

	public void say(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String args[]) {
		FuncInterfaceExample fie = new FuncInterfaceExample();
		fie.say("my sweet darling chandu");
	}
}
