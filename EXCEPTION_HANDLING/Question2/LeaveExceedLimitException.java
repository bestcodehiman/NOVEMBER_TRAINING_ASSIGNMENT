package EXCEPTION_HANDLING.Question2;

public class LeaveExceedLimitException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "LeaveExceedLimitException() : Max leave limit exceeded by 2.";

	public LeaveExceedLimitException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
