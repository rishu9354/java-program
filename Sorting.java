public class Sorting {
    // print the sort array list
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    // bubble sort function
    public static void bubbleSort(int arr[]){
        System.out.println("Buuble Sorting");
        for(int i =0; i<arr.length - 1; i++){
            for(int j =0;j<arr.length - i-1;j++){
                if (arr[j] > arr[j+1]) {
                    // true->swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        // print function call
        printArray(arr);
    }

    // selection sort

    public static void selectionSort(int arr[]){
        System.out.println("Selection Sort");
        for(int i=0; i<arr.length -1; i++ ){
            int smallest =i;
            for(int j=i+1; j<arr.length;j++){
                // agar arr[smallest] greter than hai arr[j]se
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
        printArray(arr);
    }

    // insertion sort
    public static void insertionSort(int arr[]){
        System.out.println("Insertion Sort");
        for(int i =1; i<arr.length;i++){
            int j =i-1;
            int current = arr[i];
            while (j >=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
    }
}
