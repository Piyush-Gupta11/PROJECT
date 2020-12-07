import java.util.Scanner;
public class series_7
{
    Scanner sc=new Scanner(System.in);
    double n;
    double a;
    double deno;
    double ans;
    void input()
    {
        System.out.println("Enter the number and the denominator");
        n=sc.nextInt();
        deno=sc.nextInt();
        ans=0;
        a=2;
        
    }
    void looping()
    {
        for(double i=1;i<=n;i+=3)
        {
                
                ans=ans+(i/Math.pow(deno,i+1));
        }
    }
    void sop()
    {
        System.out.println("The ans:"+ans);
    }
    public static void main()
    {
        series_7 obj=new series_7();
        obj.input();
        obj.looping();
        obj.sop();
    }
}
