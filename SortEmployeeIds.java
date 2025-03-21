import java.util.Scanner;

public class SortEmployeeIds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input for the number of employees
        System.out.println("Enter the number of employees:");
        int n=sc.nextInt();

        //taking input for the employee ids
        int[] arr=new int[n];
        System.out.println("Enter the employee ids:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Employee ids before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling the insertion sort algorithm
        insertionSort(arr,n);

        //printing the sorted employee ids
        System.out.println("\nSorted employee ids:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void insertionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int key=arr[i+1];
            int j=i;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
