package EXCEPTION_HANDLING.Question6;

public class InsufficientDiskSpaceException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "InsufficientDiskSpaceException() : Insufficient storage space for the selected processor";

	public InsufficientDiskSpaceException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
