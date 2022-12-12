package COLLECTION.Question5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class Question5 {

	public static void main(String[] args) {
		Vector<Item> itemsVector = new Vector<Item>(
				Arrays.asList(new Item(2, "glass", 30), new Item(3, "dishes", 100), new Item(1, "spoons", 30)));
		System.out.println("Actual vector of items are : " + itemsVector);
		Collections.sort(itemsVector, new Comparator<Item>() {
			public int compare(Item item1, Item item2) {
				if (item1.getId() > item2.getId()) {
					return 1;
				}
				return -1;
			}
		});
		System.out.println("Sorted vector items are : " + itemsVector);
	}

}
