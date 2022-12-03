public  class  PruebaCuenta {

    /**
     * @param argumenta los argumentos de la línea de comando
     */
    public  static  void  main ( String [] args ) {
        Cuenta  cuenta1 = nueva  Cuenta ( "Jane Green" , 50,00 );
        Cuenta  cuenta2 = nueva  Cuenta ( "John Blue" , - 7.53 );

        // muestra el saldo inicial de cada objeto
        mostrarCuenta ( cuenta1 );
        mostrarCuenta ( cuenta2 );
        
        Scanner  entrada = nuevo  Scanner ( System . in );

        sistema _ fuera _ print ( "Escriba el monto a depositar para cuenta1:" ); // indicador (promt)
        doble  montoDeposito = entrada . siguienteDoble (); // obtiene la entrada del usuario
        sistema _ fuera _ printf ( "%nsumando %.2f al saldo de cuenta1%n%n" ,
        montoDeposito );
        cuenta1 . depositar ( montoDeposito ); // suma al saldo de cuenta1

        // muestra los saldos
        mostrarCuenta ( cuenta1 );
        mostrarCuenta ( cuenta2 );
        
        sistema _ fuera _ print ( "Escriba el monto a depositar para cuenta2:" ); // indicador (promt)
        montoDeposito = entrada . siguienteDoble (); // obtiene la entrada del usuario
        sistema _ fuera _ printf ( "%nsumando %.2f al saldo de cuenta2%n%n" ,
                ositos );
        cuenta2 . depositar ( montoDeposito ); // suma al saldo de cuenta2

        // muestra los saldos
        mostrarCuenta ( cuenta1 );
        mostrarCuenta ( cuenta2 );
        
    } // fin de principal
    public  static  void  mostrarCuenta ( Cuenta  cuenta
         AMostrar ) {
        sistema _ fuera _ printf ( "Saldo de %s: $%.2f%n" , cuentaAMostrar . obtenerNombre (), cuentaAMostrar . obtenerSaldo ());
        cuentaAMostrar . obtener Saldo ();
        ;
        }

} // fin de la clase PruebaCuenta