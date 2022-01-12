package BLOQUE_II_COMENZANDO_A_TRABAJAR_CON_POO_Programacion_Orientada_a_Objetos.Practica_5.src.paquete53;

public class Cuenta_Test {


    public static void main(String[] args) {
        
        //Creamos un objeto nuevo.
        Cuenta cuenta1 = new Cuenta (0001,"Titular1",0);
        Cuenta cuenta2 = new Cuenta (0006,"Titular2",0);
        //Ingresamos 100€ en la cuenta.
        cuenta1.setIngreso(100, 0001);

        //Mostramos el saldo en la cuenta.
        System.out.println(cuenta1.verSaldo());

        //Retiramos 4€ de la cuenta
        cuenta1.setReintegro(4, 0001);

        //Mostramos el saldo en la cuenta.
        System.out.println(cuenta1.verSaldo());

        //Ingresamos 200 en la cuenta 0006
        cuenta2.setIngreso(200, 0006);

        //Muestra las cuentas totales del banco
        Cuenta.mostrarTotalCuentas();

        //Muestra el saldo total del banco
        Cuenta.mostrarAcumulador();

        //Muestra información de la cuenta 2.
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

    }
    
}
