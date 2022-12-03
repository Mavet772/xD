importar  Java . útil _ aleatorio ;
 importar  Java . útil _ escáner ;
public  class  PruebaDados {
    Scanner  entrada = nuevo  Scanner ( System . in );
 Aleatorio  aleatorio = nuevo  Aleatorio ();
  numero int  privado ;
 int  Arreglo [];
 
 //////////////////////////////////////////////
 // Método Recibir
 //////////////////////////////////////////////
 
 public  void  Recibir ()
{   // Abre metodo Recibir
 sistema _ fuera _ print ( "\nPor favor ingrese el numero de veces que se lanzaran" );
 sistema _ fuera _ print ( "los dados\n" );
 número = entrada . siguienteInt ();
 Arreglo = nuevo  int [ numero ];
 Lanzaro ();
}   // cierra el método Recibir


 //////////////////////////////////////////////
 // Método Lanzar
 //////////////////////////////////////////////

  vacío  público Lanzar ()
{   // Abre método Lanzar
 int  numero1 ;
  número2 int ;
 
 for ( int  i = 0 ; i < Arreglo . longitud ; i ++ )
{       // Abre para
 numero1 = 1 + aleatorio . siguienteInt ( 6 );
 numero2 = 1 + aleatorio . siguienteInt ( 6 );
 // System.out.printf("\n%d\t%d\n", numero1, numero2);
 // Descomentar para verificar que las sumas se capturan
 // de manera correcta. Para esto intruducir un numero
 // pequeño
 Arreglo [ i ] = numero1 + numero2 ;
}       // Cierra para

 contar ();
}   // Cierra método Lanzar

 //////////////////////////////////////////////
 // Método Contar
 //////////////////////////////////////////////

  vacío  público Contar ()
{      // Abre método Contar
 int  Contador [] = new  int [ 13 ];
 
 for ( int  j = 0 ; j < Arreglo . longitud ; j ++ )
{   // Abre para
 for ( int  k = 0 ; k < Contador . longitud ; k ++ )
{       // Abre para anidado
 si ( Arreglo [ j ] == k )
 Contador [ k ]++;
}   // Cierra para anidado
}   // Cierra para

 Imprimir ( Contador );

}      // Cierra método Contar

 //////////////////////////////////////////////
 // Método Imprimir
 //////////////////////////////////////////////

 public  void  Imprimir ( int  B [])
{ // Abre método Imprimir
 para ( int  m = 0 ; m < B . longitud ; m ++ )
{        // Abre para
 sistema _ fuera _ printf ( "\n%d lanzamientos sumaron %d\n" , B [ m ], m );
}        // Cierra para
}   // Cierra método Imprimir

}
    