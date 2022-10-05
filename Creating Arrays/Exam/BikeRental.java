public class BikeRental
{
   //Declaring Fields
    private String bikeID;
    private String fullName;
    private int personAge;
    private double numOfMiles;
    
    
    
   /**
      No-Arg Constructor
   */
    public BikeRental() {
        bikeID = "";
        fullName = "";
        personAge = 0;
        numOfMiles = 0;
    }
    
     /**
      Constructor that accepts argument for each field
      @param id Parameter for the bike id field
      @param name Parameter for the full name field
      @param age Parameter for the persons age 
      @param miles Parameter for the number of miles
   */
    public BikeRental(String id, String name, int age, double miles) {
        bikeID = id;
        fullName = name;
        personAge = age;
        numOfMiles = miles;
    }

   //Setters
    
    /**
      The setBikeID method sets the Bike Id
      @param id Bike Id.
   */
    public void setBikeID(String id){
        bikeID = id;
    }
        
   /**
      The setFullName method sets the The full name of the person that rented the bike
      @param name Full name.
   */
    public void setFullName(String name){
        fullName = name;
    }

   /**
         The setPersonAge method sets the persons age
         @param age Person Age.
      */
       public void setPersonAge(int age){
           personAge = age;
       }

   /**
         The setBikeID method sets the Bike Id
         @param id Bike Id.
      */
       public void setNumOfMiles(double miles){
           numOfMiles = miles;
       }
       
       
        //Getters
    
    /**
      The getBikeID method gets the Bike Id
      @return bikeId.
   */
    public String getBikeID(){
        return bikeID;
    }
        
   /**
      The getFullName method gets the The full name of the person that rented the bike
      @return fullName.
   */
    public String getFullName(){
        return fullName;
    }

   /**
         The getPersonAge method gets the persons age
         @return personAge.
      */
       public int getPersonAge(){
           return personAge;
       }

   /**
         The getNumOfMiles method gets the users number of miles
         @return numOfMiles.
      */
       public double getNumOfMiles(){
           return numOfMiles;
       }
       
  /**
         The getRentalPrice returns the price of the bike rental based on the miles ridden and riders age and cost per mile
         @return getRentalPrice.
      */
       public double getRentalPrice(){
           final double BASE_PAY = 2.50;
           double milesRidden;
           double costPerMiles;
           
           if (personAge < 18 && numOfMiles <= 10)
           {
            costPerMiles = 0.25;
           }
           else if (personAge < 18 && numOfMiles > 10)
           {
            costPerMiles = 0.20;
           }
           
           else if (personAge >= 18 && numOfMiles <= 10)
           {
            costPerMiles = 0.40;
           }
           else
           {
            costPerMiles = 0.35;
           }

           
           return BASE_PAY + costPerMiles * numOfMiles ;
       }
       

       
    


    


}//public class BikeRental end