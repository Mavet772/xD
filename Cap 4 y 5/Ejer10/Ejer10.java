// Ejer 5.20
// Clacular el valor de PI

 import java.util.Random;

public class Ejer10 
{
    public static void main(String args[])
    {  
 
        Random aleatorios = new Random();
 
        int Tam = 10;
        int Esc = 10;
        
        int Num;

        for ( int i = 1; i <= Tam; i++)
        {   
            Num =  1 + aleatorios.nextInt(Esc);
            
            System.out.printf("%3d", Num);

            System.out.print( (0 == i % 5)? "\n":"" );
        
        }
  
    }  
    
}
