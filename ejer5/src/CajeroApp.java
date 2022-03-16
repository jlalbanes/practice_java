public class CajeroApp {
    public static void main(String[] args) {

        CuentaControl nuevaCuenta = new CuentaControl();
        nuevaCuenta.crearCuenta();

        nuevaCuenta.ingresarSaldo(100);

        nuevaCuenta.retirarDinero(20);

        nuevaCuenta.extraccionRapida();

        nuevaCuenta.consultarSaldo();

        nuevaCuenta.consultarDatos();
    }
}
