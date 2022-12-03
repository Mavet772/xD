//Excer. 2.16: Ejer.java
//Comparación de enteros

import java.util.Scanner;

public class Ejer4 
{
    public static void main(String[] args)
    {
      Scanner entrada = new Scanner(System.in);
      
      int num1, num2;
      

      System.out.print("Escriba el primer número:");
      num1 = entrada.nextInt();

      System.out.print("Escriba el segundo número:");
      num2 = entrada.nextInt();

      if (num1 == num2);{
        System.out.print("Estos números son iguales");
      }
      if (num1 > num2);{
        System.out.print(num1 + "Es mas grande");
      }
      if (num1 < num2);{
        System.out.print(num2 + "Es mas grande");
      }
    }

}
