import java.util.Scanner; 

/**
   This program works with an array of three
   BankAccount objects
*/

public class ObjectArray
{
   public static void main(String[] args)
   {
      final int NUM_ACCOUNTS = 3; //Number of accounts
      
      //Create an array that can reference 
      //Bank account objects
      BankAccount[] accounts = new BankAccount[NUM_ACCOUNTS];
      
      //create objects for the array
      createAccounts(accounts);
      
      //Display the balances of each account
      System.out.println("Here are the balances" +
                        "for each account:");
                        
      for(int index = 0; index < accounts.length; index++)
      {
         System.out.println("Account" + (index + 1) + 
                           ":" + accounts[index].getBalance());
      }
   }//public static void main(String[] args) end
   
   /**
      The createAccounts method creates a BankAccount
      object for each element of an array. The user
      is asked for each accounts balance.
      @param array the array to reference the accounts
   */
   private static void createAccounts(BankAccount[] array)
   {
      double balance; //To hold an account balance
      
      //create a Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Create the accounts
      for (int index = 0; index < array.length; index++)
      {
         //get the accounts balance
         System.out.print("Enter the balance for" +
                         "account" + (index + 1) + ":");
         balance = keyboard.nextDouble();
         
         //Create the account
         array[index] = new BankAccount(balance);
      }
   }
}//public class ObjectArray end