package bb.bbjava.poczatek.FooBar;
// zadanie 6. troche pomoglo mi Udemy, bo tam byl przyklad z silnia na rekurencje ;-)
public class FooBar {

    public static void main(String[] args) {
        //oblicza silnie przez rekurencję
        System.out.println(silnia(6));

        // oblicza silnię w pętli
        System.out.println(siloop(6));
    }

    private static long silnia(long n) {
        if (n == 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }
    private static long siloop(long n) {
        long k = 1;
        for (int i = 1; i <= n; i++) {
            k = k * i;
        }
        return k;
    }
}