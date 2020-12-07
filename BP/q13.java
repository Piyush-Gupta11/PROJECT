import java.util.Scanner;
public class q13
{
    Scanner sc=new Scanner(System.in);
    int temp[]=new int[5];
    String name[]=new String[5];
    int len=temp.length;
    int tempo;
    void input()
    {
         for(int i=0;i<len;i++)
        {
           System.out.println("Enter temprature-");
           temp[i]=sc.nextInt();
           System.out.println("Name of the city- ");
           name[i]=sc.next();
        }
    }
    void mainpart()
    {
        for(int i=0;i<len-1;i++) //i is lesss than x(array lenght) as array lenht is 1 time greater  than  the index number(which the program considers)
       {                      //to find the smallest number                         
           
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
       System.out.println("Temprature from Coldest to Hottest-");
       for(int i=0;i<len;i++)
       {
         System.out.println(temp[i]+"°C  ");   
       }
    }
    public static void main()
    {
        q13 obj=new q13();
        obj.input();
        obj.mainpart();
    }
}
