import java.util.Scanner;

public class dowhile_conti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter the number");
            int n = sc.nextInt();
            sc.close();
            if (n %10 == 0){
                continue;
            }
            System.out.println("number was " + n);
          } while(true);
    }
    
}
