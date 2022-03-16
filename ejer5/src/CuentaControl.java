import java.util.Scanner;

public class CuentaControl {

    Cuenta altaCuenta = new Cuenta();

    /*Metodo para crear una Cuenta pidiendo los datos iniciales*/
    public void crearCuenta(){

        Scanner datosCuenta = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor ingrese el DNI del Cliente: ");
        altaCuenta.dniCli = datosCuenta.nextInt();

        System.out.println("Por favor ingrese N° de cuenta a asignar: ");
        altaCuenta.numeroCuenta = datosCuenta.nextInt();

        /*System.out.println("Asignar monto: ");
        altaCuenta.saldo = datosCuenta.nextDouble();*/

    }

    /*Metodo para sumar saldo ingresado*/
    public void ingresarSaldo(double ingreso){
        altaCuenta.saldo += ingreso;
    }

    /*Metodo para retirar dinero*/
    public void retirarDinero(double retiro){
        if(retiro > altaCuenta.saldo){
            //altaCuenta.saldo = 0;
            System.out.println("No hay saldo suficiente para hacer el retiro.");
        }else{
            altaCuenta.saldo -= retiro;
        }
    }

    /* Metodo extraccion Rapida solo 20% del saldo*/
    public void extraccionRapida(){
        Scanner montoExtraccion = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Por favor ingrese el monto a retirar (Saldo Actual: " + altaCuenta.saldo + "): ");
        double monto = montoExtraccion.nextDouble();

        if (monto > (altaCuenta.saldo * 0.2)){
            System.out.println("No es posible extraer más del 20% de su saldo. Su saldo actual es: " + altaCuenta.saldo);
        }else {
            altaCuenta.saldo -= monto;
            System.out.println("Su saldo actual es: " + altaCuenta.saldo + " Su retiro fue de $: " + monto);
        }
    }

    /*Metodo para consultar el saldo actual*/
    public double consultarSaldo(){
        return altaCuenta.saldo;
    }

    /*Metodo para consultar todos los datos de la cuenta*/
    public void consultarDatos(){
        System.out.println(altaCuenta.toString());
    }
}
