// Ejer 4.29


import java.util.Scanner;
 
 public class Ejer7
 
{   
    public static void main(String[] args)
    {    
           
        Scanner entrada = new Scanner(System.in);          
              
        String mensaje;

        int c;             
        int num1 = 0;           
        int num2 = 0;           
        int num3 = 0;           
        int num4 = 0;           
        int num5 = 0; 

        System.out.println("\nPor favor introduzca un numero de cinco cifras y le dire si esun palindromo: ");
        c = entrada.nextInt();            
                    
        while ( 9 < c/10000)          
        {            
        System.out.println("\nEl numero tiene que ser de cinco cifras, por favor introduzcalo nuevamente: ");  
        c = entrada.nextInt();            
        }          
                    
        num1 = c / 10000;          
        num2 = (c % 10000)/1000;          
        num3 = ((c % 10000) % 1000) / 100;      
        num4 = (((c % 10000) % 1000) % 100) / 10;    
        num5 = (((c % 10000) % 1000) % 100) % 10;    
                    
        if ( num1 == num5)          
        {           
        if ( num2 == num4)          
                    
                     
        System.out.printf("\nEl numero %d no es palindromo. \n", c);       
                    
        }           
                    
        else              
        System.out.printf("\nEl numero %d no es palindromo. \n", c);
    
    }                
}           

 