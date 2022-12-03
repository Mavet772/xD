public  class  Factura {
    // Variables de instancia
    private  String  numDePieza ; // Numero de la pieza
     cadena  privada descPieza ; // Descripcion de la pieza
    private  int  qtyArticulo ; // Cantidad del articulo
    privado  doble  vlrArticulo ; // Valor del articulo

    // Construcción personalizada
    public  Factura ( String  pNumDePieza , String  pDescPieza , int  pQtyArticulo , double  pVlrArticulo ) {
        // Asignación de los valores de los parámetros a las vars. de inst.
        numDePieza = pNumDePieza ;
        descPieza = pDescPieza ;
        if ( pQtyArticulo >= 0 ) {
            qtyArtículo = pQtyArtículo ;
        }
        if ( pVlrArticulo >= 0.0 ) {
            vlrArticulo = pVlrArticulo ;
        }
    } // Fin del constructor de la clase

    // Método establecido para el número de la pieza
    public  void  establecerNumDePieza ( String  pNumDePieza ) {
        numDePieza = pNumDePieza ;
    }

    // Método para obtener el número de la pieza
    public  String  obtenerNumDePieza () {
        return  numeroDePieza ;
    }

    // Método para establecer la descripción de la pieza
    public  void  establecerDescPieza ( String  pDescPieza ) {
        descPieza = pDescPieza ;
    }

    // Método para obtener la descripción de la pieza
    public  String  obtenerDescPieza () {
        return  descPieza ;
    }

    // Método para establecer la cantidad de artículo
    public  void  establecerQtyArticulo ( int  pQtyArticulo ) {
        qtyArtículo = pQtyArtículo ;
    }

    // Método para obtener la cantidad de artículo
    public  int  obtenerQtyArticulo () {
        return  qtyArticulo ;
    }

    // Método para establecer el valor del artículo
    public  void  establecerVlrArticulo ( double  pVlrArticulo ) {
        vlrArticulo = pVlrArticulo ;
    }

    // Método para obtener el valor del artículo
    public  double  obtenerVlrArticulo () {
        return  vlrArticulo ;
    }

    // Método Obtener Monto Factura
     anular  publico obtenerMontoFactura () {
        // Comprobación de que no hayan cantidades negativas
        if ( obtenerCantidadArticulo () >= 0 ) {
            qtyArtículo = 0 ;
        }

        if ( obtenerVlrArticulo () >= 0.0 ) {
            vlrArtículo = 0.0 ;
        }

        sistema _ fuera _ printf ( "\n ********** FERRETERÍA **********" );
        sistema _ fuera _ printf ( "\n ***** Factura *****\n\n" );
        sistema _ fuera _ printf ( "Número de pieza: %s" , obtenerNumDePieza ());
        sistema _ fuera _ printf ( "\nDescripción de la pieza: %s" , obtenerDescPieza ());
        sistema _ fuera _ printf ( "\nCantidad del articulo: %d" , obtenerQtyArticulo ());
        sistema _ fuera _ printf ( "\nValor unitario del articulo: %f" , obtenerVlrArticulo ());

        // Totalizar el monto de la compra
        sistema _ fuera _ printf ( "\n\nEl total a pagar es: %f" , ( obtenerQtyArticulo () * obtenerVlrArticulo ()));
    } // fin de principal
} /// :~