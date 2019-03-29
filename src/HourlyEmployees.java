

class hourlyEmployees extends Employee
{
    int workinghrs, rate=200,netPay;
    hourlyEmployees()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = get.nextInt();
    }
    void calculatepay()
    {
        if (workinghrs <= 40){
        	netPay = (workinghrs*rate*25)/100;
        }
        else{
        	netPay = ((workinghrs*rate*25)+5)/100;
        }
    }
 
    void display()
    {
        System.out.println("======"+"\n"+"Hourly Employee Details"+"\n"+"===="+"\n");
        super.display();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: $"+rate);
    }
}
