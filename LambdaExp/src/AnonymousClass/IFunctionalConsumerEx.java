package AnonymousClass;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class IFunctionalConsumerEx {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("1", "111", "1111", "11111");
		List<String> result = new ArrayList<String>();
		
		Consumer<String> c= System.out::println;
		
		Consumer<String> c2=result::add;
		
		list.forEach(c.andThen(c2));
		System.out.println("Size of Result "+result.size());
		

	}

}
