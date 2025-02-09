import java.util.*;

public class Array {

    // to find number in array list
    public static void findArray(int size, boolean isInArray){
        Scanner sc = new Scanner(System.in);
        int find;
        int[] marks = new int[size];
        // take input from user
        for(int i =0;i<size;i++){
            marks[i]= sc.nextInt();
        }
        System.out.println("Enter a find number: ");
        find = sc.nextInt();
        // output
        for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
            if(find == marks[i]){
                isInArray = true;
                break;
            } 
        }
        if (isInArray) {
            System.out.println("Number is present at index: "+marks.length);
        }
        else{
            System.out.println("Number is not presnet at any index!");
        }
    }

    // take array of name from user and print them on screen 
    public static void printName(String[] name, int size){
        Scanner sc = new Scanner(System.in);
        // input
        for(int i=0;i<size;i++){
            name[i]= sc.next();
        }
        // output
        for(int i = 0;i<name.length;i++){
            System.out.print(name[i]+" ");
        }
    }

    // find maximum and minimum number in array list
    public static void findMinMax(int size, int num[]){
        Scanner sc =new Scanner(System.in);
        // input 
        for(int i =0;i<size;i++){
            num[i]= sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;

        // output and find value 
        for(int i =0;i<num.length;i++){
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max= num[i];
            }

        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
    }

    // check asscending list in array list
    public static void checkAssending(int size, int num[]){
        Scanner sc = new Scanner(System.in);
        // input
        System.out.println("enter array value");
        for(int i =0;i<size;i++){
            num[i]= sc.nextInt();
        }

        boolean isAssending = true;
        // check array value one by one 
        for(int i=0;i<num.length-1;i++){
            if(num[i] > num[i+1]){
                isAssending=false;
            }
        }
        if(isAssending){
            System.out.println("The array list in a asscending order");
        } else{
            System.out.println("The array list is not in a asscending order");
        }
    }
    public static void main(String[] args) {
        // create a array list and find the integer where present or not
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        boolean isInArray= false;
        // findArray(size, isInArray); 
        String name[]= new String[size]; 
        // printName(name, size); 
        int num[]= new int[size];
        // findMinMax(size, num);     
        checkAssending(size, num);

    }
}
