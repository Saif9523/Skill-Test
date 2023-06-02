import java.util.ArrayList;

public class Solution {

	 static void generate(int m, char[] ch, int n,ArrayList<String> arrayList) {

        if (n == m) {

            // Printing the Generated String**
            // Return to the previous case*
            arrayList.add(new String(ch));
            return;

        }

        // If the first Character is
        //Zero then adding**
        if (ch[n - 1] == '0') {
            ch[n] = '0';
            generate(m, ch, n + 1,arrayList);
            ch[n] = '1';
            generate(m, ch, n + 1,arrayList);
        }

        // If the Character is One
        // then add Zero to next**
        if (ch[n - 1] == '1') {

            ch[n] = '0';

            // Calling Recursively for the
            // next value of Array
            generate(m, ch, n + 1,arrayList);

        }
    }
	public static ArrayList<String> generateString(int k) {
		// Write your code here.
		ArrayList<String> arrayList = new ArrayList<>();
        if (k==0) return arrayList;
        char[] ch = new char[k];

        // Initializing first character to Zero
        ch[0] = '0';

        // Generating Strings starting with Zero--
        generate(k, ch, 1,arrayList);

        // Initialized first Character to one--
        ch[0] = '1';
        generate(k, ch, 1,arrayList);
        return arrayList;
	}
}

