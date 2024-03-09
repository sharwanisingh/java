import java.util.Scanner;

public class ch12ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");

        int n = sc.nextInt();
        sc.close();
        
        for( int i=1; i<=10; i++){
            System.out.println(n + " * " + i + "=" + n*i);
        }
        

    }
    
}
