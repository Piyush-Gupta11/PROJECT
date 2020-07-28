public class employee_q2
{
   String employeename;
   int ogsalary;
   int totalsalary;
   void name_salary(String name,int ogsal)
   {
       employeename=name;
       ogsalary=ogsal;
    }
    void salary_calculation()
    {
        totalsalary=ogsalary+(50*ogsalary)/100;
    }
    void print()
    {
        System.out.println("The name of employee " + employeename);
        System.out.println("The salary of the employee is " + ogsalary);
        System.out.println("The salary by adding 50% HRA " + totalsalary);
    }
    public static void main()
    {
        employee_q2 obj=new employee_q2();
        obj. name_salary("Riya Gupta",200000);
        obj. salary_calculation();
        obj. print();
    }
}
