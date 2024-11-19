import java.util.Scanner;

public class patternOne {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        for (int i=0; i<columns;i++){
            for(int j=0; j<rows; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}
