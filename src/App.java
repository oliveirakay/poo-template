import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int a = 1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

        scanner.close();
    }
}
