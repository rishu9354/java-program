public class Rescursion1 {

    // print n to 1 number
    public static void printNum(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNum(n-1); 
    }

    // print 1 to n number
    public static void printNum2(int n){
        if (n < 0) {
            return;
        }
        System.out.println(n);
        printNum2(n+1);
    }
    // print factorial
    public static int calFact(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = calFact(n-1);
        int fact_n = n * fact;
        return fact_n;
    }

    // print fibonacci series
    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a +b;
        System.out.println(c);
        printFib(b, c, n-1);
    }

    // print x^n (stack height = n)
    public static int xPowerN(int x, int n){
        if(n ==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int xPowerM1 = xPowerN(x, n-1);
        int xPower = x * xPowerM1;
        return xPower;
    }
    public static void main(String[] args) {
        // printNum(5);
        // printNum2(5);
        // int ans = calFact(1);
        // System.out.println("Factorial: "+ans);

        int a =0,b=1;
        System.out.println("Fibonacci Series:");
        System.out.println(a);
        System.out.println(b);
        int n =10;
        printFib(a, b, n-2);

        int x=2;
        n=5;
        int ans = xPowerN(x, n);
        System.out.println("XPowerN: "+ans);

    }
    
}
