import java.util.Scanner;
public class SortStudentMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input for students
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();

        //taking input for the scores of the students
        int[] arr=new int[n];
        System.out.println("Enter the marks of the students:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Marks of the students before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling the bubble sort algorithm
        bubbleSort(arr,n);

        //printing the sorted score
        System.out.println("\nSorted score of Students:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    public static void bubbleSort(int[] arr,int n){
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { //swapping elements to set the largest element at its position
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
