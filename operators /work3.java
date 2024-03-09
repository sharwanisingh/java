
import java.util.*;
public class work3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        sc.close();
        System.out.print("Multipilaction table for " + number);
        for (int i = 1; i<= 10; i++ ){
            int result = number + i;
            System.out.println(number + "x" + i + "=" + result);
        }

    }
}
