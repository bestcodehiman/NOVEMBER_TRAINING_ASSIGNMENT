package EXCEPTION_HANDLING.Question4;

import java.util.HashMap;
import java.util.Map;

public class Question4 {

	public static void main(String args[])
			throws NoItemsSelectedInvalidPurchaseException, ItemPurchaseLimitExceededException {
		Map<Integer, Item> items = new HashMap<Integer, Item>() {
			{
				put(1, new Item(1, "Laptop", 2, 10000));
				put(2, new Item(2, "Pendrive", 5, 200));
			}
		};
		try {
			items.put(3, new Item(2, "Wifi Adapter", 2, 0));
		} catch (NoItemsSelectedInvalidPurchaseException e) {
			System.out.println(e.getMessage());
		}
		ItemsList itemsList = new ItemsList();
		itemsList.setItemsMap(items);

		new ItemBought(2, 5);
		try {
			new ItemBought(1, 3);
		} catch (ItemPurchaseLimitExceededException e) {
			System.out.println(e.getMessage());
		}
		try {
			new ItemBought(1, 0);
		} catch (NoItemsSelectedInvalidPurchaseException e) {
			System.out.println(e.getMessage());
		}
	}
}
