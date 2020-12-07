class infinite_loop
{
    int k;
    void input()
    {
        k=100;
    }
    void loop()
    {
        while(k<=101)
        {
            System.out.println(k);
            k--;
        }
    }
    public static void main()
    {
        infinite_loop obj=new infinite_loop();
        obj. input();
        obj. loop();
    }
}

