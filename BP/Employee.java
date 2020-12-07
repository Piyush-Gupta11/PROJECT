import java.util.Scanner;
public class Employee
{
    String name ; float basesalary; 
   void init()
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the name of employee: ");
      name=sc.next();
      System.out.print("Enter the salary of the employee: ");
      basesalary=sc.nextFloat();
   }
    void calc() 
   {
      basesalary = basesalary + (50*basesalary)/100;
   }
   void print()
   {
      System.out.print(name);
      System.out.println("  salary(including HRA) is "+basesalary);
   }
   public static void main()
   {
      Employee obj= new Employee(); 
      obj. init();
      obj. calc();
      obj. print();
   }
}
