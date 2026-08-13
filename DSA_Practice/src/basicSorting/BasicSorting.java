package basicSorting;

public class BasicSorting {

    public static void bubbleShort(int arr[]){
        for (int i=0; i<arr.length-1;i++){
            for (int j=0; j<arr.length-1-i; j++ ){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionShort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int minPos = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i<arr.length; i++){
            int curr = i;
            int prv = curr-1;
            while (prv >=0 && arr[prv] > arr[curr]){
                arr[prv+1] = arr[prv];
                prv--;
            }
            arr[prv-1] = arr[curr];
        }
    }

    public static void printArr(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 3, 2};
//        bubbleShort(arr);
        selectionShort(arr);
        printArr(arr);

    }
}
