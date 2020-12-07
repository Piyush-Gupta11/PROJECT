import java.util.Scanner;
public class marks
{
    Scanner sc=new Scanner(System.in);
    int n;
    int roll[]=new int[n];

    int marks[]=new int[n];
    int marks1[]=new int[n];
    int marks2[]=new int[n];
     int total;
     double avg;
    void printd()
    {
        System.out.println("Enter number of students:-");
         n=sc.nextInt();
        System.out.println("Enter details:-");
        for(int i=0;i<n;i++)
        {
           
            
            System.out.println("The marks in Subject 1-");
            marks[i]=sc.nextInt();
            System.out.println("The marks in Subject 2-");
            marks1[i]=sc.nextInt();
            System.out.println("The marks in Subject 3-");
            marks2[i]=sc.nextInt();
            int total=marks[i]+marks1[i]+marks2[i];
            double avg=total/3;
            
        }
        
    }
    void printcalcs()
    {
        System.out.println("Total is- "+total);
        System.out.println("Average is- "+avg);
        
    }
    public static void main()
    {
        marks obj=new marks();
        obj. printd();
        obj.printcalcs();
    }
}
