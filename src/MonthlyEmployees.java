

class MonthlyEmployees extends Employee
{
    float salary,netPay;
    int des;
   void MonthlyEmployees()
    {
        System.out.println("Enter charges:");
        des = get.nextInt();
        System.out.println("Enter Salary:");
        salary = get.nextFloat();
        netPay = (salary*25)/100;
    }
    void display()
    {
        System.out.println("======"+"\n"+"Full Time Employee Details"+"\n"+"======"+"\n");
        super.display();
        System.out.println("Salary: "+salary);
        System.out.println("Designation: "+des);
    }
}
