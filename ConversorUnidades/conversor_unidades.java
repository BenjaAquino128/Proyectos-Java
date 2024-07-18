package ConversorUnidades;

import java.util.Scanner;

public class conversor_unidades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc_general;
        int numero;
        do {
            System.out.println("\t CONVERSOR DE UNIDADES");
            System.out.println("Seleccione una magnitud: ");
            System.out.println("1. Longitud");
            System.out.println("2. Masa/Peso");
            System.out.println("3. Volumen");
            System.out.println("4. Tiempo");
            System.out.println("5. Temperatura");
            System.out.println("6. Salir");

            while (!sc.hasNextInt()) {
                System.out.println("Numero invalido, por favor seleccione otra opcion numerica: ");
                sc.nextLine();
            }
            ;

            opc_general = sc.nextInt();
            while (opc_general < 1 || opc_general > 6) {
                System.out.println("Numero fuera de rango, ingrese nuevamente: ");
                opc_general = sc.nextInt();
            }
            ;

            switch (opc_general) {
                case 1:
                    int opc_long;
                    do {
                        System.out.println("\nLONGITUD");
                        System.out.println("");
                        System.out.println("1.Ingresar un numero: ");
                        System.out.println("2.Salir");

                        while (!sc.hasNextInt()) {
                            System.out.println("Numero invalido, ingrese nuevamente: ");
                            sc.nextLine();
                        }
                        opc_long = sc.nextInt();
                        while (opc_long < 1 || opc_long > 2) {
                            System.out.println("Numero fuera de rango, ingrese nuevamente: ");
                            opc_long = sc.nextInt();
                        }

                        if (opc_long == 1) {
                            System.out.println("\nIngrese aqui: ");
                            numero = sc.nextInt();

                            int km = numero * 1000;
                            int m = numero * 100;
                            int cm = numero * 10;
                            double mm = numero * 0.001;
                            double pulg = numero * 2.54;
                            int pies = numero * 12;
                            int yardas = numero * 3;
                            int millas = numero * 5280;
                            System.out.println("");
                            System.out.println(numero + " kilometros = " + km + " metros");
                            System.out.println(numero + " metros = " + m + " centimetros");
                            System.out.println(numero + " centimetros = " + cm + " milimetros");
                            System.out.println(numero + " milimetros = " + mm + " metros");
                            System.out.println(numero + " pulgadas = " + pulg + " centimetros");
                            System.out.println(numero + " pies = " + pies + " pulgadas");
                            System.out.println(numero + " yardas = " + yardas + " pies");
                            System.out.println(numero + " millas = " + millas + " pies");
                        }
                    } while (opc_long != 2);
                    break;
                case 2:
                    int opc_masa;
                    do {
                        System.out.println("\n MASA/PESO");
                        System.out.println("");
                        System.out.println("1.Ingresar un numero: ");
                        System.out.println("2.Salir");

                        while (!sc.hasNextInt()) {
                            System.out.println("Numero invalido, ingrese nuevamente: ");
                            sc.nextLine();
                        }
                        opc_masa = sc.nextInt();
                        while (opc_masa < 1 || opc_masa > 6) {
                            System.out.println("Numero fuera de rango, ingrese nuevamente: ");
                            opc_masa = sc.nextInt();
                        }
                        ;

                        if (opc_masa == 1) {
                            System.out.println("\nIngrese aqui: ");
                            numero = sc.nextInt();

                            int kg = numero * 1000;
                            int g = numero * 1000;
                            double mg = numero * 0.001;
                            int libras = numero * 16;
                            double onzas = numero * 28.3495;
                            System.out.println("");
                            System.out.println(numero + " kilogramos = " + kg + " gramos");
                            System.out.println(numero + " gramos = " + g + " miligramos");
                            System.out.println(numero + " miligramos = " + mg + " gramos");
                            System.out.println(numero + " libras = " + libras + " onzas");
                            System.out.println(numero + " onzas = " + onzas + " gramos");

                        }
                    } while (opc_masa != 2);
                    break;
                case 3:
                    int opc_vol;
                    do {
                        System.out.println("\n VOLUMEN");
                        System.out.println("");
                        System.out.println("1.Ingresar un numero: ");
                        System.out.println("2.Salir");

                        while (!sc.hasNextInt()) {
                            System.out.println("Numero invalido, ingrese nuevamente: ");
                            sc.nextLine();
                        }
                        opc_vol = sc.nextInt();
                        while (opc_vol < 1 || opc_vol > 5) {
                            System.out.println("Numero fuera de rango, ingrese nuevamente: ");
                            opc_vol = sc.nextInt();
                        }
                        if (opc_vol == 1) {
                            System.out.println("\nIngrese aqui: ");
                            numero = sc.nextInt();

                            int l = numero * 1000; // Litros
                            double ml = numero * 0.001; // Mililitros
                            double pt = numero * 0.473176; // Pintas
                            double gal = numero * 3.78541; // Galones
                            System.out.println("");
                            System.out.println(numero + " litros = " + l + " mililitros");
                            System.out.println(numero + " mililitros = " + ml + " litros");
                            System.out.println(numero + " pintas = " + pt + " litros");
                            System.out.println(numero + " galones = " + gal + " litros");
                        }
                    } while (opc_vol != 2);
                    break;
                case 4:
                    int opc_tiempo;
                    do {
                        System.out.println("\n TIEMPO");
                        System.out.println("");
                        System.out.println("1.Ingresar un numero: ");
                        System.out.println("2.Salir");

                        while (!sc.hasNextInt()) {
                            System.out.println("Numero invalido, ingrese nuevamente: ");
                            sc.nextLine();
                        }
                        opc_tiempo = sc.nextInt();
                        while (opc_tiempo < 1 || opc_tiempo > 2) {
                            System.out.println("Numero fuera de rango, ingrese nuevamente: ");
                            opc_tiempo = sc.nextInt();
                        }

                        if (opc_tiempo == 1) {
                            System.out.println("\nIngrese aqui: ");
                            numero = sc.nextInt();

                            int seg = numero * 1; // Segundos
                            int min = numero * 60; // Minutos
                            int hrs = numero * 60; // Horas
                            int dias = numero * 24; // Dias
                            System.out.println("");
                            System.out.println(seg + " segundos");
                            System.out.println(numero + " minutos = " + min + " segundos");
                            System.out.println(numero + " horas = " + hrs + " minutos");
                            System.out.println(numero + " dias = " + dias + " horas");
                        }
                    } while (opc_tiempo != 2);
                    break;
                case 5:
                    int opc_temp;
                    do {
                        System.out.println("\n TEMPERATURA");
                        System.out.println("");
                        System.out.println("1.Ingresar un numero: ");
                        System.out.println("2.Salir");

                        while (!sc.hasNextInt()) {
                            System.out.println("Numero invalido, ingrese nuevamente: ");
                            sc.nextLine();
                        }
                        opc_temp = sc.nextInt();
                        while (opc_temp < 1 || opc_temp > 2) {
                            System.out.println("Numero fuera de rango, ingrese nuevamente: ");
                            opc_temp = sc.nextInt();
                        }

                        if (opc_temp == 1) {
                            System.out.println("\nIngrese aqui: ");
                            numero = sc.nextInt();
                            // Celsius
                            int cel1 = numero;
                            double cel2 = (numero + 9 / 5) + 32; // Celsius a Fahrenheit
                            double cel3 = numero + 273.15; // Celsius a Kelvin
                            // Fahrenheit
                            double fah1 = numero;
                            double fah2 = (numero - 32) * 5 / 9; // Fahrenheit a Celsius
                            double fah3 = (numero + 459.67) * 5 / 9; // Fahrenheit a Kelvin
                            // Kelvin
                            double kel1 = numero;
                            double kel2 = numero - 273; // Kelvin a Celsius
                            double kel3 = 1.8 * (numero - 273) + 32; // Kelvin a Fahrenheit
                            System.out.println("");
                            System.out.println(cel1 + "°C");
                            System.out.println(cel1 + "°C = " + cel2 + "°F");
                            System.out.println(cel1 + "°C = " + cel3 + "K");
                            System.out.println(fah1 + "°F");
                            System.out.println(fah1 + "°F = " + fah2 + "°C");
                            System.out.println(fah1 + "°F = " + fah3 + "K");
                            System.out.println(kel1 + "K");
                            System.out.println(kel1 + "K = " + kel2 + "°C");
                            System.out.println(kel1 + "K = " + kel3 + "°F");
                        }
                    } while (opc_temp != 2);
                    break;
                default:
                    break;
            }

        } while (opc_general != 6);
        sc.close();
        System.out.println("Hasta luego! :D");
    }
}