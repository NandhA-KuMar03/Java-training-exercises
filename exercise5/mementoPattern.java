package memento;

//public class MementoPattern {
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Memento {
	   String yearMemories;

	   public Memento(String yearMemories){
	      this.yearMemories = yearMemories;
	   }

	   public String getState(){
	      return yearMemories;
	   }	
	}

class OriginatorClass {
	   String year;

	   public void setState(String state){
	      this.year = state;
	   }

	   public String getState(){
	      return year;
	   }

	   public Memento saveYearToMemento(){
	      return new Memento(year);
	   }

	   public void getYearFromMemento(Memento year){
	      this.year = year.getState();
	   }
}

class CareTakerClass {
   List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento year){
      mementoList.add(year);
   }

   public Memento get(int indexOfTheYear){
      return mementoList.get(indexOfTheYear);
   }
}

public class MementoPattern {
	   public static void main(String[] args) {
	   
		  OriginatorClass originator = new OriginatorClass();
		  CareTakerClass careTaker = new CareTakerClass();
	      Scanner sc= new Scanner(System.in);
	      
	      System.out.println("Time Travel");
	      System.out.println("In 2002 what were you doing");
	      String year2002 = sc.next();
	      originator.setState(year2002);
	      careTaker.add(originator.saveYearToMemento());
	      
	      System.out.println("In 2006 what were you doing");
	      String year2010 = sc.next();
	      originator.setState(year2010);
	      careTaker.add(originator.saveYearToMemento());
	      
	      System.out.println("In 2016 what were you doing");
	      String year2016 = sc.next();
	      originator.setState(year2016);
	      careTaker.add(originator.saveYearToMemento());
	      
	      System.out.println("In 2023 what were you doing");
	      String year2023 = sc.next();
	      originator.setState(year2023);
	      careTaker.add(originator.saveYearToMemento());
	      
	      System.out.println("Currently you are in:" + originator.getState());		
	      System.out.println("Which year you want to go?");
	      int n = sc.nextInt();
	      switch(n) {
	      case 2002:
	    	  originator.getYearFromMemento(careTaker.get(0));
	    	  System.out.println("In 2002 you were : " + originator.getState());
	    	  break;
	      case 2010:
	    	  originator.getYearFromMemento(careTaker.get(1));
	    	  System.out.println("In 2006 you were : " + originator.getState());
	    	  break;  
	      case 2016:
	    	  originator.getYearFromMemento(careTaker.get(2));
	    	  System.out.println("In 2016 you were : " + originator.getState());
	    	  break;
	      case 2023:
	    	  originator.getYearFromMemento(careTaker.get(3));
	    	  System.out.println("In 2023 you were : " + originator.getState());
	    	  break; 
	      default:
	    	  System.out.println("Invalid year");
	    	  
	      }
	   }
	}