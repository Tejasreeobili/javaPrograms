import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int numbers = sc.nextInt();
        for(int i = 1; i<=numbers ; i++){
            if (i % 2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
