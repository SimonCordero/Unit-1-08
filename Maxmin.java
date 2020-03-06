import java.util.Arrays;
import java.util.Random;

/**
* Author: Simon Cordero.
* Last Updated: 2020/03/02
*/

public class Maxmin {
  
  /**
  * Array set up.
  */
  
  public static void main(String[] arg) { 
    Random rand = new Random();
    int[] intArray;
    int maxValue;
    int minValue;
    intArray = new int[10];
    
    for (int index = 0; index < intArray.length; index++) {
      
      intArray[index] = rand.nextInt(99) + 1;
      
    }

    System.out.println(Arrays.toString(intArray));
    maxValue = maxValue(intArray);
    minValue = minValue(intArray);
    
    System.out.printf("The maximum value is : %d%n", maxValue);
    System.out.printf("The minimum value is : %d%n", minValue);
    
  }
  
  /**
  * Return max value of array.
  */
  
  public static int maxValue(int[] intArray) {
    int maxValue;
    maxValue = intArray[0];
    
    for (int index = 1; index < intArray.length; index++) {
      
      if (index < intArray.length - 1) {
        if (intArray[index] > maxValue) {
          maxValue = intArray[index];
        }
      }
      
    }
    return maxValue;
  }
  
  /**
  * Return min value of array.
  */
  
  public static int minValue(int[] intArray) {
    
    int minValue;
    minValue = intArray[0];
    
    for (int index = 1; index < intArray.length; index++) {
      
      if (index < intArray.length - 1) {
        
        if (intArray[index] < minValue) {
          
          minValue = intArray[index];
        }
      }
    }
    return minValue;
  }
}