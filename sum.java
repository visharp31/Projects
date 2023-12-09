import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers :");
        int a = sc.nextInt();
        int b =sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum of 2 numbers is : "+sum);
        sc.close();
    }
}