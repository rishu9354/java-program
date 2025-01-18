package Basic;

// import java.util.Scanner;

public class BasicTwo {
public static void main(String[] args) {
    // calculate cgpa using marks of three student 
    // using normal way
    // Scanner scan = new Scanner(System.in);
    // int sub1, sub2, sub3;
    // System.out.println("Enter Subject 1 marks: ");
    // sub1= scan.nextInt();
    // System.out.println("Enter Subject 2 marks: ");
    // sub2= scan.nextInt();
    // System.out.println("Enter Subject 3 marks: ");
    // sub3= scan.nextInt();

    // float cgpa = (sub1 + sub2 + sub3) / 30;
    // System.out.println("CGPA: " + cgpa);

    // using array 

    // float [] one ={62.0f, 42.0f, 59.0f, 45.0f, 48.0f};
    // float [] Two ={50.0f, 60.0f, 40.0f, 46.0f, 52.0f, 80.0f, 84.0f};
    // float [] three ={40.0f, 49.0f, 52.0f, 41.0f, 76.0f, 60.0f, 84.0f};
    // float [] four ={76.0f, 60.0f, 63.0f, 74.0f, 74.0f, 60.0f, 42.0f, 84.0f};
    // float [] five ={60.0f, 51.0f, 54.0f, 47.0f, 46.0f, 54.0f, 46.0f, 46.0f};
    float[] total ={5.12f, 5.88f, 5.74f, 6.66f, 5.05f};




    float sum = 0;
    for(float element : total){
        
        sum = sum + element;
    }
    System.out.println("Sum of 1st Semester: " + sum);
    float cgpa = sum / 50;
    System.out.println("CGPA in First Semester: " + cgpa);
  
 
    
}
    
}