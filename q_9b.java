public class q_9b
{
 double sum;
 double number;
 double i;
 double a;
 void declare(double n)
 {
   sum=0;
   number=20;
   a=n;
 }
 void calculation()
 {
     for(i=1;i<=number;i+=3)
     {
         sum += a/i;
     }
 }
 void print()
 {
     System.out.println(sum);
    }
 public static void main()
 {
     q_9b obj=new q_9b();
     obj. declare(25.0);
     obj. calculation();
     obj. print();
 }
}