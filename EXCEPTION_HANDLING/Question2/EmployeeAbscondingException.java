package EXCEPTION_HANDLING.Question2;

public class EmployeeAbscondingException extends Exception{
	private static final long serialVersionUID = 1L;
	private static String msg = "EmployeeAbscondingException() : Employee ebsconding continuosly from 4 days.";

	public EmployeeAbscondingException() {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
