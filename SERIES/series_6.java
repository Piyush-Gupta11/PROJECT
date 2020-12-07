import java.util.Scanner;
public class series_6
{
    // 1/1+1/2+1/n
   Scanner sc=new Scanner(System.in);
   double n;
   double ans;
   void input()
   {
       System.out.println("Enter the number");
       n=sc.nextDouble();
       ans=0;
    }
    void looping()
    {
        for(double i=1;i<=n;i++)
        {
            ans=ans+(1/i);
        }
    }
    void sop()
    {
        System.out.println("The ans is="+ans);
    }
    public static void main()
    {
        series_6 obj=new series_6();
        obj.input();
        obj.looping();
        obj.sop();
    }
}
