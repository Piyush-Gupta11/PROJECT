import java.util.Scanner;
public class q11
{
  void mainpart()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of students- ");
      int n=sc.nextInt();
      String name[]=new String [n];
      int rno[]=new int[n];
      int marks1[]=new int[n];
      int marks2[]=new int[n];
      int marks3[]=new int[n];
      System.out.println("ENTER DETAILS OF THE STUDENT-");
      for(int i=0;i<n;i++)
      {
       System.out.println("NAME");
       name[i]=sc.next();
       System.out.println("ROLL NO");
       rno[i]=sc.nextInt();       
       System.out.println("MARKS1");
       marks1[i]=sc.nextInt();
       System.out.println("MARKS2");
       marks2[i]=sc.nextInt();
       System.out.println("MARKS3");
       marks3[i]=sc.nextInt();
       int total=marks1[i]+marks2[i]+marks3[i];
       double avg=total/3.0;
       if (avg>=85 && avg<=100)
       {
           System.out.println("EXCELLENT");
      }
      else if (avg>=75 )
       {
           System.out.println("DISTINCTION");
      }
      else if (avg>=60 )
       {
           System.out.println("FIRST CLASS");
      }
      else if (avg>=40 )
       {
           System.out.println("PASS");
      }
      else if (avg<40 )
       {
           System.out.println("POOR");
      }
    }
  }
  public static void main()
  {
      q11 obj=new q11();
      obj.mainpart();
  }
}
