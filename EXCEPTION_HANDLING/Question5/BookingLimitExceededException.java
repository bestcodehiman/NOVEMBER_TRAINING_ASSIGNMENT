package EXCEPTION_HANDLING.Question5;

public class BookingLimitExceededException extends Exception{
	private static final long serialVersionUID = 1L;
	private static String msg = "BookingLimitExceededException() : Max tatkal tickets booking limit exceeded by 4.";

	public BookingLimitExceededException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
