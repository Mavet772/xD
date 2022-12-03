//Excer. 2.25: Ejer6.java 
// Par o impar

import java.util.Scanner;

public class Ejer6 
{
    public static void main(String[]args)
    {
        int num;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        num = entrada.nextInt();

        if (num%2==0)
        System.out.print("El numero es par");
        if(num%2==1)
        System.out.print("El numero es impar");
    }
}
