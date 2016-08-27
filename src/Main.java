public class Main {

    /*Function func will return 1 if there are two integers within array: S that equals the number we want.
    * If our array is already sorted, we can say it will take linear time. If the array is already sorted, a better
     * technique would be to use a binary sort: a theta(nLogn) algorithm. This is more or less the worst case when
     * our array is NOT sorted.*/
    static int func(int S[], int start, int end, int x) {
        //base case
        if (start > end) {
            return 0;
        }
        //parameter hold the value in the index we currently care about. The index increases from 0 to the last digit in
        // our array.
        int valueToCompare = S[start];
        for (int i = start; i <= end; i++) {
            if ((valueToCompare + S[i]) == x) {
                int foundValue = valueToCompare + S[i];
                System.out.println("Found it: " + foundValue);
                return 1;
            }
        }
        func(S, start + 1, end, x);
        return 0;
    }

    public static void main(String[] args) {
        // x = 11
        int array[] = {3, 8, 5, 2, 9, 6};
        int start = 0;
        int end = array.length - 1;
        func(array, start, end, 15);
    }
}

