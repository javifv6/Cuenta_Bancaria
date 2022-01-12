
/**
 * Crear la clase Cuenta que mantiene la siguiente información por cada cuenta: número de la cuenta, 
 * nombre del titular y saldo. Además existen un tipo de interés que es común a todas las cuentas y que se 
 * mantiene siempre fijo en el 3% y un acumulador del disponible que hay en el banco en cada momento.
 */
public class Cuenta{
    /**
     * Variable de Clase
     * Inicializador estático: Inicializa las variables de clase, si es que las hay.
     */
    private static final int INTERES = 3;
    private static int acumuladordisp = 0;
    private static int totalcuentas = 0;
    /**
     * Variables de instancia
     */
    private int N_cuenta = 0;
    private String Nombre_titular;
    private int Saldo;

    public Cuenta(String nombre_titular) {
        //Contador de la variable de clase total de cuentas
        totalcuentas++;
        //Variables de Instancia 
        this.Nombre_titular = nombre_titular;
        N_cuenta = totalcuentas;

    
    }
    /**
     *Ingreso: Ingresa la cantidad indicada en la cuenta que se especifique.
     */

    /**
     * Método para ingresar la cantidad indicada en la cuenta que se especifique.
     * @param cantidad_ingresar
     * @param cuenta
     * @return
     */
     public int setIngreso (int cantidad_ingresar, int cuenta){
       if (this.N_cuenta == cuenta) {
            acumuladordisp+=cantidad_ingresar;
            return Saldo+=cantidad_ingresar;
                    
       } // si el nº d cuenta es incorrecto lanzamos una excepción
       throw new RuntimeException("Nº de cuenta incorrecto");
     }

    /**Reintegro: Saca la cantidad indicada de la cuenta que se especifique.
     * Método para retirar la cantidad indicada en la cuenta del banco indicada.
     * @param cantidad_sacar
     * @param cuenta 
     * @return Devuelve la cantidad indicada si hay saldo en la cuenta.
     */
    public int setReintegro(int cantidad_retirar, int cuenta){
        //Controlamos que el nº de cuenta sea correcto.
        if (this.N_cuenta == cuenta) {
            //Controlamos que haya saldo en la cuenta.
            if (this.Saldo>cantidad_retirar) {
                acumuladordisp-=cantidad_retirar;
                return Saldo-=cantidad_retirar;
            }
            throw new RuntimeException("No hay saldo suficiente");
       } // si el nº d cuenta es incorrecto lanzamos una excepción
       throw new RuntimeException("Nº de cuenta incorrecto");
     }

     /**
      * ReseteaAcumuladorBanco: Método que pone a 0 el acumulador del banco.  
      */
      public void ReseteaAcumuladorBanco(){
        acumuladordisp = 0;
    }
    
    //Métodos Gettes and Setters
    public int getN_cuenta() {return N_cuenta;}
    public void setN_cuenta(int n_cuenta) {N_cuenta = n_cuenta;}
    public String getNombre_titular() {return Nombre_titular;}
    public void setNombre_titular(String nombre_titular) {Nombre_titular = nombre_titular;}
    public int getSaldo() {return Saldo;}
    public void setSaldo(int saldo) {Saldo = saldo;}

    /**
     * Método para ver el saldo de la cuenta.
     * @return el saldo de la cuenta.
     */
    public int verSaldo(){
        return this.Saldo;
    }
    public static void mostrarTotalCuentas(){
        System.err.println("El total de cuentas es "+totalcuentas);
    }
    public static void mostrarAcumulador(){
        System.err.println("El total disponible en el banco es de:  "+acumuladordisp);
    }

    //Sobreescribimos el toString
    @Override
    public String toString() {
        return "Nº de cuenta: "+ N_cuenta  +
        "\n"+"Nombre del titular: " + Nombre_titular + " Con un saldo de: " + Saldo+" €.";
    }
}
