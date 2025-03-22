import java.util.Scanner;

public class SortExamScores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //taking input for the number of students
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();

        //taking input for the scores of the students
        int[] arr=new int[n];
        System.out.println("Enter the scores of the students:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Scores of the students before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling the selection sort algorithm
        selectionSort(arr,n);

        //printing the sorted scores
        System.out.println("\nSorted scores of Students:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    public static void selectionSort(int[] arr,int n){
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
