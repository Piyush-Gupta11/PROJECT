import java.util.Scanner;
public class uppercase
{ 
    //prog to convert lowercase to uppercase
    String a,b;
    Scanner sc= new Scanner(System.in);
    void xyz()
    {
        System.out.println("Enter the word in lowercase");
     a= sc.next();
       }
    void str()
    {
        
        String s1=new String(a);
       b=s1.toUpperCase();
       System.out.println(b);
    }
    public static void main()
    {
        uppercase obj=new uppercase();
        obj. xyz();
        obj. str();
        }
}