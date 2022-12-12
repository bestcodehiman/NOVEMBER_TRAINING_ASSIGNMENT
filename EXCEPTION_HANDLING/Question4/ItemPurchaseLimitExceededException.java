package EXCEPTION_HANDLING.Question4;

public class ItemPurchaseLimitExceededException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static String msg = "ItemPurchaseLimitExceededException() : Max Item purchase limit exceeeded";

	public ItemPurchaseLimitExceededException(String message) {
		super(msg + message);
	}

	public static String getMsg() {
		return msg;
	}
}
