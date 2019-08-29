package bb.bbjava.poczatek.FooBar;

public class FooBar {


    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0 && i % 5 == 0) {
                System.out.println(" FooBar");
            }
            else if (i % 2 == 0) {
                System.out.println(" Foo");
            }

            else if (i % 5 == 0) {
                System.out.println(" Bar");
            }
            if (i%3 == 0) {
                System.out.println(" Cep");
            }
        }

    }
}
