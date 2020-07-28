public class q5
{
  String choice;
  int n;
  int i;
  int a;
  String ans;
  String answer;
  void declare(int no, String c) 
  {
    n=no;
    choice=c;
    i=1;
    a=1;
    ans="";
    answer="";
      
    }
  void  calculation_print()
  {
     
    switch(choice)
  {
      case "number":
       for(i=1;i<n;i++)
          {
               ans += a++;
             System.out.println(ans);
            }
      break;
      case "alphabet":
       for(i=1;i<=n;i++)
         {
         for(a=1;a<=n-i+1;a++)
         {
             System.out.print((char)(a+96));
         } 
         System.out.println("");
        }
       break;
       default:
       System.out.println("ERROR");
       break;
    }
  }
  public static void main()
  {
    q5 obj=new q5();
    obj. declare(12,"number");
    obj. calculation_print();
  }
}