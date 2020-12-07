public class to_string
{    
    String i;
    String str;
    void init()
    {
        i="BYe";
        str=new String(i);
    }
    void sop()
    {
        System.out.print(str .toString());
    }
    public static void main()
    {
        to_string obj= new to_string();
             obj. init();
             obj. sop();
    }
}
