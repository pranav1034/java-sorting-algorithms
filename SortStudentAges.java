import java.util.Scanner;

public class SortStudentAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of students
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        // Taking input for the ages of the students
        int[] ages = new int[n];
        System.out.println("Enter the ages of the students:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.println("Ages of the students before sorting:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        // Calling the counting sort algorithm
        countingSort(ages, 10, 18);

        // Printing the sorted ages
        System.out.println("\nSorted ages of students:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        sc.close();
    }

    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count occurrences of each age
        for (int age : arr) {
            count[age - min]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in correct positions in the output array
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
