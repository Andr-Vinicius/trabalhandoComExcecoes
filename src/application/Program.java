package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {		
			System.out.print("Room: ");
			int number = sc.nextInt();
			
			System.out.print("Check-in Date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next()); // Texto -> Date
			
			System.out.print("Check-out Date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next()); // Texto -> Date
		
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.print(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			
			System.out.print("Room: ");
			number = sc.nextInt();
			
			System.out.print("Check-in Date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next()); // Texto -> Date
			
			System.out.print("Check-out Date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next()); // Texto -> Date
			
	
			reservation.UpdateDates(checkIn, checkOut);
			System.out.print(reservation);
	
		}catch(ParseException e) {
			System.out.println("Inválid date format");	
			
		}catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		
		}catch(RuntimeException e){
			System.out.println("Unexpected Error!");
		}finally {
			sc.close();	
		}	
	}

}
