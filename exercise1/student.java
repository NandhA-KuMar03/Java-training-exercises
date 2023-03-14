package student;
import java.util.Scanner;
public class student {
	String name;
	int rollno;
	public static void main(String[] args) {
		Exam examObj = new Exam();
		examObj.getMarks();
	}	
}

class Exam extends student{
	int mark1,mark2,mark3;
	public void getMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 Subject Marks");
		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
		Result rs = new Result(mark1,mark2,mark3);
		rs.CalculateTotal();
	}

}
 
class Result extends Exam{
	int TotalMark;
	public Result(int mark1, int mark2, int mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		TotalMark = mark1 + mark2 + mark3;
	}

	public void CalculateTotal() {
		System.out.println(TotalMark);
	}
}
