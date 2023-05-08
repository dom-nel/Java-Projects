import java.util.*;

public class DemoNelthrope
{
    public static void main(String[] args)
   {
      
      int monthsActive, channelSelection;
      String name, channels, billId;
      char keepGoing;
      double totalBillAmount = 0;
      ArrayList<Bill> billList = new ArrayList<Bill>();
      
      Scanner keyboard = new Scanner(System.in);
      
      
      

      do
      {
         //gathers the users first and last name
         System.out.print("Enter the customers name (first and last): ");
         name = keyboard.nextLine();
         
         //Gathers input for the channels package
         System.out.print("    1. Basic Channels Package" +
                          "\n    2. Sports Channels Package" +
                          "\n    3. Movie Channels Package" +
                          "\n    4. Ultra Package (includes Basic, Sports, and Movies)" );
         System.out.print("\nSelect a subscription from the menu above: ");
         channelSelection = keyboard.nextInt();
      
         while(channelSelection != 1 && channelSelection != 2 && channelSelection != 3 && channelSelection != 4) //validate the input
         {
            //Gathers input for the channels package
            System.out.print("1. Basic Channels Package");
            System.out.print("2. Sports Channels Package");
            System.out.print("3. Movie Channels Package");
             System.out.print("4. Ultra Package (includes Basic, Sports, and Movies)" );
            System.out.print("Select a subscription from the menu above: ");
            channelSelection = keyboard.nextInt();
         }
         
         //Gathers input for the length of time active
         System.out.print("Enter the length of time (in months) that account has been active: ");
         monthsActive = keyboard.nextInt();
         
         while(monthsActive < 0)//validate the input
         {
             System.out.print("Enter the length of time (in months) that account has been active: ");
             monthsActive = keyboard.nextInt();

         }
         
         //clear buffer
         keyboard.nextLine();
         
         
         //Gathers input for the  Bill ID
         System.out.print("Enter an ID for the bill: ");
         billId = keyboard.nextLine();
         
         //assign channels based on menu selection above
         if(channelSelection == 1)
            channels = "Basic Channels Package";
         else if(channelSelection == 2)
            channels = "Sports Channels Package";
         else if(channelSelection == 3)
            channels = "Movie Channels Package";
         else
         channels = "Ultra Package (includes Basic, Sports, and Movies)";
         
         
         Account account = new Account(name, channels, monthsActive);//instantiate Account object
         Bill bill = new Bill(billId, account);//instantiate Bill object
         totalBillAmount += bill.calcBillAmount();//add to our running total of Bill amount
         billList.add(bill);//add Bill object to ArrayList

         
         

       //Ask the user if the user would like to enter another bill
       System.out.print("\nDo you want to enter information for another bill (Y/N)?");
       keepGoing = keyboard.nextLine().toUpperCase().charAt(0);
       System.out.println();

      }
      while(keepGoing == 'Y');
      
      System.out.println("Subscription Bill Report\n");
      
        //iterate over the ArrayList and print out information about each Bill
      for(int i = 0; i <billList.size(); i++)
      {
         System.out.println(billList.get(i));//implicitly calling to Bills's toString()
         System.out.println();
      }
      
      //print out the average bill
      System.out.printf("The average cost of a bill is: $%,.2f",totalBillAmount/billList.size());

      
   }//main method end

}