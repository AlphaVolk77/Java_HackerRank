import java.util.Scanner;

public class JavaStdInandStdOutII
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
        sc.close();
    }
}
