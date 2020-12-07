import java.util.Scanner;
public class bubblesort
{
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int ele[]=new int[n];
   int temp,x; //temp is a variabel to compare the array with temporary value(current value)
   void printelements()// method to print arrray elements
   {
       System.out.println("The "+n+" numbers are:-");
       for(int i=0;i<n;i++) //i is lesss than 15 as index number would become 16 if we write <= 15
       {
           ele[i]=sc.nextInt();  // will take input fem user as it is in for loop it will continue to take element again and again
           
       }
   
   }
   void mainpart()//in this method bubble sort technique will be performed
   {
       x=ele.length; // this will be used to find the lenght of the array(here specified)
       for(int i=0;i<x-1;i++) //i is lesss than x(array lenght) as array lenht is 1 time greater  than  the index number(which the program considers)
       {                      //to find the smallest number                         
           
           for (int j=0;j<x-1;j++)
           {
               if (ele[j]>ele[j+1]) //swapping of elements is done here 
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
         bubblesort obj=new bubblesort();
         obj.printelements();
         obj.mainpart();
     }
    }