import java.util.Scanner;
public class q_9b
{
   Scanner sc=new Scanner(System.in);
   double x;
   double add=0;
   void input()
     {
       System.out.println("Enter the numerator (x/2 + x/5 + x/8 + x/11 +.....+ x/20)");
       x=sc.nextDouble();
      }
   void looping()
   {
         for(int i=2;i<=20;i+=3)
         {
             add+=x/i;
         }
         System.out.println("The sum is :- "+add);
   }
   public static void main()
   {
      q_9b obj=new q_9b();
      obj.input();
      obj.looping();
   }
 }
