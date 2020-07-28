public class q4
{
double principal;
double ratepercent;
double time;
double Amount;
String opt;
void declare(int p,int r,int n,String options)
{
    principal=p;
    ratepercent=r;
    time=n;
    opt=options;
}
   void print()
   {
       switch(opt)
       {
       case "Term Deposit":
       Amount=principal*(Math.pow((1+ratepercent/100),time));
       System.out.println("The amount is : " + Amount);
       break;
       
       case "Recurring Deposit":
       time=time/12; //because it is in month
       Amount=principal*time+(principal*(time*(time+1))*ratepercent*1)/(2*12*100);
       System.out.println("The amount is : " + Amount);
       break;
       
       default:
       System.out.println("Error");
       break;
    }
}
    public static void main()
    {
        q4 obj=new q4();
        obj. declare(1000,10,5,"Term Deposit");
        obj. print();
}
}
