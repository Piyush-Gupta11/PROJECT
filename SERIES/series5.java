import java.util.Scanner;
public class series5
{
   // program to make 1/a^2+1/a^3.............1/a^n   
   Scanner sc=new Scanner(System.in);
   int a;
   int b;
   double ans;
   void input()
   {
       System.out.println("Please enter the denominator and the power of denominator:");
       a=sc.nextInt();
       b=sc.nextInt();
       ans=0;
    }
    void looping()
    {
        for(int i=1;i<=b;i++)
        {
            ans=ans+(1/Math.pow(a,i));
        }
        System.out.println("The sum of the series is:"+ans);
    }
    public static void main()
    {
        series5 obj=new series5();
        obj.input();
        obj.looping();
    }
    }

       
