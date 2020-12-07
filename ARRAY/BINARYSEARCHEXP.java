import java.util.Scanner;
public class BINARYSEARCHEXP
{
    void search()
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched");
        n=sc.nextInt();
        int A[]={5,10,15,20,25,30,35,40,45,50};
        int pos=0,Low=0,Up=9,Mid=0;
        while(Low<=Up)
        {
            Mid=(Low+Up)/2;
            if(n>A[Mid])
            {
                Low=Mid+1;
            }
            else if(n<A[Mid])
            {
                Up=Mid-1;
            }
            else
            {
                pos=1;
                break;
            }
        }
        if(pos==1)
        {
            System.out.println("THE ELEMNT IS PRESENT AT "+(Mid+1)+" position");
            }
            else
            {
                System.out.println("ELEMENT IS NOT PRESENT");
            }
    }
}
