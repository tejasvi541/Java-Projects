package Main;
import Studentinfo.*;
import employs.*;
import java.util.*;

public class School {

	public static void main(String[] args) {
		System.out.println("Enter 1 to go to Student Department.\nEnter 2 to go to Employees Department.");
		Scanner console = new Scanner(System.in);
		
		int cho=0;
		cho = console.nextInt();
	   
		
		switch(cho)
		{
		case  1 :
		  {
			System.out.println("Enter student's information\n\n----------------------------");
			Student obj = new Student();
			Fees obj00 = new Fees();
			System.out.println("Enter Student's name");
			console.nextLine();
			obj.setName(console.nextLine());
			
			System.out.println("Enter Father's name");
			obj.setFname(console.nextLine());
			    
			System.out.println("Enter Date of birth");
			obj.setdob(console.nextLine());
			
			System.out.println("Enter class");
			obj.setclas(console.nextInt());
			
			System.out.println("Enter Roll number");
			obj.setroll_no(console.nextInt());
			
			System.out.println("Enter Gender");
			console.nextLine();
			obj.setgender(console.nextLine());
			
			System.out.println("Enter bloood group");
			obj.setblood_group(console.nextLine());
			
			System.out.println("Enter fee status\n\nEnter 1 if fee is paid Full.\n\nEnter 2 if to proceed to Fill fee left");
			cho=0;
			cho=console.nextInt();
			
			switch(cho)
			{
			case 1:
				   obj00.setfeest("Paid in Full");
			       System.out.println("Fees is paid in full");	
			       break;
			case 2:
				 obj00.setfeest("Enter Fee left\n");
				  obj00.setfee(console.nextInt());
			}
			
			
			System.out.println(obj.getName() + " | " + obj.getFname() + " | " + obj.getdob() + " | " + obj.getclas() + " | " + obj.getroll_no() + " | " + obj.getgender() + " | " + obj.getblood_group() + " | " + obj00.getfeest() + " | " + obj00.getfee() );
			
			break;
		  }
		case 2:
		 {
			 System.out.println("Enter 1 to enter to Teaching Department\nEnter 2 to enter Non-Teacging Department");
			 cho=0;
			 cho=console.nextInt();
			 
			switch(cho)
			{
			case 1:
			   {
				   System.out.println("Enter Teacher's information\n\n------------------------------");
					Teachers obj1 = new Teachers();
					System.out.println("Enter Teacher's name");
					console.nextLine();
					obj1.setName(console.nextLine());
					
					System.out.println("Enter Father's name");
					obj1.setFname(console.nextLine());
					
					System.out.println("Enter Date of birth");
					obj1.setdob(console.nextLine());
					
					System.out.println("Enter Subject teaching");
					obj1.setsub(console.nextLine());
					
					System.out.println("Enter Salary");
					obj1.setsal(console.nextInt());
					
					System.out.println("Enter years of work");
					obj1.setyow(console.nextInt());
					
					System.out.println("Enter year Joined");
					obj1.setyj(console.nextInt());
					
					System.out.println("Enter Gender");
					console.nextLine();
					obj1.setgender(console.nextLine());
					
					System.out.println("Enter bloood group");
					obj1.setblood_group(console.nextLine());			
					
					System.out.println(obj1.getName() + " | " + obj1.getFname() + " | " + obj1.getdob() + " | " + obj1.getsub() + " | " + obj1.getsal() + " | " + obj1.getyow() + " | " + obj1.getyj() + " | " + obj1.getgender() + " | " + obj1.getblood_group());
			   break;
			   }
			   
			case 2:
			   {
				System.out.println("Enter 1 to Go to Miscellneous Worker's Department\nEnter 2 to go to Fee Department");
				cho=0;
				cho = console.nextInt();
				
				switch(cho)
				  {
				case 1:
				    {
				    	 System.out.println("Enter Employee's information\n\n------------------------------");
							Workers obj2 = new Workers();
							System.out.println("Enter Emoloyee's name");
							console.nextLine();
							obj2.setName(console.nextLine());
							
							System.out.println("Enter Father's name");
							obj2.setFname(console.nextLine());
							
							System.out.println("Enter Date of birth");
							obj2.setdob(console.nextLine());
							
							System.out.println("Enter Work field");
							obj2.setfield(console.nextLine());
							
							System.out.println("Enter Salary");
							obj2.setsal(console.nextInt());
							
							System.out.println("Enter years of work");
							obj2.setyow(console.nextInt());
							
							System.out.println("Enter year Joined");
							obj2.setyj(console.nextInt());
							
							System.out.println("Enter Gender");
							console.nextLine();
							obj2.setgender(console.nextLine());
							
							System.out.println("Enter bloood group");
							obj2.setblood_group(console.nextLine());
							
							System.out.println(obj2.getName() + " | " + obj2.getFname() + " | " + obj2.getdob() + " | " + obj2.getfield() + " | " + obj2.getsal() + " | " + obj2.getyow() + " | " + obj2.getyj() + " | " + obj2.getgender() + " | " + obj2.getblood_group());
				            
							break;
				    }
				  }
			   	}
			  } 
		    }
		  }
		}
	  }


