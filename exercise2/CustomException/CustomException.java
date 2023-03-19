package customexception;
import java.util.*;
/**
 * 
 * @author nandhakumar
 *class - Custom Exception
 *main method prompts the user to enter the temperature and passes the value to checkTemperature method
 *CheckTemperature throws the custom exception if condition fails
 */
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