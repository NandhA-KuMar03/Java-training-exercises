package student;

public class student {
	String name;
	int rollno;
	public static void main(String[] args) {
		Result rs = new Result();
		rs.CalculateTotal();
	}
	
}
class Exam extends student{
	int mark1=10;
	int mark2=20;
	int mark3=30;
}

class Result extends Exam{
	int TotalMark;
	public void CalculateTotal() {
		System.out.println(mark1 + mark2+ mark3);
	}
}
