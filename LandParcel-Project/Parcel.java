public class Parcel
{
   private String parcelID;
   private double parcelSize; 
   private String zonalType;
   private Building building;
   
   public Parcel()
   {
      parcelID = "12345";
      parcelSize = 2.4;
      zonalType = "commercial";
      
   }
   
   public Parcel(String parcelID, double parcelSize, String zonalType, Building building)
   {
      this.parcelID = parcelID;
      this.parcelSize = parcelSize;
      this.zonalType = zonalType;
      this.building = new Building(building);
      
   }
   
   //setters
   
    /**
      @param building The Building
   */
   public void setBuilding(Building building)
   {
      this.building = new Building(building);//make a deep copy of the building argument
   }

   
   /**
      @param parcelID Sets the parcelID field
   */
   public void setParcelID(String parcelID)
   {
      this.parcelID = parcelID;
   }
   
   /**
      @param parcelSize Sets the parcelSize field
   */
   public void setParcelSize(double parcelSize)
   {
      this.parcelSize = parcelSize;
   }
   
   /**
      @param zonalType Sets the zonalType field
   */
   public void setZonalType(String zonalType)
   {
      this.zonalType = zonalType;
   }

   //getters
   
   /**
      @return parcelID return the parcelID
   */
   public String getParcelID()
   {
      return parcelID;
   }
   
   
   /**
      @return parcelSize return the parcelSize
   */
   public double getParcelSize()
   {
      return parcelSize;
   }
   
    /**
      @return zonalType return the zonalType
   */
   public String getZonalType()
   {
      return zonalType;
   }
   
    /**
      @ return the building address in memory
   */
   public Building getBuilding()
   {
      return new Building(building);//return a copy of my object
   }



   public String toString()
   {
      
      //Creates a string representing the object
      String str = "The parcel ID: " + parcelID +
                   "\nThe Parcel Size: " + parcelSize +
                   "\nThe Zonal Type: " + zonalType +
                   "\nThe building address: " + building.getBuildingAddress() +
                   "\nThe building size: " + building.getBuildingSize() + 
                   "\nThe building Property Tax: " + getTaxValue();
       
      return str;
   }
   
   
   public double getTaxValue()
   {
      double additionalCostPerSquareFeet = 0;
      double basePropertyTax = 0;
   
      if (zonalType.equalsIgnoreCase("commercial"))
      {
         basePropertyTax = 2000;
         
         if (getBuilding().getBuildingSize() > 4000)
         {
            additionalCostPerSquareFeet = 1.50;
         }
         else 
         {
             additionalCostPerSquareFeet = 1.00;
         }
         
         
      }
      else 
      {
          basePropertyTax = 500;
         
         if (building.getBuildingSize() > 2000)
         {
            additionalCostPerSquareFeet = .75;
         }
         else 
         {
             additionalCostPerSquareFeet = .50;
         }
      }
      return (parcelSize * basePropertyTax) + (getBuilding().getBuildingSize() * additionalCostPerSquareFeet);
   }
}