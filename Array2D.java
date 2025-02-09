import java.util.Scanner;

public class Array2D {

    public static void print2dArray(int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[row][col];

        // input
        // rows
        System.out.println("Enter array value:");
        for(int i =0;i<row;i++){
            // col
            for(int j=0;j<col;j++){
                marks[i][j] = sc.nextInt();
            }
        }

        // print the 2d array
        System.out.println("2d Array");
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the search element in array list");
        int x= sc.nextInt();
        boolean isInArray=false;
        // search the element in array list
        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(marks[i][j] == x){
                    isInArray = true;
                    break;
                }
            }
        }
        if (isInArray) {
            System.out.println("Yes value is present at index: "+marks.length);
        } else{
            System.out.println("value is not present in array list! ");
        }
    }

    // 
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        print2dArray(row, col);
        
    }
}
