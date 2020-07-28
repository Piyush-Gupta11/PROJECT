
public class add
{
    int a;
    int b;
    int c;
    void intro()
    {
        a=1;
        b=2;
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
        add obj=new add();
        obj. intro();
        obj. calc();
        obj. sop();
    }
}
