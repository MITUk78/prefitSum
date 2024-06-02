import java.util.*;

public class PrefixSum {
    public static void prefixSum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE; // Corrected initialization

        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        // Calculate prefix array
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; // Corrected logic
        }

        // Calculate max sum
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1]; // Corrected condition
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("max sum = " + maxSum);
    }

    public static void main(String args[]) {
        int num[] = {1, -2, 6, -1, 3};
        prefixSum(num);
    }
}



