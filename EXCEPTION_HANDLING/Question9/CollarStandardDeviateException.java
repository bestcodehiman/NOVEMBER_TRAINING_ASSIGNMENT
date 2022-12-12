package EXCEPTION_HANDLING.Question9;

public class CollarStandardDeviateException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "CollarStandardDeviateException() : More than 5 collars are deviating more from the allowed standard deviation size";

	public CollarStandardDeviateException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
