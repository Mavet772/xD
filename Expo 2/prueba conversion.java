importar  Java . útil _ escáner ;
public  class  PruebaConversiones {
    
public  static  void  principal ( String  args [])

{             // Abre principal


 numero int ;
doble  temperatura ;
Scanner  entrada = nuevo  Scanner ( System . in );
Conversiones  miObjeto = new  Conversiones ();

 
sistema _ fuera _ print ( "\nEste programa recibe temperaturas en grados centigrados" );
sistema _ fuera _ println ( "o en grados fahrenheit y la presenta en el otro sistema.\n" );

sistema _ fuera _ println ( "Por favor ingrese la temperatura. " );
temperatura = entrada . siguienteInt ();

hacer
{        // Abre hacer
sistema _ fuera _ print ( "\nLa temperatura esta en grados centigrados (Introducir 1)" );
sistema _ fuera _ println ( " o en grados fahrenheit (Introduzca 0 )? " );
número = entrada . siguienteInt ();
}   while ( 0 != numero && 1 != numero );  //cierra hacer

si ( 0 == número )
{           // Abre si
sistema _ fuera _ printf ( "\nEl equivalente de %.2f grados fahrenheit" , temperatura );
sistema _ fuera _ printf ( "es %.2f grados centigrados. " , miObjeto . Centigrados ( temperatura ));
}           // Cierra si


si ( 1 == número )
{            // Abre si
sistema _ fuera _ printf ( "\nEl equivalente de %.2f grados centigrados " , temperatura );
sistema _ fuera _ printf ( "es %.2f grados fahrenheit. " , miObjeto . Fahrenheit ( temperatura ));
}            // Cierra si

sistema _ fuera _ imprimirln ( "\n" );

}             // Cierra principal
}    