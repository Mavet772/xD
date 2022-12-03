// Ejer 5.24
// Programa para imprimir rombos

import java.util.Scanner;

public class Ejer11
{
    public static void main(String[] args)
    {
        Scanner xD = new Scanner(System.in);
        System.out.print("N: ");
        int b = xD.nextInt();

        for(int d=0; d<=b; d++)
        {
            for(int c=b-d; c>0; c--){
                System.out.print(" ");
            }
            for(int c=0; c<d; c++){
                System.out.print(" *");
            }
            System.out.println("");
        }
            for(int d=0; d<=b; d++)
            {
                for(int c=0; c<=d; c++)
                {
                    System.out.print(" ");
                }
                for(int c=b-d-1; c>0; c--)
                {
                    System.out.print(" *");
                }
                    System.out.println("");
            }
    }   
}
 