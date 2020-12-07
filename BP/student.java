import java.util.Scanner;
public class student 
{
    String name;
    int rollno;
    int sub1;
    int sub2;
    int sub3;
    int sub4;
    int sub5;
    double avg;
     student()
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter your name");
      name=scan.nextLine();
      System.out.println("enter your Roll No.");
      rollno=scan.nextInt();
      System.out.println("enter your marks in the following subjects out of hundred");
      System.out.println("enter marks in Subject1");
      sub1=scan.nextInt();
      System.out.println("enter marks in Subject2");
      sub2=scan.nextInt();
      System.out.println("enter marks in Subject3");
      sub3=scan.nextInt();
      System.out.println("enter marks in Subject4");
      sub4=scan.nextInt();
      System.out.println("enter marks in Subject5");
      sub5=scan.nextInt();
      
    }
    void calc()
    {
      avg=( sub1+sub2+sub3+sub4+sub5)/5;
    }
    void ifelse()
    {
     if(avg>=90)
     {
System.out.println("Stream assinged is Science with computers");
}
else if((avg>=80)&&(avg<=89))
{
   System.out.println("Stream assinged is Science without computers");
}
else if((avg>=60)&&(avg<=69)) 
{
    System.out.println("Stream assinged is Commerce without maths");
}
else
{ 
  System.out.println("Stream assinged is Arts");
}
}
public static void main ()
{
   student obj=new student();
   obj.calc();
   obj.ifelse();
}
}