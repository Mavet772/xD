importar  Java . útil _ escáner ;

 clase  pública PruebaCuadro

{ // Abre clase Cuadro

    public  static  void  main ( String  args []) { // Abre main
        sistema _ fuera _ print ( "\nEste programa recibe un entero e imprime" );
        sistema _ fuera _ println ( "un cuadrado de asteriscos con ese numero de lado." );

        lado  interior ;
        Scanner  entrada = nuevo  Scanner ( System . in );
        Cuadro  miObjeto = nuevo  Cuadro ();

        sistema _ fuera _ println ( "\nPor favor ingrese un entero:" );
        lado = entrada . siguienteInt ();

        miObjeto . Cuadrado ( lado );

    } // Cierra principal
} // Cierra clase Cuadro