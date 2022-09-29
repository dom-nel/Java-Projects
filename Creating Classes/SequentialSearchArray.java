/**
   This program sequentially searches an 
   int array for a specified value
*/

public class SequentialSearchArray
{
   public static void main(String[] args)
   {
      int[] test = {87, 75, 98, 100, 82};
      int results; 
      
      //Search the array for the value 100
      results = sequentialSearch(test, 100);
      
      //Determine whether 100 was found and 
      //display an appropiate message
      if (results == -1)
      {
         System.out.println("You did not" + "earn 100 on any test");
      } 
      else
      {
         System.out.println("You earned 100" + "on test" + (results + 1));
      }
   }//public static void main(String[] args) end
   
   /**
      The sequentialSearch method searches an array for a value
      @param array the array to search
      @param value the value to search for
      @return the subscript of the value if found int the array, otherwise -1
   */
   
   public static int sequentialSearch(int[] array, int value)
   {
      int index; //loop control variable
      int element; //Element the value is found at
      boolean found; //Flag indicating search results
      
      //Element 0 is the starting point of the search
      index = 0;
      
      //Store the default values element and found
      element = -1;
      found = false;
      
      //Search the array
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            element = index; 
         }
         index++;
      }
      return element;
   }
}//public class SearchArray end