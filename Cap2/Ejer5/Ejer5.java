//Excer. 2.24: Ejer5.java 
// Enteros menor y mayor

import java.util.Scanner; 

public class Ejer5
{
    public static void main(String[]args)
    {
        int a,b,c,d,e;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número:");
        a = entrada.nextInt();
        System.out.print("Ingrese el segundo número:");
        b = entrada.nextInt();
        System.out.print("Ingrese el tercer número:");
        c= entrada.nextInt();
        System.out.print("Ingrese el cuarto número:");
        d = entrada.nextInt();
        System.out.print("Ingrese el quinto número:");
        e = entrada.nextInt();

        if (a > b)
         if (a > c)
          if (a > d)
           if (a > e)
            System.out.println("El número mayor es:" + a);

        if (b>a) if (b>c) if (b>d) if (b>e)
            System.out.println("El numero mayor es: " + b);
        if (c>a) if (c>b) if (c>d) if (c>e)
            System.out.println("El numero mayor es: " + c);  
        if (d>a) if (d>b) if (d>c) if (d>e)
            System.out.println("El numero mayor es: " + d);
        if (e>a) if (e>b) if (e>c) if (e>d)
            System.out.println("El numero mayor es: " + e);

        if (a<b) if (a<c) if (a<d) if (a<e)
            System.out.println("El numero menor es: " + a);
        if (b<a) if (b<c) if (b<d) if (b<e)
            System.out.println("El numero menor es: " + b);
        if (c<a) if (c<b) if (c<d) if (c<e)
            System.out.println("El numero menor es: " + c);
        if (d<a) if (d<b) if (d<c) if (d<e)
            System.out.println("El numero menor es: " + d);
        if (e<a) if (e<b) if (e<c) if (e<d)
            System.out.println("El numero menor es: " + e);   
    }
}
