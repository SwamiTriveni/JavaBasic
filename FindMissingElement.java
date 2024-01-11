package ExPractice;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 3, 7, 8}; // Example array with one missing element
        int n = array.length + 1; // Size of the array (including the missing element)

        int missingElement = findMissingElement(array, n);
        System.out.println("The missing element is: " + missingElement);
    }

    static int findMissingElement(int[] arr, int size) {
        int expectedSum = (size * (size + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}