//This is a simple program to find a factorial of the number
//A factorial number is product of all positive integer less thhan or equal to the number given
import java.util.Scanner;
class factorial
{
    int n,fact;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number ");
        n=sc.nextInt();
    }
    void init()
    {
        fact=1;
    }
    void calc()//main method to calculate the factorial of a number
    {
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
    }
    void print()
    {
        System.out.println("The factorial of the number is "+fact);
    }
    public static void main()
    {
        factorial obj=new factorial();
        obj.input();
        obj.init();
        obj.calc();
        obj.print();
    }
}
