import java.util.Scanner;
public class series_9
{
    //prog to print 2+5+17+26.......n
    Scanner sc=new Scanner(System.in);
    int n;
    double ans;
    void input()
    {
        System.out.println("Enter the number till where you have to print");
        n=sc.nextInt();
    }
    void calculation()
    {
        ans=0;
        for(int i=1;i<=n;i++)
        {
         ans=Math.pow(i,2);
         ans=ans+1;
         ans=ans+ans;
        }
        
    }
    void sop()
    {
        System.out.println("The ans = "+ ans);
    }
    public static void main()
    {
        series_9 obj=new series_9();
        obj.input();
        obj.calculation();
        obj.sop();
    }
        
    }
