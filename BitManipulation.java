import java.util.Scanner;
public class BitManipulation {

    // getBit method
    public static void getBit(int n, int pos){
        int bitMask = 1<<pos;
        if((bitMask & n)==0){
            System.out.println("Bit was Zero");
        } else{
            System.out.println("Bit was One");
        }
    }

    // setBit methods
    public static void setBit(int n, int pos){
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber +" decimal number");
    }

    // clearBit method
    public static void clearBit(int n , int pos){
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }

    // updateBit
    public static void updateBit(int n, int pos){
        Scanner sc =new Scanner(System.in);
        int bitMask = 1<<pos;
        System.out.println("Select the Operation: \n 0-> for clear \n 1-> for set ");
        int op = sc.nextInt();
        if(op ==1){
            setBit(n, pos);
        }
        else{
             clearBit(n, pos);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which operation would you perform: \n 1-> GetBit \n 2-> SetBit \n 3-> ClearBit \n 4-> UpdateBit");
        int op = sc.nextInt();
        int n=5 , pos;
        System.out.println("Enter poistion: ");
        pos = sc.nextInt();

        if (op == 1) {
            getBit(n, pos);
        }
        else if (op == 2) {
            setBit(n, pos);
        }
        else if(op == 3){
            clearBit(n, pos);
        }
        else{
            updateBit(n, pos);
        }
    }
}
