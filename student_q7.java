public class student_q7
{
     String name;
     int roll;
     int maths;
     int science;
     int english;
     int hindi;
     int computer;
     int history;
     int geography;
     int total;
     double percent;
     
     void declare()
     { 
         name="Piyush";
         roll=29;
         maths=89;
         science=90;      
         english=98;
         hindi=94; 
         computer=97;
         history=94;
         geography=87;                 
         
        }
     void percent_calculation()
        {
            total=maths+science+english+hindi+computer+history+geography;
            percent=(total*100)/700;
        }
     void condition_check_and_print()
     {
        if(percent>=90)
        {
            System.out.println("The stream assinged is Science with Computers");
        }
        else if(80<=percent && percent>=89)
        {
            System.out.print("The stream assinged is Science without Computers");
        }
        else if (70<=percent && percent>=79)
        {
            System.out.println("The stream asinged to you is Commerce with maths");
        }
       else if(60<=percent && percent>=69)
       {
           System.out.println("The stream assinged to you is Commerce without maths");
        }
    }
   public static void main()
   {
       student_q7 obj=new student_q7();
       obj. declare();
       obj. percent_calculation();
       obj. condition_check_and_print();
    }
     }

