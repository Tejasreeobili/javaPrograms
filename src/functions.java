import java.util.Scanner;

public class functions {
    public static int averageNum(int a,int b,int c){
    int average = (a+b+c)/3;
        return average;

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println(averageNum(a,b,c));
    }
}