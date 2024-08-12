package lambda2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Product> li = new ArrayList<Product>();

		li.add(new Product(15, "madhu", 20000f));
		li.add(new Product(5, "sushmitha", 100000f));
		li.add(new Product(2, "chandu", 500000f));

		//comparator method
//		System.out.println("sorting on the name..");
//
//		Collections.sort(li, (s1, s2) -> {
//			return s1.Name.compareTo(s2.Name);
//		});
//		for (Product p : li) {
//			System.out.println(p.id + " " + p.Name + " " + p.Price);
//
//		}
		
		 // using lambda to filter data  
        Stream<Product> filtered_data = li.stream().filter(p -> p.Price > 1000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                product -> System.out.println(product.Name+": "+product.Price)  
        );  
	}

}
