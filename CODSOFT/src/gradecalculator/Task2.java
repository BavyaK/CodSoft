package gradecalculator;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the marks: ");
			 int mark1 = sc.nextInt();
			 int mark2 = sc.nextInt();
			 int mark3 = sc.nextInt();
			 int mark4 = sc.nextInt();
			 int mark5 = sc.nextInt();
			 int TotalMarks = mark1+mark2+mark3+mark4+mark5;
			 System.out.println("The TotalMarks Scored is:"+TotalMarks);
			 double average = (mark1+mark2+mark3+mark4+mark5)/5;
			 System.out.println("The Average Percentage is:"+average+"%");
			 char grade;
			 if(average>=80){
			     grade = 'A';
			  }else if(average>=60 && average<80){
			     grade = 'B';
			  }
			  else if(average>=40 && average<60){
			     grade = 'C';
			  }
			  else {
			     grade = 'D';
			  }

			  switch(grade) {
			     case 'A' :
			        System.out.println("Excellent!");
			        break;
			     case 'B' :
			    	 System.out.println("Good.");
			    	 break;
			     case 'C' :
			        System.out.println("Passed");
			        break;
			     case 'D' :
			        System.out.println("Better luck next time.");
			        break;
			     default :
			        System.out.println("Invalid grade");
			  }
			 
			  System.out.println("Your grade is " + grade);
		}
       }

	}


