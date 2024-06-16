package bubble_sort;

public class BubbleSort1 {

    public static void printSortedArray(int[] sortedNumbers) {
        System.out.println("After sorting");
        for (int i = 0; i < sortedNumbers.length - 1; i++) {
            System.out.print(" " + sortedNumbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 4, 6, 3, 5, 6};
        System.out.println("Before Sorting");

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        printSortedArray(numbers);
    }
}
