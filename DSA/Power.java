import java.util.*;
public class Solution {


	public static void main(String[] args) {
		/* Your class should be named Solution.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int result = calculatePower(a, b);
        System.out.println(result);
    }
    
    public static int calculatePower(int a, int[] b) {
        int result = 1;
        int base = a % 1337;
        for (int i = b.length - 1; i >= 0; i--) {
            int digit = b[i];
            for (int j = 0; j < digit; j++) {
                result = (result * base) % 1337;
            }
            int factor = 1;
            for (int j = 0; j < 10; j++) {
                factor = (factor * base) % 1337;
            }
            base = factor;
        }
        return result;


	}

}

