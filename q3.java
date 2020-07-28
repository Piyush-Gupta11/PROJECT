public class q3
{
int i;double s;

void calc()
{ 
    for(i=1;i<=20;i++)
    {
       s=Math.random()*100;
       System.out.println(s);
    }
}
public static void main()
{
    q3 obj=new q3();
    obj. calc();
}
}
