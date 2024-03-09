import java.util.Scanner;

public class dowhile_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();
            sc.close();
             if (n % 10 == 0){
                break;


             }
             System.out.println(n);
             
            
        } while (true);
    }
    
}
