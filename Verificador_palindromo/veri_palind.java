package Verificador_palindromo;
import java.util.Scanner;

class veri_palind {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t VERIFICADOR DE PALINDROMOS");
        System.out.println("Ingrese una cadena a verificar: ");
        String cadena = sc.nextLine();
        System.out.println("\nLa cadena "+ cadena + " es palindrome?: "+ esPalindrome(cadena));
        sc.close();
    }
    public static boolean esPalindrome(String cadena){
        cadena = cadena.toLowerCase().replace("á","a").replace("é","e")
                .replace("í","i").replace("ó","o").replace("ú","u")
                .replace(" ","").replace(".","").replace(",","");
        String invertida = new StringBuilder(cadena).reverse().toString();
        System.out.print(invertida);
        return invertida.equals(cadena);
    }
}