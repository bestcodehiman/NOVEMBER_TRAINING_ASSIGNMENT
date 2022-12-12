package EXCEPTION_HANDLING.Question6;

public class LowerRAMSizeException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "LowerRAMSizeException() : RAM size is lower than the expected RAM for the selected processor";

	public LowerRAMSizeException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
