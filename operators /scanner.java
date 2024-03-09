import java.util.*;
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // next for one token means one word
        String name = sc.nextLine();
        sc.close();
        // nextline for full sentence
        System.out.println(name);
        // nextInt for intergers
        // nextfloat() for floating number decimal
    }
    
}
