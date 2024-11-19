import java.util.*;
public class primeNumbersInRange {
    public static void main(String[] args) {
        int range=10;

        for(int i=2;i<=range;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }


            }
            if(isPrime){
                System.out.println(i);
            }

        }

    }
}
