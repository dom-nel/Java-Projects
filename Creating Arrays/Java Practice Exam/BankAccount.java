public class BankAccount
{
   private double bankAccount;
   
   /**
      No-Arg Constructor
   */
    public BankAccount() {
        bankAccount = 0.0;
    }
    
    /**
      Arg Constructor
      @param ba bankAccount
   */
    public BankAccount(double ba) {
        bankAccount = ba;
    }

    
    /**
      The setBankAccount() method sets the name of the assembly line
      @param ba Bank Account.
   */
    public void setBankAccount(double ba){
        bankAccount = ba;
    }    
    
    /**
      The getBankAccount() method sets the name of the assembly line
      @param ba Bank Account.
   */
    public double getBankAccount(){
        return bankAccount;
    }    


}//public class BankAccount end