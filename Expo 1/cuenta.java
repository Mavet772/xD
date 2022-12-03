cuenta de clase  pública {

    cadena  privada nombre ; // variable de instancia
   privado  doble  saldo ; // variable de instancia

   // Constructor de Cuenta que recibe dos parámetros
   public  Cuenta ( String  nombre , doble  saldo ) {
       esto _ nombre = nombre ; // asigna nombre a la variable de instancia nombre

       if ( saldo > 0.0 ) // si el saldo es valido
       {
           esto _ saldo = saldo ; // lo asigna a la variable de instancia de saldo

           }}

   public  void  depositar ( double  montoDeposito ) {
       if ( montoDeposito > 0.0 ) // si el montoDeposito es valido
       {
           saldo = saldo + montoDeposito ; // lo suma al saldo

           }}

   public  double  obtenerSaldo () {
       devolver  saldo ;
   }

   public  void  establecerNombre ( String  nombre ) {
       esto _ nombre = nombre ;
   }

   public  String  obtener Nombre () {
       volver  nombre ;
   }
} // fin de la clase Cuenta