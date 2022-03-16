import java.util.Scanner;

public class Operacion {

    private double numero1;
    private double numero2;

    /*Punto A*/
    public Operacion(double num1, double num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }


    /*Punto B*/
    public Operacion()
    {

    }

    /*Punto C*/
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    /*Punto D*/
    public void crearOperacion(){
        Scanner numero = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el primer valor: ");
        this.numero1 = numero.nextDouble();

        System.out.println("Por favor ingrese el segundo valor: ");
        this.numero2 = numero.nextDouble();

        //System.out.println("Usted ingreso " + this.numero1 + " y " + this.numero2);
    }

    /*Punto E*/
    public double sumar(double num1, double num2){
        this.numero1 = num1;
        this.numero2 = num2;

        return (this.numero1 + this.numero2);
    }

    /* Punto F */
    public double restar(double num1, double num2){
        this.numero1 = num1;
        this.numero2 = num2;

        if (this.numero1 > this.numero2) {
            return (this.numero1 - this.numero2);
        }else {
            return (this.numero2 - this.numero1);
        }
    }

    /*Punto G*/
    public double multiplicar(double num1,double num2){

        this.numero1 = num1;
        this.numero2 = num2;

        if (this.numero1 == 0 || this.numero2 == 0){
            System.out.println("No se puede llevar a cabo una multiplicacion por 0.");
            return 0;
        }else{
            return this.numero1 * this.numero2;
        }

    }

    /*Punto H*/
    public double dividir(double num1,double num2){
        this.numero1 = num1;
        this.numero2 = num2;

        if (this.numero1 == 0 || this.numero2 == 0){
            System.out.println("No se puede llevar a cabo una division por 0.");
            return 0;
        }else{
            return this.numero1 / this.numero2;
        }
    }

}
