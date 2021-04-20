
public class EmpWageOops implements WageCalci { 
    int employeeDailywage=0;
    int salary=0; int emphr=8;
    int hr=8;
    int i=0; 
 
 public static void main(String[] args) {

    WageCalci wage=new empWageOops();
    System.out.println(wage.wagecal());

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

//    public int WageCal() {  return 0; }
}


interface WageCalci { 
    int hrrate=20;
    int wagecal();
}

