package BasicGrammar;
import java.util.Scanner;

public class caculator {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("aaa");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       char c= scanner.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b==0) {
                    System.out.println("aaaaaa");
                } else {
                    System.out.println(a/b);
                }
                break;
        
            default:
                break;
        }
        scanner.close();
    }
}
