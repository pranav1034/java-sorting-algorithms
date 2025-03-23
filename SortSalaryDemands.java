import java.util.Scanner;

public class SortSalaryDemands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of job applications
        System.out.println("Enter the number of job applications:");
        int n = sc.nextInt();

        // Taking input for the salary demands
        int[] salaries = new int[n];
        System.out.println("Enter the salary demands:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        System.out.println("Salary demands before sorting:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        // Calling the heap sort algorithm
        heapSort(salaries);

        // Printing the sorted salary demands
        System.out.println("\nSorted salary demands:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        sc.close();
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Swap root with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
