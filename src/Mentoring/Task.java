package Mentoring;

public class Task {
    public static void main(String[] args) {
        printPrimeBeetween(1, 50);
        System.out.println(addPrimrBeetween(1, 10));


    }
    //Bir program yaz iki sayı gir iki sayı arasındaki asal sayıları bul 1 2 3 5 7 11 13 19 23 29 gibi

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void printPrimeBeetween(int start, int end) {
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static int addPrimrBeetween(int start, int end) {
        int result = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(i)) {
                result += i;
            }

        }
        return result;
    }
}
