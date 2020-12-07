import java.util.Scanner;
class q15
{
    Scanner sc=new Scanner(System.in);
    int AW[]=new int[8],tempo;
    void input()
    {
       System.out.println("Enter the 8 numbers :-");
       for(int i=0;i<8;i++) 
       {
           AW[i]=sc.nextInt();
       }
    }
    void calculation()
    {
       System.out.println("The elements that have 3 as their last digit are:- ");
       for(int i=0;i<8;i++) 
       {
           tempo=AW[i];
           for(int k=1;k<=1;k++)
           {
               int x=tempo%10;
               if(x==3)
               {
                   System.out.println(AW[i]);
               }
           }
       }
    }
    public static void main()
    {
        q15 obj=new q15();
        obj.input();
        obj.calculation();
    }
}  
