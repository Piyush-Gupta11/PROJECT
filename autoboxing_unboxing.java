public class autoboxing_unboxing
{
   Integer a= new Integer(6590);
   Integer b= new Integer(1);
   Character c= new Character('a');
   void calculation()
   {
       System.out.println(a*b*c);
    }
   Character d= 'a';
   Character bc=new Character(d);
   void sop()
   {
       System.out.println(bc);
    }
    public static void main()
    {
        autoboxing_unboxing obj= new autoboxing_unboxing();
             obj. calculation();
             obj. sop();
    }
}
