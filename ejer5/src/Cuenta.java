public class Cuenta {

    /*Atributos de la clase*/
    public int numeroCuenta;
    public int dniCli;
    public double saldo = 0;

    /*Constructor por defecto*/
    public Cuenta(){
    }

    /*Constructor inicializando con parametros*/
    public Cuenta(int dni, double saldo, int numeroCuenta){
         this.numeroCuenta = numeroCuenta;
         this.dniCli = dni;
         this.saldo = saldo;
    }

    /*Metodos Getters and Setters*/
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCli() {
        return dniCli;
    }

    public void setDniCli(int dniCli) {
        this.dniCli = dniCli;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", dniCli=" + dniCli +
                ", saldo=" + saldo +
                '}';
    }
}
