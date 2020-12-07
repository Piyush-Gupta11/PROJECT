import java.util.Scanner;
public class avg
{
 Scanner sc=new Scanner(System.in);
double ar[]=new double[10];
  int x=ar.length;
 double sum,avg1;
    void input()
 {
    System.out.println("Enter "+x+" numbers");
  for(int i=0;i<x;i++)
  {
    ar[i]=sc.nextDouble();
   }
}
 void calculate()
 {
  for(int i=0;i<x;i++)
   {
            sum+=ar[i];
  }
avg1=sum/x;
 System.out.println("The sum of the numbers are "+sum);
 System.out.println("The avrage of the numbers is- "+avg1);
      
    }
public static void main()
  {
    avg obj=new avg();
  obj.input();
    obj.calculate();
    }
}
