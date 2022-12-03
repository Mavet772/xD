// Importar la clase 'Scanner'
importar  Java . útil _ escáner ;

 clase  pública PruebaFactura
{
    // El método main inicia y finaliza la ejecución de la aplicación
    public  static  void  principal ( String  args [])
    {
        // Variables
         cadena de cuerdas ; // Número y descripción de la pieza
        intcantidad  ; _ // Cantidad del articulo
         valor doble ; // Valor del articulo
        
        // Constructor personalizado. Creación de un objeto inicializando sus
        // variables de instancia
        Factura  factura = nueva  Factura ( "0" , "Ninguna" , 0 , 0.0 );
        
        // Mostrar el estado actual de los atributos del objeto 'factura'
        sistema _ fuera _ printf ( "\nNúmero de pieza: %s" , factura . obtenerNumDePieza () );
        sistema _ fuera _ printf ( "\nDescripción de la pieza: %s" , factura . obtenerDescPieza () );
        sistema _ fuera _ printf ( "\nCantidad del articulo: %d" , factura .obtenerQtyArticulo ( ) ) ;
        sistema _ fuera _ printf ( "\nValor unitario del articulo: %f" , factura . obtenerVlrArticulo () );
        
        //Solicitud y obtención de los datos
        // Creación de un objeto de tipo 'Scanner'
        Scanner  entrada = nuevo  Scanner ( System . in );
        
        // numero de pieza
        sistema _ fuera _ print ( "\nEscriba el numero de pieza: " );
        cadena = entrada . siguienteLinea ();
        factura . establecerNumDePieza ( cadena );
        
        //Descripción de la pieza
        sistema _ fuera _ print ( "\nEscriba la descripcion de la pieza: " );
        cadena = entrada . siguienteLinea ();
        factura . establecer DescPieza ( cadena );
        
        // Cantidad del articulo
        sistema _ fuera _ print ( "\nEscribe la cantidad del articulo: " );
        cantidad = entrada . siguienteInt ();
        factura . establecerQtyArticulo ( cantidad );
        
        // Valor del articulo
        sistema _ fuera _ print ( "\nEscriba el valor del artículo:" );
        valor = entrada . siguienteDoble ();
        factura . establecerVlrArticulo ( valor );
        
        // Mostrar el monto de la factura
        factura . obtenerMontoFactura ();
        
        sistema _ fuera _ imprimirln ();
        sistema _ fuera _ imprimirln ();
        
    } // fin de principal
} ///:~