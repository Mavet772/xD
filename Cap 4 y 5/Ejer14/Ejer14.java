// Ejer 5.14
// Programa modificado del interés compuesto

public class Ejer14 
{
 
    public static void main(String args[])
    {

        double monto;
        double principal = 1000;

        for(double tasa = 0.05; tasa <= 0.1; tasa += 0.01 )
        {  

            System.out.printf("\n%s%20s", "Anio", "Monto en deposito");
            System.out.printf(" para una tasa igual a: %.2f\n", tasa);

            for( int anio = 1; anio <= 10; anio++ )
            {  
                monto = principal * Math.pow( 1.0 + tasa, anio );
                System.out.printf("%4d%,20.2f\n", anio, monto);
            }  

            System.out.println("\n");
        }  

    }
}
