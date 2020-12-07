class account
{
    double bal; String depositor; long accNo; String accType;int amt;
    account(String name, long accountNumber, String accountType)
    {
        depositor=name;
        accNo =accountNumber;
        accType =accountType;
        System.out.println("Name of the depositor is "+ depositor);
        System.out.println("Account number is "+ accNo);
        System.out.println("Account type is "+ accType);
    }
    account()
    {
         bal=0;
    }
    void startAccount(double amt)
    {
         bal = amt;
         System.out.println("Account started with ₹ "+ amt);
    }
    void deposit(double amt)
    {
        bal+=amt;
        System.out.println("Deposited money is ₹  "+ amt);
    }
    void withdraw(double amt)
    {
        System.out.println("Money withdrawed is ₹  "+amt);
        if(bal<amt)
         {
           System.out.println("Money withdrawed is more than balance");
        }
        else
        {
            bal-=amt;
            System.out.println("Current balance "+bal);
        }   
    }
    void getBalance()
     {
        if(bal<amt)
        {
            System.out.println("ERROR");
        }
        else 
        {
            System.out.println("Remaining balance "+ bal);
        }
     }
}
  
