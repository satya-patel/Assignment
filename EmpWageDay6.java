
import java.util.*;

public class EmpWageDay6 implements WageCalci { 
    int employeeDailywage=0;
    int salary=0;
    int emphr=8;
    int hr=8;
    int i=0; 
 
 public static void main(String[] args) {

    System.out.println("\t \t \t Welcome to Employee Wage Computation");
    System.out.println("\nPRESS 1 to Calculate Wages till a condition of total working hours or days is reached for a month");
    System.out.println("\nPRESS 2 to Compute Employee Wage for multiple companies");
    Scanner sc=new Scanner(System.in);
     int choice=sc.nextInt();
     WageCalci wage=new EmpWageDay6();
     switch(choice){
         case 1:
              System.out.println(wage.wagecal());
             break;
         case 2:
             System.out.println("\nEnter Company wage per hour : ");
             int Comwage=sc.nextInt();
             System.out.println("\nEnter No. Of Working Days : ");
             int workingDays=sc.nextInt();
             System.out.println("\nEnter Working Hours Per Month : ");
             int workingHr=sc.nextInt();
             
             employWage(Comwage,workingDays, workingHr);
             break;
         default:
             System.out.println("Choose Appropriate choice !");
             break;
     
     }
     
     
   

}

 
 
public int wagecal() { 
    while(i<20 && hr<100){
        if(Math.floor(Math.random()*10)%2 == 1.0){
            System.out.println("Present Employee");
            employeeDailywage= emphr*hrrate;
            salary=employeeDailywage + salary;
            hr=hr+8;
	}
	else
	{
		System.out.println("Absent");
		employeeDailywage= emphr*0;
	}
	i=i+1;

}
return salary;
}

static public void employWage(int wage , int noWorkingDays , int workingHr){
    int totalHour=noWorkingDays*workingHr;
    int totalWage=totalHour*wage;
    System.out.println("Total wage  :  "+totalWage);
}

}


interface WageCalci { 
    int hrrate=20;
    int wagecal();
}

