import java.util.Scanner;
public class add
{
   Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    int[] n = new int[q];
   int add;
   int x=n.length;
   void loop()
   {
       System.out.println("The "+x+" numbers are:-");
       for(int i=0;i<x;i++) //i is lesss than 15 as index number would become 16 if we write <= 15
       {
           n[i]=sc.nextInt();  // will take input fem user as it is in for loop it will continue to take element again and again
           
       }
   }
   void loop2()
   {
       for(int i=0;i<x;i++)
       {
           add+=n[i];
           
        }
        System.out.println(add);
    }
   public static void main()
   {
       add obj=new add();
       obj.loop();
       obj.loop2();
    }
}
