package EXCEPTION_HANDLING.Question5;

public class BookingNotAllowedException extends Exception{
	private static final long serialVersionUID = 1L;
	private static String msg = "BookingNotAllowedException() : Booking not allowed currently.";

	public BookingNotAllowedException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
