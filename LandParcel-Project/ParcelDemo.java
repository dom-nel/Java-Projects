 import java.util.Scanner; 
import java.io.*;
import java.util.ArrayList;

public class ParcelDemo
{
   public static void main(String[] args) throws IOException
   {
      double additional_Cost_per_Square_Foot;
      String buildingAddress;
      double buildingSize;
      String parcelID;
      double parcelSize;
      String zonalType;
      
      
      
      
      //Creates a Scanner class for user input
      Scanner keyboard = new Scanner(System.in);
     
      //Gathers user input
      System.out.println("Please enter the parcel ID");
      parcelID = keyboard.nextLine();
      
      System.out.println("Please enter the size of the parcel (in acres)");
      parcelSize = keyboard.nextDouble();
      keyboard.nextLine();
      
      System.out.println("Please type rather the parcel of land is Commercial or Residential");
      zonalType = keyboard.nextLine();
      
      System.out.println("Please enter the building address");
      buildingAddress = keyboard.nextLine();
      
      System.out.println("Please enter the building size");
      buildingSize = keyboard.nextDouble();
     
      
      
      //Creates a building object to add to the Parcel object
      Building pBuilding = new Building(buildingAddress, buildingSize);
      Building ppBuilding = new Building("20209 Hawthorne", 1750);
      //Creates a Parcel object and references a building object
      Parcel parcel = new Parcel(parcelID, parcelSize, zonalType, pBuilding);
      System.out.println(parcel);
      
      parcel.setBuilding(ppBuilding);
      System.out.println(parcel.getBuilding());
 
      }
      
           
    }

      
             

