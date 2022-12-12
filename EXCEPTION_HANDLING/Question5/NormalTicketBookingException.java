package EXCEPTION_HANDLING.Question5;

public class NormalTicketBookingException extends Exception {
	private static final long serialVersionUID = 1L;
	private static String msg = "NormalTicketBookingException() : Max ticket booking limit exceeded by 6.";

	public NormalTicketBookingException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
