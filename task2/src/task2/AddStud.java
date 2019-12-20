package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStud {
	
	
	 static SecondTa obj2=new SecondTa();

	public static void add() {
		// TODO Auto-generated method stub
		{
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the details of the students: ");
		    String details=sc.next();
		    String comma=",";
		    int values=4;
		    String arr[] = new String[10];
		    String[] cutting;
		    ArrayList<SecondTa> al=new ArrayList<>();
		    ArrayList<SecondTa> al2=new ArrayList<>();
		    for (int i = 0; i < values; i++) {
		      cutting = details.split(comma);
		     
		     
		      obj2.setRoll_no(Integer.parseInt(cutting[0]));
				obj2.setName(cutting[1]);
				obj2.setGrade(cutting[2].charAt(0)); 
				obj2.setAge(Integer.parseInt(cutting[3]));
				
		      //SecondTa(name,age,grade,roll);
		      
		     
		      //System.out.println("1.Name: " + obj1.name+ " \n" + "2.Age: " + obj1.age + "\n3.Grade: " + obj1.grade + "\n4.Roll Number: " + obj1.roll_no);

		    }
		    al.add(obj2);
		      al2.add(obj2);
		      
		      System.out.println(al);
		      
		  }
		
		
	}

}
