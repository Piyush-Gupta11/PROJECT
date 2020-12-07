public class q_9a
{
    int sum;
    int n;
    int i;
    void input()
    {
        sum=0;
        n=20;
    }
    void calculation()
    {
        for(i=0;i<=n;i+=2)
        {
            if(i%4==0)
            {
                sum-=i;
            }
            else
            {
                sum+=i;
            }
            }
            System.out.println(sum);
    }
    public static void maim()
    {
          q_9a obj =new q_9a();
         obj. input();
          obj.calculation();
    }
}