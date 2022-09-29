/**
   This program demonstrates how a reference to an 
   array can be returned from a method
*/

public class ReturnArray
{
   public static void main(String[] args)
   {
      double[] values;
      
      values = getArray();
      for(int num = 0; num < values.length; num++)
      {
         System.out.print(values[num] + " ");
      }//for loop end
   }//public static void main(String[] args) end
   
   /**
      getArray method
      @return A reference to an array of doubles
   */
   
   public static double[] getArray()
   {
      double[] array = {400.1, 1.2, 1.3, 1.4, 1.5};
      return array;
   }
}