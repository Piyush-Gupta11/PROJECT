public class q_10_number
{    void looping()
       {
        for(int i =1; i <= 5; i++)
        {
           for(int j = 5; j >= i; j--)
            {
                System.out.print(j);
            }
           System.out.println();
        }
    }
    public static void main()
    {
        q_10_number obj=new q_10_number();
        obj. looping();
    }
}
    