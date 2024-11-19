import java.util.Scanner;

public class functionsOne {
    public static double squares(float x ,float n){
        double squareroot=Math.pow(x,n);
        return squareroot;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(squares(x,n));
    }
}
