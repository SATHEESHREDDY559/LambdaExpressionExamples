package AnonymousClass;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorLambdaEx {
	public static void main(String[] args) {
		/*Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return Integer.compare(o1.length(), o2.length());
			}
			
		};*/
		
		//Lambda expression 
		
		//Comparator<String> comLambda =(String o1, String o2)-> Integer.compare(o1.length(), o2.length());
		Comparator<String> comLambda = (o1,o2)->Integer.compare(o1.length(), o2.length());
		
		List<String> list =  Arrays.asList("111", "1111", "1", "11");
		
		Collections.sort(list, comLambda);
	/*for(String s: list){
		
		System.out.println(s);
	}*/
		
		list.forEach(System.out::println);
	
	
	}

}
