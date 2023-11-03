import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un numero par desde 10: ");
        int valorpar = s.nextInt();

        System.out.println(valorpar + 5);

        System.out.println("Introduce un numero impar desde 10: ");
        int valorimpar = s.nextInt();

        System.out.println(valorimpar + 3);

    }
}
