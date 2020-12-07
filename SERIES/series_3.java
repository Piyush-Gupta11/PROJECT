import java.util.Scanner;
public class series_3
{
    // prog  to compute sum of the power raised to the number entered
  Scanner sc=new Scanner(System.in);
  int power;
  int n;
  int sum=0;
  void input()
  {
      System.out.println("enter power and number ");
      power=sc.nextInt();
      n=sc.nextInt();
    }
    void loop()
    {
        for(int i=1;i<=power;i++)
        {
            sum=sum+i;
            
        }
        double ans=Math.pow(n,sum);
        System.out.println(ans);
    }
    public static void main()
    {
        series_3 obj=new series_3();
        obj. input();
        obj.loop();
    }
}
