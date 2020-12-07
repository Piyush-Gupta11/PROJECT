import java.util.Scanner; 
public class series_4
{
   //prog to print sum of x^1+x^2+x^3+............x^n
    Scanner sc=new Scanner(System.in);
   int x;
   int power;
   double ans;
   void input()
   {
       System.out.println("Enter the number and the power: ");
       x=sc.nextInt();
       power=sc.nextInt();
       ans=0;
    }
    void looping()
    {
        for(int i=1;i<=power;i++)
        {
             ans=ans+Math.pow(x,i);
         }
         System.out.print(ans);
        
    }
    public static void main()
    {
        series_4 obj=new series_4();
        obj.input();
        obj.looping();
        
    }
            
}
