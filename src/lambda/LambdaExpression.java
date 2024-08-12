package lambda;

@FunctionalInterface
interface Drawable {
	public void draw();
}

public class LambdaExpression {

	public static void main(String[] args) {
		int width = 23;
		Drawable d = () -> {
			System.out.println("Drawing:" + width);
		};
		d.draw();
	}

}
