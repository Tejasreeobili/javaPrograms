public class fibonacciSeries {
    public static void main(String[] args) {
        int s= 8;
        int n=0;
        int m=1,t;
        System.out.print(n);
        System.out.print(m);
        for(int i=3;i<=s;i++){
            t =n+m;
            System.out.print(t);
            n=m;
            m=t;


        }


    }
}
