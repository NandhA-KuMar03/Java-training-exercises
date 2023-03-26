package lorrydriver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LorryDriverTruck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the start date of the truck : YYYY-MM-DD");
	    String stringDate = sc.next();
	    LocalDate date = LocalDate.parse(stringDate, DateTimeFormatter.ISO_DATE);
	    
		System.out.println("Enter the start time of the truck: HH-MM-SS");
	    String stringTime = sc.next();
		LocalTime time =LocalTime.parse(stringTime, DateTimeFormatter.ISO_TIME);

		System.out.println("Enter the Distance to be travelled:");
		int distance = sc.nextInt();
		
		System.out.println("Enter the Speed:");
		int speed=sc.nextInt();
		
		LocalDateTime dateTime = LocalDateTime.parse(date+"T"+time);
		calculateArrivalTime obj = new calculateArrivalTime(dateTime, distance, speed);
		obj.calculate();
		sc.close();
	}
}