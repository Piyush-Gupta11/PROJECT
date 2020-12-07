public class q1
{
    int count;
    void counting()
    {
        count=0;
    }
    void mainpart()
    {
      for(int i=1;i<=4;i++)
      {
          for(int j=1;j<=i;j++)
          {
              count=count+1;
              System.out.print(count);
        }
        System.out.println();
    }
    }
    public static void main(String args[])
      {
             q1 obj= new q1();
             obj. counting();
             obj. mainpart();
      }
}