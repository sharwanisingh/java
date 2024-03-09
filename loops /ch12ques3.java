import java.util.*;
public class ch12ques3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Enter any positive integer: ");
        num = sc.nextInt();
        

        sc.close();
        for (int i =1; i <=num; i++){
            fact *= i; 

        }
    System.out.println("Factorial: " + fact);
}
}