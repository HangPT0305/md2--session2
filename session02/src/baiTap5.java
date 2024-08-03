import java.util.Scanner;

public class baiTap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("các số nguyên tố nhở hơn 100 là:");
        int n = sc.nextInt();
        for (int i = 2; i < 100; i++) {
            if (isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <=1 ) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                 return false;

            }
        }
        return true;
    }
}
