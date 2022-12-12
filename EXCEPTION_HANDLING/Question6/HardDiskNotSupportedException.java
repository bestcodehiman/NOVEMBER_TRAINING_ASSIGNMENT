package EXCEPTION_HANDLING.Question6;

public class HardDiskNotSupportedException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "HardDiskNotSupportedException() : Disk type not supported for above selected processor";

	public HardDiskNotSupportedException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
