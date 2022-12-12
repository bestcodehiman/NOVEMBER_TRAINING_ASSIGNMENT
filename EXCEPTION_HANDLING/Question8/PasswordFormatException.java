package EXCEPTION_HANDLING.Question8;

public class PasswordFormatException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "PasswordFormatException() : Password should contain at least 2 capital letters, 2 small letters, 2 digits and 2 special characters and should be having length 8 to 14.";

	public PasswordFormatException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
