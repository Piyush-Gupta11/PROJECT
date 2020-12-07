//1
//23
//345
//4567
//891011.....n
import java.util.Scanner;
public class pat
{
    int n;
    Scanner sc=new Scanner(System.in);
    int count;
    void input()
    {
        System.out.println("Enter the no of row");
        n=sc.nextInt();
        count=0;
    }
    void loop()
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++,i++)
            {
                count=count+1;
                System.out.println(i);
            }
        System.out.println("");
    }
    }
    public static void main()
    {
        pat obj=new pat();
        obj.input();
        obj.loop();
    }
}
