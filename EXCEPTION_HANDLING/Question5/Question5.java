package EXCEPTION_HANDLING.Question5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Question5 {
	public static void main(String args[]) throws NumberFormatException, IOException, BookingNotAllowedException,
			BookingLimitExceededException, NormalTicketBookingException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the current time in the format HH:mm:ss ->");
		String time = bf.readLine();
		LocalTime s = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
		if (s.isAfter(LocalTime.of(23, 0, 0)) || s.isBefore(LocalTime.of(1, 0, 0))) {
			throw new BookingNotAllowedException();
		}
		System.out.println("Enter the no of tickets to be booked ->");
		Integer noOfTickets = Integer.parseInt(bf.readLine());
		if (s.isAfter(LocalTime.of(10, 0, 0)) && s.isBefore(LocalTime.of(12, 0, 0))) {
			if (noOfTickets > 4) {
				throw new BookingLimitExceededException();
			}
		} else {
			if (noOfTickets > 6) {
				throw new NormalTicketBookingException();
			}
		}
		System.out.println("Tickets booked successfully");
	}
}
