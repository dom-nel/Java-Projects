import java.util.ArrayList;
import java.util.Scanner;
public class BikeRentalDemo
{
    public static void main(String[] args) {
        ArrayList<BikeRental> bikeRentalList = new ArrayList<BikeRental>();
        Scanner keyboard = new Scanner(System.in);

        //Declaring Fields
        String bikeID = "";
        String fullName = "";
        int personAge = 0;
        double numOfMiles = 0.0;
        String repeat = "";
        int totalNumberOfBikes = 37; 
      
        //Asking the user for input until it asks to stop
        do{
            //Getting user input
            System.out.print("Enter bike's ID: ");
            bikeID = keyboard.nextLine();
            
            System.out.print("Enter the name of the person renting the bike: ");
            fullName = keyboard.nextLine();
            
            System.out.print("Enter the age of the person renting the bike: ");
            personAge = keyboard.nextInt();
            
            
            //Input validation, persons age made can't be less than 0
            while (personAge < 0){
                System.out.print("\nIncorrect number, please enter a number greater than or equal to 0:");
                personAge = keyboard.nextInt();
                }

            
            System.out.print("Enter the number of miles that the bike was ridden: ");
            numOfMiles = keyboard.nextDouble();
            
            
            //Input validation, number of miles made can't be less than 0
            while (numOfMiles < 0){
                System.out.print("\nIncorrect number, please enter a number greater than or equal to 0:");
                numOfMiles = keyboard.nextDouble();
                }

            //Adding a new abike rental list object to a list
            bikeRentalList.add(new BikeRental(bikeID, fullName, personAge,numOfMiles ));
            
            //scanner reset
            keyboard.nextLine();
            
            //Asking the user if it wants to continue 
            System.out.print("\nDo you wish to enter information for another bike rental ( (Y/N)? ");
            repeat = keyboard.nextLine();
            
            
            //Input validation, the answer can't be anything else but y or n
            while (!repeat.equalsIgnoreCase("y") && !repeat.equalsIgnoreCase("n")){
                System.out.print("\nIncorrect answer, please try again! \nDo you wish to enter information for another bike rental (Y/N)? ");
                repeat = keyboard.nextLine();
            }//End while 2
            
            //new line
            System.out.println();
         
        //end of main do loop 
        }while(repeat.equalsIgnoreCase("y"));
        
        //Printing the Reciept
        System.out.println("Bike Rental Tracking Service");
        
        for (int index = 0; index < bikeRentalList.size(); index++){
            System.out.printf("\nBike ID: %s \nRenter Name: %s  \nRenter Age: %d  \nMiles Ridden: %.2f \nCost of Rental: %.2f", bikeRentalList.get(index).getBikeID(), bikeRentalList.get(index).getFullName(),bikeRentalList.get(index).getPersonAge(),bikeRentalList.get(index).getNumOfMiles(), bikeRentalList.get(index).getRentalPrice());
            
            
            System.out.println();
            

        }
        //print the total number of bikes to this point
        totalNumberOfBikes += bikeRentalList.size() ;
        System.out.println();
        System.out.println("Total number of bike rentals processed to this point: " + totalNumberOfBikes);
    }
    
  

}//public class BikeRentalDemo