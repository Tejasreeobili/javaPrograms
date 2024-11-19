import java.util.*;

public class arrays {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int size = sc.nextInt();
        int[] nameInput=new int[size];
        for(int i=0;i<size;i++){
            nameInput[i]= sc.nextInt();

        }
        for (int i=0;i< nameInput.length;i++){
            System.out.print(nameInput[i]+" ");
        }
    }
}