public class ExceptionHandling2
{
    public static void main(String[] args)
    {
        int balance = 5000;            //Initializing the balance
 
        Scanner sc = new Scanner(System.in);     //Scanner variable to take input from user
 
        System.out.println("Enter Withdrawl Money");
 
        int withdrawlMoney = sc.nextInt();      //taking input from the user
 
        try
        {
            //checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
 
            if(withdrawlMoney > balance)
            {
                throw new InvalidWithdrawlMoneyException();
            }
            else
            {
                System.out.println("Transaction Successful");
            }
        }
        catch(InvalidWithdrawlMoneyException ex)
        {
            //InvalidWithdrawlMoneyException will be caught here
 
            System.out.println(ex);
        }
    }
}
