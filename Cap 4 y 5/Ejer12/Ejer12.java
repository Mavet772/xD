import java.util.concurrent.ForkJoinPool;

// Ejer 5.27

public class Ejer12 
{
    public  static  void  main ( String [] args ){
        
        int  a , m , g ;

        for ( a = 1 ; a <= 5 ; a ++){
            for ( m = 1 ; m <= 3 ; m ++){
                for ( g = 1 ; g <= 4 ; g ++)
                System.out.printf( "*" );

                System.out.println(); 
            }

            System.out.println();
        }
    }
    
}
