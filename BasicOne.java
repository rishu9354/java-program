package Basic;
// calclute percentage of a given std in cbse borad exam 
// his marks from 5 subject must be taken as input 

import java.util.Scanner;

class BasicOne{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3, sub4, sub5;
        System.out.println("Enter Subject 1 Marks: ");
        sub1 = sc.nextInt();
        System.out.println("Enter Subject 2 Marks: ");
        sub2 = sc.nextInt();
        System.out.println("Enter Subject 3 Marks: ");
        sub3 = sc.nextInt();
        System.out.println("Enter Subject 4 Marks: ");
        sub4 = sc.nextInt();
        System.out.println("Enter Subject 5 Marks: ");
        sub5 = sc.nextInt();
        System.out.println("Enter Subject 6 Marks: ");
        int sub6 = sc.nextInt();
         System.out.println("Enter Subject 7 Marks: ");
        int sub7 = sc.nextInt();

        float percentage  = ((sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7) / 700.0f)*100;
        System.out.println("Percentage : "+ percentage);


    }
}
