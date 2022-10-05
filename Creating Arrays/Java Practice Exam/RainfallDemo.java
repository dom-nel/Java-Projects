import java.util.ArrayList;
import java.util.Scanner;

public class RainfallDemo {
    public static void main(String[] args) 
    {
      ArrayList<String> displayMonths = new ArrayList<String>();
      ArrayList<Rainfall> Months = new ArrayList<Rainfall>();
      Scanner keyboard = new Scanner(System.in);
      
      double january;
      double febuary;
      double march;
      double april;
      double may;
      double june;
      double july;
      double august;
      double september;
      double october;
      double november;
      double december;
      String repeat = "";
      
      //Create month objects to display months
      displayMonths.add("January");
      displayMonths.add("Febuary");
      displayMonths.add("March");
      displayMonths.add("April");
      displayMonths.add("May");
      displayMonths.add("June");
      displayMonths.add("July");
      displayMonths.add("August");
      displayMonths.add("September");
      displayMonths.add("October");
      displayMonths.add("November");
      displayMonths.add("December");
      
      
      
      
      //Asking the user for input until it asks to stop
      do{
         //Getting user input
         System.out.print("How much did it rain in the month of January?: ");
         january = keyboard.nextDouble();
        
         
         //Input validation, day rained can't be less than 1
          while (january < 1)
          {
          System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
          january = keyboard.nextDouble();
          }
         
         System.out.print("How much did it rain in the month of Febuary?: ");
         febuary = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (febuary < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         febuary = keyboard.nextDouble();
         }

         
         System.out.print("How much did it rain in the month of March?: ");
         march = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (march < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         march = keyboard.nextDouble();
         }

         
         System.out.print("How much did it rain in the month of April?: ");
         april = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (april < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         april = keyboard.nextDouble();
         }
         
         System.out.print("How much did it rain in the month of May?: ");
         may = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (may < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         may = keyboard.nextDouble();
         }
         
         System.out.print("How much did it rain in the month of June?: ");
         june = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (june < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         june = keyboard.nextDouble();
         }

         
         System.out.print("How much did it rain in the month of July?: ");
         july = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (july < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         july = keyboard.nextDouble();
         }

         
         System.out.print("How much did it rain in the month of August?: ");
         august = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (august < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         august = keyboard.nextDouble();
         }
         
         System.out.print("How much did it rain in the month of September?: ");
         september = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (september < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         september = keyboard.nextDouble();
         }
         
         System.out.print("How much did it rain in the month of October?: ");
         october = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (october < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         october = keyboard.nextDouble();
         }
         
         System.out.print("How much did it rain in the month of Novemeber?: ");
         november = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (november < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         november = keyboard.nextDouble();
         }
         
         System.out.print("How much did it rain in the month of December?: ");
         december = keyboard.nextDouble();
         
         //Input validation, day rained can't be less than 1
         while (december < 1)
         {
         System.out.print("\nIncorrect number, please try again! \n Enter the total number of days rained:");
         december = keyboard.nextDouble();
         }
         
         

         //scanner reset
         keyboard.nextLine();
         
         //Asking the user if it wants to continue 
         System.out.print("\nDo you wish to enter information for another assembly line (Y/N)? ");
         repeat = keyboard.nextLine();

         //Input validation, the answer can't be anything else but y or n
         while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")){
         System.out.print("\nIncorrect answer, please try again! \nDo you wish to enter information for another assembly line (Y/N)? ");
         repeat = keyboard.nextLine();
         }//End while 2

         //new line
         System.out.println();



        }while(repeat.equalsIgnoreCase("y"));
        
            
        //Printing the report for each assembly line and summing assembly line qualities
        for (int index = 0; index < Months.size(); index++){
          System.out.println("The number of days it rained in " + displayMonths.get(index) + Months.get(index));
          
        }

    
    }//public static void main(String[] args) end
}//public class RainfallDemo end