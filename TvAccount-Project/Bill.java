

public class Bill 
{
    private String billId;
    private double billAmount;
    private Account account;

    /**
      no arg constructor
    */
    public Bill()
    {
      billId = "YU543";
      billAmount = 79.99;
     
    }
    
    /**
      constructor that accepts arguments
      @param billId The Bill Id
      @param Account accepts an account object
    */ 
    public Bill(String billId, Account account)
    {
      this.billId = billId;
      this.billAmount = billAmount;
      this.account = new Account(account);
    }
    
    /**
      @return billId returns the bill Id
    */
    public String getBillId() {
        return billId;
    }

    /**
      @param billId Sets the bill Id
    */
    public void setBillId(String billId) {
        this.billId = billId;
    }

    /**
      @return billAmount returns the bill amount
    */
    public double getBillAmount() {
        return billAmount;
    }

    /**
      @param billAmount sets the bill amount
    */
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    /**
      @return Account Return a deep copy of an Account object
    */
    public Account getAccount() {
        return new Account(account);
    }

    /**
      @param Account sets an Account object\
    */
    public void setAccount(Account account) {
        this.account = new Account(account);
    }
    
    
    
    /**
      to string method
    */
    public String toString() {
        return 
                "Bill ID: " + billId + 
                "\nAccount: \n" +
                "       Customer Name: " + account.getName() +
                "\n       Subscription Type: " + account.getChannels() + 
                "\n       Length of time Active: " + account.getMonthsActive() + " months" + 
                "\nBill Cost: " + "$" + billAmount;



                
    }
    
    /**
      Calculates the bill amount
      @return billAmount
    */
    public double calcBillAmount()
    {
      if(account.getChannels().equalsIgnoreCase("Basic Channels Package"))
      {
         if(account.getMonthsActive() >= 12)
            {
               billAmount = 35.99;
            }
         else
            {
               billAmount = 39.99;
            }
          
         }
      else if(account.getChannels().equalsIgnoreCase("Sports Channels Package"))
         {
             if(account.getMonthsActive() >= 12)
            {
               billAmount = 26.99;
            }
         else
            {
               billAmount = 29.99;
            }
         }
     else if(account.getChannels().equalsIgnoreCase("Movie Channels Package"))
         {
             if(account.getMonthsActive() >= 12)
            {
               billAmount = 17.99;
            }
         else
            {
               billAmount = 19.99;
            }
         }
    else if(account.getChannels().equalsIgnoreCase("Ultra Package (includes Basic, Sports, and Movies)"))
         {
             if(account.getMonthsActive() >= 12)
            {
               billAmount = 71.54;
            }
         else
            {
               billAmount = 79.49;
            }
         }


         return billAmount;
   }

}