package EXCEPTION_HANDLING.Question4;

public class ItemBought {

	private Integer itemId;
	private Integer itemQuantity;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(Integer itemQuantity) throws NoItemsSelectedInvalidPurchaseException {
		if (itemQuantity == 0) {
			throw new NoItemsSelectedInvalidPurchaseException("No product selected, Invalid quantity selected");
		}
		this.itemQuantity = itemQuantity;
	}

	public ItemBought(Integer itemId, Integer itemQuantity)
			throws ItemPurchaseLimitExceededException, NoItemsSelectedInvalidPurchaseException {
		super();
		this.itemId = itemId;
		Integer maxQuantity = ItemsList.getItemsMap().get(itemId).getMaxQuantity();
		if (itemQuantity > maxQuantity) {
			throw new ItemPurchaseLimitExceededException("");
		}
		if (itemQuantity == 0) {
			throw new NoItemsSelectedInvalidPurchaseException("No product selected, Invalid quantity selected");
		}
		this.itemQuantity = itemQuantity;
	}

}
