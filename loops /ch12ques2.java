import java.util.Scanner;

public class ch12ques2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        int choice ;
        int evensum = 0;
        int oddsum = 0;
        
        do {
            System.out.println("enter the integers : ");
            number = sc.nextInt();

            if ( number % 2==0 ) {
                evensum += number;

            } else {
                oddsum += number;

            }
            System.out.println("do you want to continue ? press 1 for yes or 0 for no ");
            choice = sc.nextInt();
            sc.close();
            

        } while ( choice == 1 );
        
        System.out.println("Sum of even nunbers "+ evensum);
        System.out.println("sum of odd numbers"+ oddsum);      
        }
    }   
