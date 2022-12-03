/* validar sus entradas. 
Para cualquier Entrda, si el valor introducido es distinto de 1 o 2, debe seguir iterando 
hasta que el usuario introduzca un valor correcto.*/

import java.util.Scanner;

public class Ejer5
{


    public static void main(String[] args)
    {
        Scanner Entrada=new Scanner(System.in);

        int Rta, Cont=1;

        while(Cont<=10)
        {
            System.out.print("Ingrese un número distinto de 1 y 2 para seguir repitiendo el mensaje: ");
            Rta=Entrada.nextInt();

            if(Rta>=3)
            {
                System.out.println("Hola, Bienvenido a java");
            }

            if(Rta==1 || Rta==2)
            {
                System.out.println("Programa Terminado");
                break;
            }

        }
    }
}