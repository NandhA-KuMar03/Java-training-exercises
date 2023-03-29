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
		int timeToTravelHours = distance/speed;
		int timeToTravelMinutes1 = 0;
		float timeToTravelMinutes = distance%speed;
//		float timeToTravelMinutes = 0;
		int totalMin = 1440 - 60 * inputDateTime.getHour() - inputDateTime.getMinute();
		int inputDateHoursRemaining = totalMin / 60;
		int inputDateMinutesRemaining = totalMin % 60;
		System.out.println(inputDateHoursRemaining + "   " + inputDateMinutesRemaining);
		
//		checking for the first day whether holiday or not
		if(isHoliday(inputDateTime)) {
			System.out.println("today is holiday " + inputDateTime.format(format));
			inputDateTime = inputDateTime.plusHours(inputDateHoursRemaining).plusMinutes(inputDateMinutesRemaining);
			System.out.println(inputDateTime.format(format));
		}
		else{
			if(inputDateHoursRemaining <= 8) {
				inputDateTime = inputDateTime.plusHours(Math.min(inputDateHoursRemaining, timeToTravelHours)).plusMinutes(Math.max(inputDateMinutesRemaining, (int)timeToTravelMinutes));
				timeToTravelHours -= Math.min(inputDateHoursRemaining, timeToTravelHours);
				timeToTravelMinutes1 += Math.max(inputDateMinutesRemaining, (int)timeToTravelMinutes);
			}
			else {
				inputDateTime = inputDateTime.plusHours(Math.min(8, timeToTravelHours));
				timeToTravelHours -= Math.min(8, timeToTravelHours);
				if(timeToTravelHours > 0) {
					int totalMin1 = 1440 - 60 * inputDateTime.getHour() - inputDateTime.getMinute();
					int inputDateHoursRemaining1 = totalMin1 / 60;
					int inputDateMinutesRemaining1 = totalMin1 % 60;
					System.out.println("Rounding");
					inputDateTime = inputDateTime.plusHours(inputDateHoursRemaining1).plusMinutes(inputDateMinutesRemaining1);	
				}
			}
		}
//		From the next day
		System.out.println(timeToTravelHours);
		System.out.println(inputDateTime.format(format));
		while(timeToTravelHours > 8) {
			if(isHoliday(inputDateTime)) {
				System.out.println("today is holiday above 8" + inputDateTime.format(format));
				inputDateTime = inputDateTime.plusDays(1);
				System.out.println(inputDateTime.format(format));
			}
			else {
				inputDateTime = inputDateTime.plusHours(8);
				int totalMin2 = 1440 - 60 * inputDateTime.getHour() - inputDateTime.getMinute();
				int inputDateHoursRemaining2 = totalMin2 / 60;
				int inputDateMinutesRemaining2 = totalMin2 % 60;
				inputDateTime = inputDateTime.plusHours(inputDateHoursRemaining2).plusMinutes(inputDateMinutesRemaining2);
				timeToTravelHours-=8;	
			}
		}
		
		while(timeToTravelHours <= 8) {
			if(isHoliday(inputDateTime)) {
				System.out.println("today is holiday less than 8 " + inputDateTime.format(format));
				inputDateTime = inputDateTime.plusDays(1);
//				int inputDateRemaining1 = 23 - inputDateTime.getHour();
//				int inputDateMinutesRemaining1 = 59 - inputDateTime.getMinute();
//				int inputDateSecondsRemaining1 = 59 - inputDateTime.getMinute();
//				inputDateTime = inputDateTime.plusHours(inputDateRemaining1).plusMinutes(inputDateMinutesRemaining1).plusSeconds(inputDateSecondsRemaining1);
				System.out.println(inputDateTime.format(format));
			}
			else {
				inputDateTime = inputDateTime.plusHours(timeToTravelHours);
				if(timeToTravelMinutes >0) {
					System.out.println(timeToTravelMinutes);
					inputDateTime = inputDateTime.plusMinutes((long) (6*timeToTravelMinutes));	
				}
				if(timeToTravelMinutes1 >0) {
					System.out.println(timeToTravelMinutes1);
					inputDateTime = inputDateTime.minusMinutes(timeToTravelMinutes1);	
				}
				System.out.println("Arrival date:" + inputDateTime.format(format));	
				break;
			}
		}
	}
	
	boolean isHoliday(LocalDateTime inputDateTime) {
		return((inputDateTime.getDayOfWeek() == DayOfWeek.SUNDAY)||(inputDateTime.getDayOfWeek() == DayOfWeek.SATURDAY)&&(inputDateTime.getDayOfMonth()>7&&inputDateTime.getDayOfMonth()<=15)||(inputDateTime.getMonthValue() == 1 && inputDateTime.getDayOfMonth() ==26)||(inputDateTime.getMonthValue() == 8 && inputDateTime.getDayOfMonth() ==15)	||(inputDateTime.getMonthValue() == 1 && inputDateTime.getDayOfMonth() ==1));
	}
}
