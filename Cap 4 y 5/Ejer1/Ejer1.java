// Ejer 4.19
/*(Calculadora de comisiones de ventas)
200 por semana, mas el 9% de su venta*/

import java.util.Scanner;

public class Ejer1
{

        public static void main(String[]args) 
         {
                Scanner Entrada = new Scanner (System.in);
                
                String nombre;
                int Art;
                int Sa=200;
                int Rt; 
                double SaEt;

                System.out.println("Nombre del Empleado: ");
                        nombre=Entrada.next();

                do{
                System.out.println("Numero del Articulo Vendido: ");
                Art=Entrada.nextInt();

                if(Art==1)
                {
                SaEt = 239.99*0.09;
                System.out.printf("%s Su pago es: %.2f%n",nombre,Sa+SaEt);
                }
                if(Art==2)
                {
                SaEt = 129.75*0.09;
                System.out.printf("%s Su pago es: %.2f%n",nombre,Sa+SaEt);
                }
                if(Art==3)
                {
                SaEt = 99.95*0.09;
                System.out.printf("%s Su pago es: %.2f%n",nombre,Sa+SaEt);
                }
                if(Art==4)
                {
                SaEt = 350.89*0.09;
                System.out.printf("%s Su pago es: %.2f%n",nombre,Sa+SaEt);
                }


                System.out.printf("Desea ingresar otro articulo 1)SI o 2)NO\n");
                Rt=Entrada.nextInt();

                }
                while(Rt==1);
        }
}