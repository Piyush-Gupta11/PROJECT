import java.util.Scanner;
public class descending_order
{
  char ch[];
  
  Scanner sc=new Scanner(System.in);
  void q()
  {
      System.out.println("Enter 20 alphabets");
      
       ch=new char[20];
      for(int i=0;i<20;i++)
      {
          ch[i]=sc.next().charAt(0);
      }
     
      for (int i=0;i<20;i++ )
      {
          int a=ch[i];
          
      }
      char temp;
       for(int i=0;i<20-1;i++) 
       {                                           
           for (int j=0;j<20-1;j++)
           {
               if (ch[j]<ch[j+1]) 
               {
                   temp=ch[j];
                   ch[j]=ch[j+1];
                   ch[j+1]=temp;
                }
           }
       }
       System.out.println("Sorted array-");
       for(int i=0;i<20;i++)
       {
         System.out.println(ch[i]+"");   
       }
  }
  
  public static void main()
  {
      descending_order obj=new descending_order();
      obj.q();
  }
}

