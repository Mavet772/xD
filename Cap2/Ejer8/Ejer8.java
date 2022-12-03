//Excer. 2.30: Ejer8.java 
// Separación de los dígitos en un entero

import java.util.Scanner;

public class Ejer8 
{
    public static void main(String[]args)
    {
        int a,b,c,d;

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un numero de 5 cifras: ");
        a = entrada.nextInt();
        if (a>9999)
            if (a<100000)
            

            System.out.printf("%d %d %d %d %d",
            
             a/10000,
      
            (a%10000)/1000,
       
            (a%10000%1000)/100,

            (a%10000%1000%100)/10,

            (a%10000%1000%100%10));

        if (a>99999)
            System.out.print("Este numero tiene mas de 5 cifras!!!");
        if (a<10000)
            System.out.print("Este numero tiene menos de 5 cifras!!");
    }  
}