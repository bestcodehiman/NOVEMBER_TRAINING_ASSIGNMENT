package EXCEPTION_HANDLING.Question1;

public class FailedResultException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "FailedResultException() : Student failed.";

	public FailedResultException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
