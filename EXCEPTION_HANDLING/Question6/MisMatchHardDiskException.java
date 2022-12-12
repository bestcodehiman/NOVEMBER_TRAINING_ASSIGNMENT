package EXCEPTION_HANDLING.Question6;

public class MisMatchHardDiskException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "MisMatchHardDiskException() : Disk type not supported for above selected processor";

	public MisMatchHardDiskException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
