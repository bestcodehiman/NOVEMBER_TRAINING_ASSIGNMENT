package EXCEPTION_HANDLING.Question4;

public class NoItemsSelectedInvalidPurchaseException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static String msg = "NoItemsSelectedInvalidPurchaseException() : ";

	public NoItemsSelectedInvalidPurchaseException(String message) {
		super(msg + message);
	}

	public String getMsg() {
		return msg;
	}
}
