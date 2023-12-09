import java.util.Scanner;

public class Diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers :");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int dif = a-b;
        System.out.println("The difference of 2 numbers is : "+dif);
        sc.close();
    }
}
