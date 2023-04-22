import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int a = sc.nextInt();
        sc.nextLine();
        String s2 = sc.next();
        int b = sc.nextInt();
        sc.nextLine();
        String s3 = sc.next();
        int c = sc.nextInt();
        sc.close();
        System.out.printf("================================%n");
        System.out.printf( "%-15s%0,3d %n", s1, a);
        System.out.printf( "%-15s%0,3d %n", s2, b);
        System.out.printf( "%-15s%0,3d %n", s3, c);
        System.out.printf("================================%n");
    }
}
