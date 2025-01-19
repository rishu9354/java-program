import java.util.Scanner;

public class currencyCalculate {

    public static void main(String[] args) {
        float inr, USD, EURO,Yen,Won;

        // convert inr currency to many currency
        // THESE value is equal to 1rs inr 
        USD = 0.012f;
        EURO = 0.011f;
        Yen = 1.81f;
        Won = 16.84f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INR Currency: ");
        inr = sc.nextFloat();
        System.out.println("your inr: "+inr);
        int num=0;
        System.out.println("Which currency would you convert it?");
        System.out.println("1:USD , 2:EURO, 3:Yen, 4:Won");
        num = sc.nextInt();
        if (num == 1) {
            USD = inr * USD;
            System.out.println("USD : "+USD);
        }
        else if (num == 2) {
            EURO = inr * EURO;
            System.out.println("EURO: "+EURO);
        }
        else if(num == 3){
            Yen = inr * Yen;
            System.out.println("Yen: "+Yen);
        }
        else if (num == 4) {
            Won = inr * Won;
            System.out.println("Won: "+Won);
        }
        else{
            System.out.println("Invalid request!");
        }
    }
}