import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce una calificación: ");
        double calif = s.nextInt();

        System.out.println("Introduce otra calificación: ");
        double calif2 = s.nextInt();

        System.out.println("La media es:" + calif % calif2);

        if ((calif + calif2) <= 1) {
            System.out.println("Aprobados: ");

        } else {
            if ((calif + calif2) >= 1) {
                System.out.println("Suspensos");

            }
        }
    }}
