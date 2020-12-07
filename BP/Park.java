import java.util.Scanner;
public class Park
{
    Scanner sc=new Scanner(System.in);
    double EntryFee,Discount,Amount;
    int Age;
    Park()
    {
        EntryFee=0;
        Discount=0;
        Amount=0;
        Age=0;
    }
    void Input()
    {
       System.out.println("Enter the Entry Fees,Age");
       EntryFee=sc.nextDouble();
       Age=sc.nextInt();
    }
    void Calculate()
    {
        if(Age<=12)
        {
            System.out.println("The discount is 45%");
            Amount=EntryFee-((45*EntryFee)/100);
        }
        else if(Age>=50)
        {
            System.out.println("The discount is 50%");
            Amount=EntryFee-((50*EntryFee)/100);
        }
        else 
        {
            System.out.println("The discount is 10%");
            Amount=EntryFee-((10*EntryFee)/100);
        }
    }
    void Display()
    {
        System.out.println("The Entry fee is "+EntryFee);
        System.out.println("Age is "+Age);
        System.out.println("The amount is "+Amount);
    }
    public static void main()
    {
        Park bw=new Park();
        bw.Input();
        bw.Calculate();
        bw.Display();
    }
}
