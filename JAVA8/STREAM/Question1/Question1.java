package JAVA8.STREAM.Question1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Question1 {
	public static void main(String[] args) throws Exception {
		ArrayList<Item> itemList = new ArrayList<Item>();
		itemList.add(0, new Item(101, "chocoCake", 200000f, LocalDateTime.of(2022, 8, 25, 2, 5), null));
		itemList.add(1, new Item(102, "orangecandy", 100.50f, LocalDateTime.of(2022, 8, 24, 2, 5), LocalDateTime.of(2021, 8, 24, 2, 5)));
		itemList.add(2, new Item(103, "muffins", 250.50f, LocalDateTime.of(2022, 8, 26, 2, 5), null));
		itemList.add(3, new Item(104, "vanilaCake", 200.50f, LocalDateTime.of(2022, 8, 22, 2, 5), LocalDateTime.of(2020, 8, 2, 2, 5)));
		itemList.add(4, new Item(105, "new pastery", 100.50f, LocalDateTime.of(2022, 8, 27, 4, 5), null));
		itemList.add(5, new Item(106, "old pastery", 100.50f, LocalDateTime.of(2022, 8, 22, 2, 5), null));
		itemList.add(6, new Item(107, "brownie", 80.50f, LocalDateTime.of(2022, 8, 23, 4, 5), LocalDateTime.of(2021, 8, 24, 2, 5)));
		itemList.add(7, new Item(108, "chocoCake", 200.50f, LocalDateTime.of(2022, 8, 21, 2, 5), LocalDateTime.of(2020, 8, 2, 2, 5)));
		itemList.add(8, new Item(109, "brownie", 80.50f, LocalDateTime.of(2022, 8, 28, 3, 5), null));
		itemList.add(9, new Item(110, "vanilaCake", 200.50f, LocalDateTime.of(2022, 8, 25, 3, 5), LocalDateTime.of(2020, 8, 2, 2, 5)));

		//1.
		averagePrice(itemList);
		//2.
		highestPrice(itemList);
		//2.
		lowestPrice(itemList);
		//3
		highestPriceNOExpire(itemList);
		//4.5.
		storeFromListToSet(itemList);
		
	}
	
	
	private static void highestPriceNOExpire(ArrayList<Item> itemList) {
		
		Optional<Item> findFirst = itemList.stream().filter(n -> n.getDate_of_expiry() == null)
				.max(Comparator.comparing(Item::getPrice));
		System.out.println(findFirst);
	}

	private static void averagePrice(ArrayList<Item> itemList) {
		double avg = itemList.stream().mapToDouble(i->i.getPrice()).average().orElse(0);
		System.out.println("Avergae is -"+avg);
	}

	private static void highestPrice(ArrayList<Item> itemList) {
		Optional<Item> max = itemList.stream().max(Comparator.comparing(Item::getPrice));
		System.out.println("The Highest Price is - " + max.get().getPrice());
	}

	private static void lowestPrice(ArrayList<Item> itemList) {
		Optional<Item> min = itemList.stream().min(Comparator.comparing(Item::getPrice));
		System.out.println("The Lowest Price is - " + min.get().getPrice());
	}

	private static void storeFromListToSet(ArrayList<Item> itemList) {
		Set<String> setItemList  = new HashSet<>();
		setItemList = itemList.stream().map(item -> item.itemName + " " + item.price).collect(Collectors.toSet());
		//setItemList.stream().collect(Collectors.toSet()).forEach(System.out::println);
		System.out.println(setItemList.toString());
	}
	
}
