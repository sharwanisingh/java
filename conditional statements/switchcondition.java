import java.util.*;

public class switchcondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        sc.close();
        

        switch(button){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("namaste");
            break ;
            case 3 : System.out.println("bounjour");
            break ;
            case 4 : System.out.println("invalid");
        }
    }


    
}
