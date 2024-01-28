import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int temp = 0;
        boolean pico = false;
        boolean vale = false;
        boolean test = true;

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            if (i == 0) {
                temp = b;
            } else if (i == 1 && b > temp) {
                temp = b;
                pico = true;
                vale = false;
            } else if (i == 1 && b < temp) {
                temp = b;
                pico = false;
                vale = true;
            } else if (b < temp && pico == true) {
                pico = false;
                vale = true;
                temp = b;
            } else if (b > temp && vale == true) {
                pico = true;
                vale = false;
                temp = b;
            } else {
                test = false;
            }
        }

        sc.close();

        if (test == true)
            System.out.println(1);
        else
            System.out.println(0);

    }
}
