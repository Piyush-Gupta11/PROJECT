public class q_10_char
{
   String a;
   
   int c;
   
   char e;
   char f;
   void declare()
   {
       a="";
       
       e='#';
       f='*';
    }
   void looping()
    {
       for(c=1;c<=5;c++)
       {
          if(c%2==0)
        {
            a+=e;
        }
        else
        {
            a+=f;
        }
        System.out.println(a);
       }
   }
   
   public static void main()
   {
       q_10_char obj=new q_10_char();
       obj. declare();
       obj. looping();
       
    }
}






















