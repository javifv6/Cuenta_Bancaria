
public class Cuenta_Test {



    public static void main(String[] args) {
        
        //Creamos un objeto nuevo.
        Cuenta cuenta1 = new Cuenta ("Titular 1");
        Cuenta cuenta2 = new Cuenta ("Titular 2");
        Cuenta cuenta3 = new Cuenta("Titular 3");
        //Ingresamos 100€ en la cuenta.
        cuenta1.setIngreso(100, 1);

        //Mostramos el saldo en la cuenta.
        System.out.println(cuenta1.verSaldo());

        //Retiramos 4€ de la cuenta
        cuenta1.setReintegro(4, 1);

        //Mostramos el saldo en la cuenta.
        System.out.println(cuenta1.verSaldo());

        //Ingresamos 200 en la cuenta 0006
        cuenta2.setIngreso(200, 2);

        //Muestra las cuentas totales del banco
        Cuenta.mostrarTotalCuentas();

        //Muestra el saldo total del banco
        Cuenta.mostrarAcumulador();

        //Muestra información de la cuenta 2.
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());

    }
    
}
