import java.util.Scanner;

public class Test02 {


    static int zero=0;
    static int one=0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        Test02 t = new Test02();
        t.fibonacci(Integer.parseInt(input));
        System.out.println(zero+" "+one);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            zero++;
            return 0;
        } else if (n == 1) {
            one++;
            return 1;
        } else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
}
