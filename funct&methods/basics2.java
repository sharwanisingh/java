import java.util.Scanner;
public class basics2 {

    public static int sum(int a, int b){  // parameters or formal parameters
       
        int sum = a+b;
        return sum;
        
    
}
public static void main(String[] args) {
    Scanner sc =  new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int s = sum(a,b); // arguments or actual parameter
    System.out.println("sum is :" + s);
}   

    }
    
