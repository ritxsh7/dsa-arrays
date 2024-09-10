package easy;

class Solution {
    public int print2largest(int[] arr) {

        // Code Here
        int firstLargest = -1;
        int secondLargest = -1;

        for (int i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else {
                if (i > secondLargest && i != firstLargest) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }
}