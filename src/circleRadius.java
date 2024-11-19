import java.util.Scanner;

public class circleRadius {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the radius :");
        int radius=sc.nextInt();
        double pi= 3.14;
        System.out.println("the area is "+pi*radius*radius);
    }
}
