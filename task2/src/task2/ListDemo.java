package task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[10];
		int h = 0;
		SecondTa[] array = new SecondTa[10];
		SecondTa obj1 = new SecondTa();
		try {

			File fin = new File("E:\\sample.txt");
			BufferedReader br = new BufferedReader(new FileReader(fin));
			String st;
			String d = ",";
			int count = 0;
			System.out.println("The datas on file:");
			while ((st = br.readLine()) != null) {

				arr[h] = st;
				h++;
				count++;

				System.out.println(st);
			}
//			System.out.println("\n The Datas are stored to a array: ");
//			for (int i = 0; i < count; i++) {
//				System.out.println("Array Index" + i + ": " + arr[i]);
//			}
			System.out.println("\n");
			// System.out.println(arr[2]);



			String[] cutting;
			ArrayList<SecondTa> al = new ArrayList<>();
			ArrayList<SecondTa> al2 = new ArrayList<>();
			for (int i = 0; i < count; i++) {
				cutting = arr[i].split(d);

				SecondTa obj2 = new SecondTa();
				obj2.setRoll_no(Integer.parseInt(cutting[0]));
				obj2.setName(cutting[1]);
				obj2.setGrade(cutting[2].charAt(0));
				obj2.setAge(Integer.parseInt(cutting[3]));

				array[i] = obj2;
				// SecondTa(roll,name,grade,age);

				al.add(obj2);
				al2.add(obj2);

			}
			System.out.println("Stored on List: ");
			//System.out.println(al);

			for (int i = 0; i < count; i++) {

				System.out.println(array[i]);
			}

			Scanner sc = new Scanner(System.in);

			System.out.println("Please select by which means you need to sort:");
			System.out.println("Please select any  below options:");
	        System.out.println("1. Add.\n2. Update.\n3. Remove.\n4. Cancel");
			try {
		        
		        def: while(true)
		       {
		        	
		          int sort=sc.nextInt();
		         
		         switch (sort)
		         {
		         case 1:
		         {
		        	 AddStud.add();
						al.add(AddStud.obj2);
						// al2.add(AddStud.obj2);
						break;
		         } 
		         case 2:
		         {
		        	 System.out.println("enter the roll no");
						int roll = sc.nextInt();
						System.out.println("1.Name\n2.Age\n3.Grade");
						int value = sc.nextInt();
						switch (value) {
						case 1: {
							System.out.println("enter the name");
							String new_name = sc.next();
							(array[roll - 1].name) = new_name;
							System.out.println(al);
							break;
						}
						case 2: {
							System.out.println("enter the age");
							int new_age = sc.nextInt();
							(array[roll - 1].age) = new_age;
							System.out.println(al);
							break;
						}
						case 3: {
							System.out.println("enter the grade");
							char new_grade = sc.next().charAt(0);
							(array[roll - 1].grade) = new_grade;
							System.out.println(al);
							break;
						}
						
						}
						break;
		         }
		         case 3:
		         {
		        	 System.out.println("Enter the Roll no  of Student:");
						int a = sc.nextInt();

						al2.remove(a - 1);
						System.out.println(al2);
						break;
						

		         }
		        
		         case 4:
		         {
		           break def;
		         }
		         
		         }
		         if(sort==4)
		           break;
		         if((sort<4))
		           System.out.println("Select number from only below options");
		       al2=al;
		        }
		       System.out.println("Please select by which means you need to sort:");
		       System.out.println("1.Sort by Name.\n2.Sort by Grade.\n3.Sort by Age.\n4.cancel");
		       
		         abc: while(true)
		          {
		        	 try (FileWriter f = new FileWriter("E:\\output.txt", true);
		                     BufferedWriter b = new BufferedWriter(f);
		                     PrintWriter p = new PrintWriter(b);) {
		            int methods=sc.nextInt();
		           switch(methods)
		           {
		             
		           case 1:
		           {
		             System.out.println("\nSORTING......\n");
		             System.out.println("before sorting"+al);
		           System.out.println("\nSorted by Name:\n");
		           NameSort ncp=new NameSort();
		           Collections.sort(al, ncp);
		           System.out.println("after sorting"+al);
		           break;
		           }
		           case 2:
		           {
		             System.out.println("\nSORTING......\n");
		             System.out.println("before sorting"+al);
		           System.out.println("\nSorted by Grade:\n");
		           GradeSort  gcp=new GradeSort ();
		           Collections.sort(al, gcp);
		           System.out.println("after sorting"+al);
		         
		           break;
		           }
		           case 3:
		           {
		             System.out.println("\nSORTING......\n");
		             System.out.println("before sorting"+al);
		           System.out.println("\nSorted by Age:\n");
		           AgeSort  acp=new AgeSort ();
		           Collections.sort(al, acp);
		           System.out.println("after sorting"+al);
		         
		           break;
		           }
		           case 4:
		           {
		        	   p.println("--------------------------The Final Student Details are-------------------------------");
		               p.println("\n");
		               p.println(al);
		             break abc;
		           }
		           }} catch (Exception e) {
		                
		             }
		         

		       }
		   }
		       catch(Exception e)
		       {
		         System.out.println("Please enter only the relevant options");
		        // System.out.println(e);
		       }    
		   } catch (Exception e) {
		     System.out.println(e);
		   }
		 }  }
			

