import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("vvedite chislo");
        float n = scanner.nextFloat();
        System.out.println("vvedite sistemu schisleniya'");
        int i = scanner.nextInt();
        System.out.println(sys(n,i));*/
        ArbitraryBaseNumber arbitraryBaseNumber = new  ArbitraryBaseNumber("5",2);

    }

    public static String sys(float n, int i) {
        String res = "";
        if (i < 10) {
            while (n>i) {
                float ch = n % i;
                res = res.concat(Float.toString(ch));
                n = n / 2;
            }
        }
        if (i == 10) {
            res = Float.toString(n);
        }
        if (n==0){
            res=Float.toString(0);
        }
        return res;
    }

}