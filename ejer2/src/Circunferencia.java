import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia(){

    }

    /*Punto A*/
    public Circunferencia(double rad){
        this.radio = rad;
    }

    /*Punto B*/
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /*Punto C*/
    public void crearCircunferencia(){
        Scanner r = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el radio de la circunferencia: ");
        this.radio = r.nextDouble();

        System.out.println("Usted creo una circunferencia con radio: " + this.getRadio());
    }

    /*Punto D*/
    public double area(double radio){
        return 3.14 * Math.pow(radio, 2);
    }

    /*Punto E*/
    public double perimetro(double radio){
        return 2 * 3.14 * radio;
    }

}
