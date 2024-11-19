import java.util.Scanner;

public class patternTwo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int columns = sc.nextInt();
        int rows = sc.nextInt();
        for (int i=0; i<columns;i++){
            for(int j=0; j<rows; j++) {
                if (i == 0 || j == rows-1 ||j==0 || i==columns-1) {
                    System.out.print("*" );
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
