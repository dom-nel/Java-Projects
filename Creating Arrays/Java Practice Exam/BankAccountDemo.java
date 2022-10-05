import java.util.ArrayList;

public class BankAccountDemo
{
    public static void main(String[] args) {
        //Declaring variables
        ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
        double bankAccount = 0;
        
        bankAccountList.add(new BankAccount(bankAccount));
        bankAccountList.add(new BankAccount(9.9));
        bankAccountList.add(new BankAccount(1.1));
        bankAccountList.add(new BankAccount(7));
        
        for(int index = 0; index< bankAccountList.size(); index++)
        System.out.print(bankAccountList.get(2).getBankAccount() + "\n");
        
   }
}