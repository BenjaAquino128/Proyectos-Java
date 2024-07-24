package Adivina_elnumero;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class random_number {
    public static void main(String[] args) {
        int numero_magico = ThreadLocalRandom.current().nextInt(1, 10);
        Scanner sc = new Scanner(System.in);

        int numero_usuario;
        System.out.println("Adivina el numero en el que estoy pensando: ");
        numero_usuario = sc.nextInt();
        int counter_intents = 0;
        do {
            if (numero_usuario < numero_magico) {
                System.out.println(
                        "El numero que ingresaste es menor al numero al que estoy pensando!!, Ingrese otro numero:");
                numero_usuario = sc.nextInt();
            } else {
                System.out.println(
                        "El numero que ingresas es mayor al numero en el que estoy pensando, Ingrese otro numero: ");
                numero_usuario = sc.nextInt();
            }

            if (numero_usuario != numero_magico) {
                counter_intents += 1;
            }
        } while (numero_usuario != numero_magico);

        if (numero_magico == numero_usuario) {
            System.out.println("Correcto!!, el numero en el que estaba pensando era el " + numero_magico);
            System.out.println("Haz acertado en el intento numero: " + counter_intents);
        }
        sc.close();
    }
}