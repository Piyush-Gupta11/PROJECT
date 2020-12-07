import java.util.Scanner;
public class series_8
{      
    Scanner sc=new Scanner(System.in);
    double ans;
    int fact;
    int n; 
    void input()
     {
       System.out.println("Enter the number");
       n=sc.nextInt();
       fact=1;
       ans=1;
     }
    void mainpart()
       { 
       for(int i=1;i<=n;i++)
       {
         fact=fact*i;
        }    
      }
      public static void main()
      {
          series_8 obj=new series_8();
          obj.input();
          obj.mainpart();
        }
    }
