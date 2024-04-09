package DAY20;
//c++ solution
public class FamilyStructure {
    public static boolean rec(long n, long k) {
        if (n == 1 || k == 1) { // Base case for first generation
            return false; // Assume 0 for male and 1 for female
        }

        if (k % 2 == 0) { // If kth child is even, i.e., child gender is opposite to parent
            return !rec(n - 1, k / 2); // Recursively compute the gender for the previous generation
        } else { // If kth child is odd
            return rec(n - 1, (k + 1) / 2); // Recursively compute the gender for the previous generation
        }
    }

    public static String kthChildNthGeneration(int n, long k) {
        // 0 -> Male, 1 -> Female
        if (rec(n, k)) {
            return "Female";
        } else {
            return "Male";
        }
    }

    public static void main(String[] args) {
        int n = 3;
        long k = 5;
        String result = kthChildNthGeneration(n, k);
        System.out.println("Gender of kth child in nth generation: " + result);
    }
}
