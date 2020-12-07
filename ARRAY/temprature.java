import java.util.Scanner;
public class temprature
{
    Scanner sc=new Scanner(System.in);
    int temp[]=new int[5];
    
    int len=temp.length;
    int tempo;
    void input()
    {
         System.out.println("Enter temp in °C  -");
        for(int i=0;i<len;i++)
        {
            
            temp[i]=sc.nextInt();
           
        }
    }
    void mainpart()
    {
        for(int i=0;i<len-1;i++) 
       {                                           
           
           for (int j=0;j<len-1;j++)
           {
               if (temp[j]>temp[j+1]) //swapping of elements is done here 
               {
                   tempo=temp[j];
                   temp[j]=temp[j+1];
                   temp[j+1]=tempo;
                }
           }
       }
       System.out.println("Sorted array-");
       for(int i=0;i<len;i++)
       {
         System.out.println(temp[i]+"");   
       }
    }
    public static void main()
    {
        temprature obj=new temprature();
        obj.input();
        obj.mainpart();
    }
}
