
public class Patterns {
    public static void main(String[] args) {
        // square rectangle
        int row = 4;
        int col = 5;
        // outer loop
        System.out.println("Square Rectangle pattern");
        for(int i =1; i<=row; i++){
            // inner loop
            for(int j=1; j<=col; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Hallow Rectangle
        System.out.println("Hallow Rectangle Pattern");
        for(int i = 1;i<=row;i++){
            for(int j =1;j<=col;j++){
                // cell ->(i,j)
                if(i ==1 || j==1 || i == row || j == col){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //  Half Pyramid
        System.out.println("Half Pyramid");
        // row = total col
        for(int i =1;i<=row;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted half pyramid
        System.out.println("Inverted Half Pyramid");
        // you can copy code from half pyramid and set decrement operation
        for(int i = row; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // inverted half pyramid 180 deg 
        System.out.println("Inverted Half Pyramid 180 deg");
        for(int i =1; i<=row; i++){
            // inner loop for space 
            for(int j = 1; j<=row-i;j++){
                System.out.print(" ");
            }
            // inner loop for star
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Triangle 
         System.out.println("Triangle shape");
        for(int i =1; i<=row; i++){
            // inner loop for space 
            for(int j = 1; j<=row-i;j++){
                System.out.print(" ");
            }
            // inner loop for star
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // half pyramid with number
        System.out.println("Half Pyramid with Number");
        for(int i=1; i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // inverted half pyramid with number
         System.out.println("Inverted Half Pyramid with Number");
        for(int i=row; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Floyd's Triangle 
        System.out.println("Floyd's Triangle");
        int num=1;
        for(int i=1; i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }

        
    }
}
