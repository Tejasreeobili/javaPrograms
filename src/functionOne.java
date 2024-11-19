public class functionOne {
    static String integers(int a) {
        if(a%2==0){
            return "is Even";
        } else {
            return "is Odd";
        }

    }
    public static void main(String[] args) {
     String result =integers(9);
        System.out.println(result);
    }
}
