import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
            int number = sc.nextInt();
            boolean isPrime = true;
            for ( int i = 2; i<=Math.sqrt(number) ; i++){
                if(number%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("prime ");
            }else {
                System.out.println("not a prime");
            }

    }
}
