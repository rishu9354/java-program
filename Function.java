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

    // count positive, negative ,zero
    public static void countCheck(String Input){
        int positive =0, negative =0, zero=0;
        int num = Integer.parseInt(Input);
        try {
                if (num > 0) {
            positive++;
        } else if (num < 0) {
            negative++;
        } else{
            zero++;
        }
        } catch (Exception e) {
            System.out.println(e);
        }
    
        System.out.println("Positive number:" +positive);
        System.out.println("Negative Number: "+negative);
        System.out.println("Zero count: "+zero);

    }

    // equation calculator


    // fine greatest common divior of two number
    public static int gcd(int a, int b){
        int result = Math.min(a, b); // find minimum number in a,b
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    // fibonaci series
    public static void fiboSeries(int n,int n1, int n2){
        int i,n3;
        System.out.print(n1+" "+n2);
        for(i=2;i<n;i++){
            n3 = n1 + n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        // System.out.println("Fibonaci series: "+fib[i]);
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int c = 1;
        // double radius = sc.nextDouble();
        // String Input = sc.next();
        // System.out.println( "Sum of two number: "+calcluteSum(a, b));
        // System.out.println("Product of two number: "+multiplyNum(a, b));
        // factorial(a);
        // averageFun(a, b, c);
        // System.out.println("Sum of all Odd number is: "+ oddSum(a));
        // System.out.println("Greater Number Between of them: "+greaterNumber(a, b));
        // System.out.println("Circumfrence of Circle: "+circumFernce(radius));
        // eligibilityTest(a);
        // infinteLoop();
        // countCheck(Input);
        // System.out.println("Greatest Common divisor: "+gcd(a, b));
        fiboSeries(a, b, c);
    }    
}
