public class asq1
{
    
    asq1()
    {
        int [] field = {2,20,3,13,15,3,9,10,1,5,8};
        int count=0;
        for(int i=0;i<=10;i++)
        {
           if(field[i]%2!=0) 
           {
               count=count+1;
            }
        }
        System.out.println("The odd numbers are:- "+count);
    }
}
