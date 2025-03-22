import java.util.Scanner;

public class SortBooksPrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //input for the number of books
        System.out.println("Enter the number of books:");
        int n=sc.nextInt();

        //taking input for the prices of the books
        int[] arr=new int[n];
        System.out.println("Enter the prices of the books:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Prices of the books before sorting:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //calling the merge sort algorithm
        int left=0;
        int right=arr.length-1;
        mergeSort(arr,left,right);

        //printing the sorted prices of the books
        System.out.println("\nSorted prices of the books:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid = left + (right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] leftArray=new int[n1];
        int[] rightArray=new int[n2];

        //copying elements from 2 sorted halves into 2 arrays
        for(int i=0;i<n1;i++){
            leftArray[i]=arr[left+i];
        }

        for(int i=0;i<n2;i++){
            rightArray[i]=arr[mid+1+i];
        }

        //merge the 2 arrays
        int i=0;
        int j=0;
        int k=left;

        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }
            else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        //copy the remaining elements of leftArray
        while(i<n1){
            arr[k++]=leftArray[i++];
        }

        //copy the remaining elements of rightArray
        while(j<n2){
            arr[k++]=rightArray[j++];
        }
    }
}
