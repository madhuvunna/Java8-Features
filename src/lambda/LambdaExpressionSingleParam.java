package lambda;

interface Sayable {
	public String say(String name);
}

public class LambdaExpressionSingleParam {

	public static void main(String[] args) {
		Sayable s1 = (name) -> {
			return "Hello," + name;
		};
		System.out.println(s1.say("madhu"));

		Sayable s2 = (name) -> {
			return "Hello," + name;
		};
		System.out.println(s2.say("chandu"));

		// You can pass multiple statements in lambda expression
		Sayable madhu = (name) -> {
			String str = "i love you chandu,";
			String str2 = str + name;
			return str2;
		};
		System.out.println(madhu.say("please accept my proposal."));
	}

}
