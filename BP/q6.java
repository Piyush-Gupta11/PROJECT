import java.util.Scanner;
public class q6
{
     Scanner sc=new Scanner(System.in);
    int n,temp,sum,digit,x;
    void input()
    {
        System.out.print("Enter the 10 digit number: ");
        n=sc.nextInt();
        temp=n;
    }
    void check()
    {
        for(int i=n;i>0;i/=10)
        {
            digit+=1;
        }
        if(digit!=10)
        {
            System.out.println("Not a ten digit number\nTry again");
            return;
        }
    }
    void calc()
    {
        for(int i=1;i<= 10;i++)
        {
            x=temp%10;
            sum+=x*i;
            temp/=10;
        }
        if(sum%11==0)
        {
            System.out.println("The number is an ISBN number");
        }
        else
        {
            System.out.println("The number is not an ISBN number");
        }
        
    }
    public static void main()
    {
        q6 obj=new q6();
        obj.input();
        obj.check();
        obj.calc();
    }

}
