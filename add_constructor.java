public class add_constructor
{
    int a;
    int b;
    int c;
    add_constructor(int ab,int cb,int bp)
    {
       a=ab;
        b=bp;
       c=cb;
    }
    void calc()
    {
        c=a+b;
    }
    void sop()
    {
        System.out.print(c);
    }
    public static void main()
    {
        add_constructor DD  =new add_constructor(1,2,3);
        DD. calc();
        DD. sop();
    }
}


