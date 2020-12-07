import java.util.Scanner;
public class ascending_order
{
  char ch[];
  Scanner sc=new Scanner(System.in);
  int n;
  void m()
  {
      System.out.println("How many alphabets you want ");
      n=sc.nextInt();
       System.out.println("Enter "+n+" alphabets");
       ch=new char[n];
      for(int i=0;i<n;i++)//input
      {
          ch[i]=sc.next().charAt(0);
      }
      for (int i=0;i<n;i++ ) //to convert char to int
      {
          int a=ch[i];
       }
      char temp;
       for(int i=0;i<n-1;i++) 
       {                                           
           for (int j=0;j<n-1;j++)
           {
               if (ch[j]>ch[j+1]) 
               {
                   temp=ch[j];
                   ch[j]=ch[j+1];
                   ch[j+1]=temp;
                }
           }
       }
       System.out.println("Sorted array-");
       for(int i=0;i<n;i++)
       {
         System.out.println(ch[i]+"");   
       }
  }
  public static void main()
  {
      ascending_order obj=new ascending_order();
      obj.m();
   }
}
