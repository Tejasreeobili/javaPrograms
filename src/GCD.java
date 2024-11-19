public class GCD {
    public static void main(String[] args) {
        int a=6;
        int b = 36;
        while(b!=0){
            int rem = a%b;
            a=b;
            b=rem;


//            while (b != 0) { int temp = b; b = a % b; a = temp; } return a; }


        }
        System.out.println(a);
    }
}
