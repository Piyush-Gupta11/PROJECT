
import java.util.Scanner;
public class series1
{   
    //prog to print value of x^0+x^1+x^2.............x^n
    Scanner sc=new Scanner(System.in);
     double x;
     double power;
    void sop()
    { 
    System.out.println("enter the number and the power");
    x=sc.nextDouble();
    power=sc.nextDouble();
    }
    double f;
    
    void looping()
    {
        for(int i=0;i<=power;i++)
        {
             f+=Math.pow(x,i);
            }
            System.out.println("The ans of the series is:" +f);
        }
      public static void main()
      {
          series1 obj=new series1();
          obj. sop();
          obj. looping();
          
    }
}