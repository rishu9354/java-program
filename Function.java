import java.util.Scanner;

public class Function {

    // fuction for sum of two number
    // public static int calcluteSum(int a , int b){
    //     int sum = a + b;
    //     return sum;
    // }

    // function for multipky 
    public static int multiplyNum(int a ,int b){
        return a * b;
    }
    // factorial function
    public static void factorial(int num){
        if(num < 0){
            System.out.println("Invaild Number");
            return;
        }
        // loops
        int fact =1;
        for(int i = num; i>=1;i--){
            fact = fact * i;
        }
        System.out.println("Factorial is : "+fact);
        return;
    }

    // average function
    public static void averageFun(int a, int b, int c){
        int avg = (a +b +c)/3;
        System.out.println("Average is :"+avg );
        return;
    }

    // sum of all odd number from 1 to n
    public static int oddSum(int num){
        int sum =0;
        for(int i =0;i<=num; i++){
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }
        return sum;
    } 

    // return greater number betwwen two number
    public static int greaterNumber(int num1, int num2){
        if (num1 > num2) {
            return num1;
        }
        else{
            return num2;
        }
    }

    // circumfrenece of circle
    public static double circumFernce(double radius){
        return 2 * 3.14 * radius;
    }

    // eligible to vote
    public static void eligibilityTest(int age){
        if (age >= 18) {
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
        
    }

    //  infinte loop
    public static void infinteLoop(){
        int i =1;
        do{
            System.out.println("Infinite Loop function running!");
            i++;
        } while(i>= 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // double radius = sc.nextDouble();
        
        // System.out.println( "Sum of two number: "+calcluteSum(a, b));
        // System.out.println("Product of two number: "+multiplyNum(a, b));
        // factorial(a);
        // averageFun(a, b, c);
        // System.out.println("Sum of all Odd number is: "+ oddSum(a));
        // System.out.println("Greater Number Between of them: "+greaterNumber(a, b));
        // System.out.println("Circumfrence of Circle: "+circumFernce(radius));
        // eligibilityTest(a);
        infinteLoop();
    }    
}
