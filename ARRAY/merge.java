import java.util.Scanner;
public class merge
{
    int A[];
    int B[];
    int C[];
    void input()
    {
        A=new int[5];
        B=new int[5];
        C=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 nos for 1st array- ");
        for(int i=0;i<5;i++)
        {
            A[i]=sc.nextInt();
         }
         System.out.println("Enter 5 nos for 2nd array- ");
            for(int i=0;i<5;i++)
        {
            B[i]=sc.nextInt();
         }
        }
    void merging()
    {
        int i=0,add=0;
        for(;i<5;i++)
        {
            C[add++]=A[i];
        }
        for(i=0;i<5;i++)
        {
            C[add++]=B[i];
        }
    }
    public void print()
    {
        System.out.println("MERGED ARRAY");
        for(int i=0;i<10;i++)
        {
            
            System.out.println(""+C[i]);
        }
    }
    public static void main()
    {
      merge obj=new merge();
      obj.input();
      obj.merging();
      obj.print();
   
                   }
                }
