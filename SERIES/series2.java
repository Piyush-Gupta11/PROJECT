import java.util.Scanner;
public class series2
{
    //prog to print sum of sq of number till n(1^2+2^2+3^2+4^2................n^2) 
    Scanner sc=new Scanner(System.in);
    int n;
    double ans;
   
    void input_sop()
    {
        System.out.println("Please enter the number till which number you have to print the sum of squares:");
        n=sc.nextInt();
        ans=0;
    }
    void looping()
    {
        for(int i=1;i<=n;i++)
        {
            ans=ans+Math.pow(i,2);
          
        }
        System.out.println("The sum of sq="+ans);
            
    }
    public static void main()
    {
        series2 obj=new series2();
        obj. input_sop();
        obj. looping();
    }
}

