/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num == 1) {
            System.out.println(num + " is not a perfect number");
            return;
        }
        String per = num + " is a perfect number since " + num + " = 1";
        int sum = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                per = per + " + " + i;
            }
        }
        if (num != sum) {
            per = num + " is not a perfect number";
        }
        System.out.println(per);
    }
}
