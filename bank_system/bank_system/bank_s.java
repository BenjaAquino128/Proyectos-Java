package bank_system;
import java.util.Scanner;

public class bank_s {
    private static String mail_register = null;
    private static String password_register = null;
    private static String mail;
    private static String password;
    public static void main(String[] args) {
        login();
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        int opc; // Declarar la variable opc fuera del bucle do-while para evitar errores

        do {
            System.out.println("");
            System.out.println("\t BIENVENIDO A MI BANCO");
            System.out.println("1. Iniciar Sesion");
            System.out.println("2. Registrarse");
            System.out.println("3. ¿Olvidaste tu contraseña?");
            System.out.println("4. Salir");
            System.out.println("\nSeleccione una opción: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Número inválido, por favor seleccione otra opción: ");
                scanner.nextLine(); // Limpiar la entrada inválida
            }
            opc = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opc) {
                case 1:
                    iniciar_sesion(scanner);
                    break;
                case 2:
                    registrarse(scanner);
                    break;
                case 3:
                    recuperar_password(scanner);
                    break;
                case 4:
                    System.out.println("Hasta luego, vuelva pronto!");
                    break;
                default:
                    System.out.println("Opcion no válida porfavor ingrese nuevamente: ");
                    opc = scanner.nextInt();
                    break;
            }
        } while (opc != 4); // Mover esta línea fuera del switch
        scanner.close(); // Cerrar el scanner al final
    }

    public static void iniciar_sesion(Scanner scanner) {

        if (mail_register == null || password_register == null) 
        {
            System.out.println("No hay usuarios registrados. Por favor, regístrese primero.");
            return;
        };

        do {
            System.out.println("Ingrese su correo electronico: ");
            mail = scanner.nextLine();
            if (mail.trim().isEmpty() || !mail.contains("@")) {
                System.out.println("El correo no puede estar vacio, ingrese nuevamente: ");
                mail = scanner.nextLine();
            } else {
                System.out.println("Ingrese una contraseña: ");
                password = scanner.nextLine();
                if (password.isEmpty()) {
                    System.out.println("La contraseña no puede estar vacía, ingrese nuevamente: ");
                    password = scanner.nextLine();
                }

                if (mail.equals(mail_register) && password.equals(password_register)) {
                    System.out.println("Inicio de sesion exitoso!!, Redirigiendo a su panel principal...");
                    break;
                } else {
                    System.out.println(
                            "Error!!, el correo o la contraseña no son iguales, porfavor ingrese nuevamente: ");
                    System.out.println("Ingrese su correo electronico: ");
                    mail = scanner.nextLine();
                    System.out.println("Ingrese una contraseña: ");
                    password = scanner.nextLine();
                }
            }
        } while (true);
    }

    public static void registrarse(Scanner scanner) {
        String name, lastname;
        do {
            System.out.println("Nombre: ");
            name = scanner.nextLine();
            name.toUpperCase();
            System.out.println("Apellido: ");
            lastname = scanner.nextLine();
            lastname.toLowerCase();

            System.out.println("Correo electronico: ");
            mail_register = scanner.nextLine();

            System.out.println("Contraseña: ");
            password_register = scanner.nextLine();

            if (name.trim().isEmpty()) {
                System.out.println("El Nombre no puede estar vacio, Ingrese nuevamente: ");
                name = scanner.nextLine();
            }

            if (lastname.trim().isEmpty()) {
                System.out.println("El Apellido no puede estar vacio, Ingrese nuevamente: ");
                lastname = scanner.nextLine();
            }
        } while (name.trim().isEmpty() && lastname.trim().isEmpty());
    }

    public static void recuperar_password(Scanner scanner) {
        String new_password;

        System.out.println("Ingrese la nueva contraseña: ");
        new_password = scanner.nextLine();
        password = new_password;

        if (new_password.equals(password)){
            System.out.println("Error!! Ingrese una contraseña que no haya ingresado antes: ");
            new_password = scanner.nextLine();
            return;
        }
    }

    
}