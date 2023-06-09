import java.util.*;
public class Solution {

    public  static boolean isSubsetSum(int set[],
                               int n, int sum)
    {
        // Base Cases
        if (sum == 0)
            return true;
        if (n == 0)
            return false;
  
        // If last element is greater than
        // sum, then ignore it
        if (set[n - 1] > sum)
            return isSubsetSum(set, n - 1, sum);
  
        /* else, check if sum can be obtained 
        by any of the following
            (a) including the last element
            (b) excluding the last element */
        return isSubsetSum(set, n - 1, sum)
            || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }


	public static boolean subsetSumToKIdentical(int input[], int n,int k){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
	 	 * Taking input and printing output is handled automatically.
		 */
        ArrayList<Integer> arr = new ArrayList<>() ; 
        
        for(int i= 1 ; i < n ; i++){
            int sum = input[i] ; 
            while(arr.size() != 0 && input[i] == arr.get(arr.size()-1)){
                sum+= input[i] ;  
                i++ ; 
            }
            
            arr.add(sum) ; 
            sum = 0 ; 
        }
        
        int[] newArr = new int[arr.size()] ; 
        
        for(int i= 0 ; i < arr.size() ; i++){
            newArr[i] = arr.get(i) ; 
        }
        
        return isSubsetSum(newArr , newArr.length, k) ; 
	}
}


