import java.util.Scanner;

public class arrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] integers= new int[size];
         for(int i=0;i<integers.length;i++){
             integers[i]=sc.nextInt();

         }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i = 0 ;i<integers.length;i++){
            if(integers[i]>max){
                max=integers[i];
            }
            if(integers[i]<min){
                min=integers[i];
            }
        }
        System.out.println("min value"+min);
        System.out.println("max value"+max);





    }
        }

