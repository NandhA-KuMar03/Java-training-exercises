package lorrydriver;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class calculateArrivalTime{
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	LocalDateTime inputDateTime;
	int distance;
	int speed;
	public calculateArrivalTime(LocalDateTime dateTime, int distance, int speed) {
		inputDateTime = dateTime;
		this.distance = distance;
		this.speed = speed;
	}
	public void calculate() {
		int timeToTravel = distance/speed;
		int inputDateRemaining = 23 - inputDateTime.getHour();
		int inputDateMinutesRemaining = 59 - inputDateTime.getMinute();
		int inputDateSecondsRemaining = 60 - inputDateTime.getMinute();
		
//		checking for the first day whether holiday or not
		if(isHoliday(inputDateTime)) {
			System.out.println("today is holiday " + inputDateTime.format(format));
			inputDateTime = inputDateTime.plusHours(inputDateRemaining).plusMinutes(inputDateMinutesRemaining).plusSeconds(inputDateSecondsRemaining);
			System.out.println(inputDateTime.format(format));
		}
		else{
			if(inputDateRemaining < 8 || timeToTravel< 8) {
				inputDateTime = inputDateTime.plusHours(inputDateRemaining);	
				timeToTravel-=inputDateRemaining;
			}
			if(inputDateRemaining > 8 && timeToTravel< 8) {
				inputDateTime = inputDateTime.plusHours(timeToTravel);	
				timeToTravel-=timeToTravel;
			}
			else{
				inputDateTime = inputDateTime.plusHours(8);
				int inputDateRemaining1 = 23 - inputDateTime.getHour();
				int inputDateMinutesRemaining1 = 59 - inputDateTime.getMinute();
				int inputDateSecondsRemaining1 = 60 - inputDateTime.getMinute();
				inputDateTime = inputDateTime.plusHours(inputDateRemaining1).plusMinutes(inputDateMinutesRemaining1).plusSeconds(inputDateSecondsRemaining1);
				timeToTravel-=8;
			}
		}
//		From the next day
		while(timeToTravel >= 8) {
			if(isHoliday(inputDateTime)) {
				System.out.println("today is holiday " + inputDateTime.format(format));
				inputDateTime = inputDateTime.plusDays(1);
				System.out.println(inputDateTime.format(format));
			}
			else {
				inputDateTime = inputDateTime.plusDays(1);
				timeToTravel-=8;	
			}
		}
		inputDateTime = inputDateTime.plusHours(timeToTravel);
		System.out.println("Arival date:" + inputDateTime.format(format));
		
	}
	
	boolean isHoliday(LocalDateTime inputDateTime) {
		return((inputDateTime.getDayOfWeek() == DayOfWeek.SUNDAY)||(inputDateTime.getDayOfWeek() == DayOfWeek.SATURDAY)&&(inputDateTime.getDayOfMonth()>7&&inputDateTime.getDayOfMonth()<=15)||(inputDateTime.getMonthValue() == 1 && inputDateTime.getDayOfMonth() ==26)||(inputDateTime.getMonthValue() == 8 && inputDateTime.getDayOfMonth() ==15)	||(inputDateTime.getMonthValue() == 1 && inputDateTime.getDayOfMonth() ==1));
	}
}