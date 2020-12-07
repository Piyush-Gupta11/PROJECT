import java.util.Scanner;
public class q4
{
   Scanner sc=new Scanner(System.in);
    double principal;
   double ratepercent;
   double time;
   double Amount;
    int choice;
   
   void mainpart()
   {
       while(true)
       {
       System.out.println("FOR TERM DEPOSIT, Enter 1");
	System.out.println("FOR RECURRING DESPOSIT, Enter 2");
	System.out.println("To exit enter 3");
	System.out.println("Enter your choice::");
	choice = sc.nextInt();
        
           switch(choice)
       {
       case 1:System.out.println("Option enterd by you is for calculating TERM DEPOSIT");
       term();
       break;
       case 2:System.out.println("Option enterd by you is for calculating RECURRING DESPOSIT");
       recurring();
       break;
       case 3: return;
       default:
       System.out.println("Error");
       break;
        }
      }
    }
    void term()
    {
       System.out.println("Please enter Principal;Rate of Percent;Time");
    principal=sc.nextDouble();
    ratepercent=sc.nextDouble();
    time=sc.nextDouble();
    
        Amount=principal*(Math.pow((1+ratepercent/100),time));
       System.out.println("The amount is : " + Amount);
    }
    void recurring()
    {
       System.out.println("Please enter Principal(per month);Rate of Percent;Time(in months)");
    principal=sc.nextDouble();
    ratepercent=sc.nextDouble();
    time=sc.nextDouble();
    
        time=time/12; 
       Amount=principal*time+(principal*(time*(time+1))*ratepercent*1)/(2*12*100);
       System.out.println("The amount is : " + Amount);
    }
    public static void main()
    {
        q4 obj=new q4();
        obj.mainpart();
      }
}
