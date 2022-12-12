package EXCEPTION_HANDLING.Question4;

public class Item {

	private Integer itemId;
	private String itemName;
	private Integer maxQuantity;
	private Integer price;

	public Item(Integer itemId, String itemName, Integer maxQuantity, Integer price)
			throws NoItemsSelectedInvalidPurchaseException {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		if (price == 0) {
			throw new NoItemsSelectedInvalidPurchaseException("Invalid price entered selected");
		}
		this.maxQuantity = maxQuantity;

		this.price = price;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) throws NoItemsSelectedInvalidPurchaseException {
		if (price == 0) {
			throw new NoItemsSelectedInvalidPurchaseException("Invalid price entered selected");
		}
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getMaxQuantity() {
		return maxQuantity;
	}

	public void setMaxQuantity(Integer maxQuantity) {
		this.maxQuantity = maxQuantity;
	}

}
