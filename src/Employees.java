
import java.util.Scanner;
 
class Employee
{

    String name, grosssalary;
	static String category;
	float netSalary;
    Scanner get = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter category of the Employee:");
        category = get.nextLine();


    }
    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Address: "+category);
    }
    public static void main(String args[])
    {
      
    	System.out.println("===="+"\n"+"Enter Full Time Employee Details"+"\n"+"===="+"\n");
        MonthlyEmployees ob1 = new MonthlyEmployees();
        
        System.out.println("===="+"\n"+"Enter Part Time Employee Details"+"\n"+"===="+"\n");
        hourlyEmployees ob = new hourlyEmployees();
        ob1.display();
        ob.calculatepay();
        ob.display();
		       
        }
}