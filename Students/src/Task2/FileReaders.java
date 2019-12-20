package Task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaders {
	  static String COMMA = ",";
	  
	   static int STUDENT_ID= 0;
	   static int STUDENT_NAME= 1;
	   static int STUDENT_GRADE = 2; 
	   static int STUDENT_AGE = 3;

	   
	   public static void readCsvFile(String fileName) {
		   
	        BufferedReader fileReader = null;
	        
	        try {
	        	  List<Student> students = new ArrayList();
	              
	              String line = "";
	              fileReader = new BufferedReader(new FileReader(fileName));
	              
	             
	              fileReader.readLine();
	               
	             
	              while ((line = fileReader.readLine()) != null) {
	                 
	                  String[] tokens = line.split(COMMA);
	                  if (tokens.length > 0) {
	                     
	                      Student student = new Student(Long.parseLong(tokens[STUDENT_ID]), tokens[STUDENT_NAME], tokens[STUDENT_GRADE], Integer.parseInt(tokens[STUDENT_AGE]));
	                      students.add(student);
	                  }
	              }
	              for (Student student : students) {
	                  System.out.println(student.toString());
	              }
	              
	              
	          } 
	          catch (Exception e) {
	              System.out.println("Error in CsvFileReader !!!");
	              e.printStackTrace();
	          } finally {
	              try {
	                  fileReader.close();
	              } catch (IOException e) {
	                  System.out.println("Error while closing fileReader !!!");
	                  e.printStackTrace();
	              }
	          }
	        	
	        }
	        
	        
	        
}
