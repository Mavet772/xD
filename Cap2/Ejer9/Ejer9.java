//Excer. 2.28: Ejer9.java 
// Diámetro, circunferencia y área de un círculo

import java.util.Scanner;

public class Ejer9 
{
    public static void main(String[]args)
    {
      int a;

      Scanner entrada = new Scanner(System.in);

        System.out.print("ingrese la radio de un circulo: ");
        a = entrada.nextInt();
        System.out.println("Diámetro " + (2*a));
        System.out.printf("%s %f %n", "Circunferencia", (2*Math.PI*a));
        System.out.print("Área " + (a*a));
    }
}
