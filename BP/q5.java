import java.util.Scanner;
public class q5
{
  Scanner sc=new Scanner(System.in);
  String choice;
  int n;
  int i;
  int a;
  String ans;
  String answer;
  void declare() 
    {
  
   i=1;
   a=1;
   ans="";
   answer="";
      
   }
  void  calculation_print()
  {
   while(true)
   {  System.out.println("Enter the no. of time loop should go and wheter if you want to input Inverted triangle(Inverted) or Triangle.If you want to discontinue enter 0 and then enter n");
       n=sc.nextInt();
       choice=sc.next();
      switch(choice)
   {
      case "Triangle":
       for(i=1;i<=n;i++)
          {
               ans += a++;
             System.out.println(ans);
            }
      break;
      case "Inverted":
      for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-(i-1);j++)
            {
                System.out.print("5");
            }
            System.out.println();
        }
       break;
       default:
       return;
     }
    }
    }
  public static void main()
  {
    q5 obj=new q5();
    obj. declare();
    obj. calculation_print();
  }
}