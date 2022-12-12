package EXCEPTION_HANDLING.Question1;

public class ResultException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "ResultException() : Student failed in more than 1 subject.";

	public ResultException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
