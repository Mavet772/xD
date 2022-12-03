//Excer. 2.15: Ejer2.java
//Aritmética

import java.util.Scanner; 

public class Ejer2 
{
   
   public static void main(String[] args)
   {
      
      Scanner input = new Scanner(System.in);

      int num1; 
      int num2; 
      int sum;
      int res;
      int mult;
      int div; 

      System.out.print("Ingrese el primer número: "); 
      num1 = input.nextInt(); 

      System.out.print("Ingrese el segundo número: "); 
      num2 = input.nextInt(); 

      sum = num1 + num2; 
      res = num1 - num2;
      mult = num1 * num2;
      div = num1 / num2;

      System.out.printf("La suma es %d%n", sum); 
      System.out.printf("La resta es %d%n", res); 
      System.out.printf("La multiplicación es %d%n", mult); 
      System.out.printf("La división es %d%n", div); 
   } 
} 
