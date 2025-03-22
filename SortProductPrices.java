import java.util.Scanner;

public class SortProductPrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input for the number of products
        System.out.println("Enter the number of products:");
        int n=sc.nextInt();

        //taking input for the prices of the products
        int[] arr=new int[n];
        System.out.println("Enter the prices of the products:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Prices of the products before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling the quick sort algorithm
        quickSort(arr,0,n-1);

        //printing the sorted prices
        System.out.println("\nSorted prices of Products:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    public static void quickSort(int[] arr,int low,int high){
        if (low < high) {

            // pi is the partition return index of pivot
            int pi = partition(arr, low, high);

            // Recursion calls for smaller elements and greater or equals elements
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        // Choose the pivot
        int pivot = arr[high];

        int i = low - 1;

        // Traverse arr[low..high] and move all smaller elements to the left side.
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot after smaller elements and
        swap(arr, i + 1, high);
        return i + 1;
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
