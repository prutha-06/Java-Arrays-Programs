//25]find all combinations of four elements of a given array whose sum is equal to a given value.
package com.kn.ArrayPrograms;

public class CombinationsOfNumsSumEqualsWithGivenNumber25 {

	public static void main(String[] args) {
		int nums[] = {10, 20, 30, 40, 1, 2};
      int n = nums.length;
      
      // Define the target sum value.
      int s = 53;
      System.out.println("Given value: " + s);
      System.out.print("Combination of four elements:");

      // Fix the first element.
      for (int i = 0; i < n - 3; i++) 
      {
          // Fix the second element.
          for (int j = i + 1; j < n - 2; j++) 
          {
              // Fix the third element.
              for (int k = j + 1; k < n - 1; k++) 
              {
                  // Find the fourth element.
                  for (int l = k + 1; l < n; l++) 
                  {
                      // Check if the sum of these four elements matches the target value.
                      if (nums[i] + nums[j] + nums[k] + nums[l] == s) 
                          System.out.print("\n" + nums[i] + " " + nums[j] + " " + nums[k] + " " + nums[l]);
                  }
              }
          }
      }
	}

}
