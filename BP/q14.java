import java.util.Scanner;
public class q14
{
    Scanner sc=new Scanner(System.in);
    double ar[]=new double[10];
    int x=ar.length;
    double sum,avg1;
    void input()
    {
        System.out.println("Enter "+x+" numbers");
        for(int i=0;i<x;i++)
        {
            ar[i]=sc.nextDouble();
        }
    }
    void averagecompare()
    {
      for(int i=0;i<x;i++)
        {
            sum+=ar[i];
        }
        avg1=sum/x;
        System.out.println("The average of the above numbers is "+avg1);
        System.out.println(" ");
        System.out.println("Numbers greater than the average are- ");
       if(ar[0]>avg1)
       {
           System.out.println(ar[0]);
       }
       if(ar[1]>avg1)
       {
            System.out.println(ar[1]);
       }
        if(ar[2]>avg1)
       {
            System.out.println(ar[2]);
       }
        if(ar[3]>avg1)
       {
            System.out.println(ar[3]);
       }
        if(ar[4]>avg1)
       {
            System.out.println(ar[4]);
       }
        if(ar[5]>avg1)
       {
            System.out.println(ar[5]);
       }
        if(ar[6]>avg1)
       {
            System.out.println(ar[6]);
       }
        if(ar[7]>avg1)
       {
            System.out.println(ar[7]);
       }
        if(ar[8]>avg1)
       {
            System.out.println(ar[8]);
       }
        if(ar[9]>avg1)
       {
            System.out.println(ar[9]);
       }
    }
    public static void main()
    {
        q14 obj=new q14();
        obj.input();
        obj.averagecompare();
    }
}
