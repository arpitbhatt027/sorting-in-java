package bubble_sort;

public class BubbleSortDescendingOrder {

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 4, 6, 5, 8, 9, 7};

        System.out.println("Before Sorting");
        printArray(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("After Sorting");
        printArray(numbers);

    }
}
