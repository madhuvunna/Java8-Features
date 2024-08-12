package streamfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<College> li = new ArrayList<College>();
		li.add(new College(1, "madhu", 1500000));
		li.add(new College(5, "chandu", 2500000));
		li.add(new College(9, "sushmitha", 5500000));
		li.add(new College(1, "vunna", 9600000));

		// li.stream().filter(p -> p.fee > 500000).map(pm ->
		// pm.fee).forEach(System.out::println);

		List<Float> collegelist = li.stream()
				                  .filter(p -> p.fee > 500000)
				                  .map(pm -> pm.fee)
				                  .collect(Collectors.toList());
		System.out.println(collegelist);
	}

}
