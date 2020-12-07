  import java.util.Scanner;
public class bubblesort_unguided
{


   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int ele[]=new int[n];
   int temp,x;
   void printelements()
   {
       System.out.println("The "+n+" numbers are:-");
       for(int i=0;i<n;i++) 
       {
           ele[i]=sc.nextInt();  
           
       }
   
   }
   void mainpart()
   {
       x=ele.length; 
       for(int i=0;i<x-1;i++) 
       {                                           
           
           for (int j=0;j<x-1;j++)
           {
               if (ele[j]>ele[j+1]) 
               {
                   temp=ele[j];
                   ele[j]=ele[j+1];
                   ele[j+1]=temp;
                }
           }
       }
       System.out.println("Sorted array-");
       for(int i=0;i<x;i++)
       {
         System.out.println(ele[i]+"");   
       }
     }
     public static void main()
     {
         bubblesort_unguided obj=new bubblesort_unguided();
         obj.printelements();
         obj.mainpart();
     }
    }

