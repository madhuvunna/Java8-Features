package lambda;

interface addable {
	int add(int a, int b);
}

public class LEMultipleParam {

	public static void main(String[] args) {

		addable ad = (a, b) -> (a + b);
		System.out.println(ad.add(23, 25));

		addable ad2 = (int a, int b) -> (a + b);
		System.out.println(ad2.add(100, 200));

		addable ad3 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(ad3.add(12, 13));
	}

}
