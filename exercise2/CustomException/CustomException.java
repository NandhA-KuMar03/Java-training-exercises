package customexception;
import java.util.*;
public class CustomException {  
	
    static void checkTemperature (int temperature) throws Temperature{    
       if(temperature < 16){  
        throw new Temperature("It will be too cold please select higher temperature");    
        }  
       else {   
        System.out.println("Temperature is set");   
        }   
     }    

    public static void main(String args[]){  
    	Scanner sc = new Scanner(System.in);
        try{    
        	System.out.println("Enter the temperature of the room");
        	int temp = sc.nextInt();
            checkTemperature(temp);  
        }  
        catch(Temperature ex)  
        {  
            System.out.println("Exception occured: " + ex);  
        }   
        finally {
        	System.out.println("end");
        }
    }  
}  