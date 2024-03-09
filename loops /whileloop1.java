import java.util.Scanner;

public class whileloop1 {
   public static void main(String[] args) {
    /*int counter = 1;
    //print numbers
    while (counter <= 1000) {
        System.out.print(counter);
        counter ++;
        */
    // print number given by user
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    sc.close();
    int counter = 1;
    while ( counter <= range ) {
        System.out.print(counter + " ");
        counter ++;    
    }
    System.out.println();
    }
   } 
