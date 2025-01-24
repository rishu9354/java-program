public class AdvancePatterns {
    public static void main(String[] args) {
        // Butterfly pattern
        int n = 4;
        System.out.println("Butterfly Pattern");
        // upper half
        for(int i = 1;i<=n;i++){
            // first part
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for(int k = 1; k<=spaces; k++){
                System.out.print(" ");
            }
            // second part
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
         for(int i = n;i>=1;i--){
            // first part
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces = 2 * (n - i);
            for(int k = 1; k<=spaces; k++){
                System.out.print(" ");
            }
            // second part
            for(int l = 1; l<=i; l++){
                System.out.print("*");
            }
            System.out.println();
        }


        // solid rhomnus
        System.out.println("Solid Rhombus");
        n=5;
        for(int i = n; i>=1;i--){
            // spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            // star
            for(int k = 1; k<=5;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Palindrome Patterns
        System.out.println("Palindrome Patterns");
        for(int i = 1;i<=n;i++){
            // spaces
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            // first half
            for(int k= i;k>=1;k--){
                System.out.print(k);
            }

            // second half
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }

        // number pyramid
        System.out.println("Number Pyramid");
        for(int i =1; i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // number print
            for(int k=1; k<=i;k++){
                System.out.print(i +" ");
            }
            System.out.println();
        }

        // diamand pattern
        // now the value is changed
        System.out.println("Diamond Pattern"); 
        n=4;
        // upper half
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // starrs
            for(int k= 1; k<=2*i-1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int i=n;i>=1;i--){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // starrs
            for(int k= 1; k<=2*i-1 ;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
