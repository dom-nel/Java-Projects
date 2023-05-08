public class Building 
{
     private String buildingAddress;
     private double buildingSize;
     
     
   /**
      No arg Constructor that accepts arguments
   */
   
   public Building()
   {
      super();
      buildingAddress = "Hawthorne";
      buildingSize = 4000;
   }
   
   /**
      @param buildingAdress The buildings address
      @param buildingSize The buildings size
   */
   
   public Building(String buildingAddress, double buildingSize)
   {
      this.buildingAddress = buildingAddress;
      this.buildingSize = buildingSize;
   }
   
   /**
      Copy Constructor that accepts building as an argument
   */
   
   public Building(Building obj)
   {
      this.buildingAddress = obj.buildingAddress;
      this.buildingSize = obj.buildingSize;
   }

   //setters
   
   /**
      @param buildingAddress Sets the building address
   */
   public void setBuildingAddress(String buildingAddress)
   {
      this.buildingAddress = buildingAddress;
   }
   
   /**
      @param buildingSize Sets the building size
   */
   public void setBuildingSize(double buildingSize)
   {
      this.buildingSize = buildingSize;
   }
   

   //getters
   
   /**
      @return The Building address
   */
   public String getBuildingAddress()
   {
      return buildingAddress;
   }
   
   /**
      @return The Building Size
   */
   public double getBuildingSize()
   {
      return buildingSize;
   }

   
   public String toString()
   {
      
      //Creates a string representing the object
      String str = "The building address: " + buildingAddress +
                   "\nThe building size: " + buildingSize;
       
      return str;
   }
  
     
}