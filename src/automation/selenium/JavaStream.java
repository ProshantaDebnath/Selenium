package automation.selenium;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

	public static void JavaStreamDemo() {
		
		List<String> newList = new ArrayList<>();
		ArrayList<String> names = new ArrayList<String>();
		names.add("Adam");
		names.add("b");
		names.add("");
		names.add("Angel");
		names.add("");
		names.add("d");
		names.add("ele");
		
		

		names.forEach(e ->{
			if(!e.isEmpty()) {
				System.out.println(e);
			}
		});


		Iterator<String> it = names.iterator();
		it.forEachRemaining(a -> {
			System.out.println(a);
		});

		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("A")) {
				count++;
			}
		}
		

		
		System.out.println("For Loop Count results " + count);

		// Count the number of starts with A
		Long c = names.stream().filter(filteredElement -> filteredElement.startsWith("A")).count();
		System.out.println("Stream operation count" + c);

		Stream<String> streamList = names.stream().filter(filteredElement -> filteredElement.startsWith("A"));
		streamList.forEach(e ->{
			System.out.println(e);
		});

		
		/*Print the list whose length is greater than 2 */
		names.stream().filter(element -> (element.length() > 2 && element.startsWith("A") && !element.isEmpty()))
				.forEach(e -> newList.add(e));
		

		/*Using Stream to create data and print it*/
		Stream.of("Adam", "at", "BAS", "Angel").filter(fileredEle -> fileredEle.startsWith("A")).forEach( ele->{
			System.out.println(ele);
		});
		
		
		/*filter elements and convert into uppercase by using map*/
		Stream.of("Ad", "Bat", "Cat","Dog").filter(e->e.endsWith("t")).forEach(ele->ele.toUpperCase());
		names.stream().filter(e->e.startsWith("A")).map(e->e.toUpperCase()).forEach(ele->newList.add(ele));
		System.out.println(newList);
		
		
		/*Converting arrays in arrayList*/
		String[] arr = {"1","Dd"};		
		List<String>ConvertedList = Arrays.asList(arr);
		System.out.println(ConvertedList);
		
		/*Concat two stream into a single stream and remove empty element into the string */
		Stream<String> newStream = Stream.concat(names.stream(), ConvertedList.stream());
		newStream.filter(ele -> !ele.isEmpty()).forEach(e -> {
			System.out.println("List element "+": " + e);
		});
		
		/* anyMatch method for hard asseration */
		boolean flag = newStream.anyMatch(e -> e.equalsIgnoreCase("Adlm"));
		boolean flag1 = names.stream().anyMatch(e -> e.equalsIgnoreCase("Adlm"));
		System.out.println(flag);
		
		/*Stream Collect */ //Note .limit() is used to get index of value
		List<String> li = Stream.of("Akash", "Alom","Rama", "Joy", "Tin","Kia").filter(e->e.endsWith("a")).map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(li);
		
		/* Assignment -1 */
		List<Integer> integerArray = Arrays.asList(2,3,2,1,5,4,5,6);
		//printing unique number
		integerArray.stream().distinct();
		//Printing unique and sorted ordered
		List<Integer> uniqueAndSortedList = integerArray.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(uniqueAndSortedList.get(3));
	}

}
