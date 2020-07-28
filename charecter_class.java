public class charecter_class
{
    int i;
    void init()
    {
        i=100;
    }
    void wraping()
     {
        Integer abc = i;
        System.out.println(abc);
     }
     public static void main()
     {
         charecter_class obj= new charecter_class();
             obj. init();
             obj. wraping();
        }
        
}