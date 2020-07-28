public class wages
{
   double  h;
   double r;
   double w;
   void declare(double H,double R)
   {
       h=H;
       r=R;
    }
    void weekly_wage()
    {
        if(h<=35 && h>0)
        {
            w=h*r;
            System.out.println("The weekly wage is= " + w);
        }
        else if(h>35 && h<=60)
        {
            w=h*r-(h-35)*1.5*r;
            System.out.println("The weekly wage is= " + w);
        }
        else if(h>60 && h<=70)
        {
            w=h*r+(h-35)*1.5*r+(h-60)*2*r;
            System.out.println("The weekly wage is= " + w);
        }
        else
        {
            System.out.println("Error");
        }
       
    }
    public static void main()
    {
        wages obj= new wages();
        obj. declare(64.0,1.0);
        obj. weekly_wage();
    }
}
