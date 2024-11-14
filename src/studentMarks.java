import java.util.Scanner;

public class studentMarks {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int num;
        do {
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks > 65 && marks < 90) {
                System.out.println("This is also Good");
            } else if (marks > 0 && marks <= 65) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("enter between 0 to 100");
            }
            System.out.println("want to enter marks then press one if not press zero");

            num = sc.nextInt();

        }while (num == 1) ;


    }
}
