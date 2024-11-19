import java.util.Scanner;

public class arthmaticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number :");
        int b = sc.nextInt();
        System.out.println("enter the operator" );
        System.out.println(
                "1:(Addition)" +
                "2:(Subtraction)" +
                "3:(Multiplication)" +
                "4:(Division)" +
                "• 5:(Modulo or remainder)" );
        int operation =sc.nextInt();
        switch (operation){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            case 5:
                System.out.println(a%b);
                break;
        }
    }
}
