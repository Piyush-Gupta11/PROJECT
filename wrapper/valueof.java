public class valueof
{
   String s;
   int a;
    void declare()
    {
       s="100";
      }
   void print()
     {
    int a=Integer.valueOf(s);
       System.out.print(a);
        }
        public static void main()
        {
            valueof obj= new valueof();
             obj. declare();
             obj. print();
        }
}