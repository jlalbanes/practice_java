import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo(){
    }

    public Rectangulo(double base,double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo(){
        Scanner num = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese la base del rectangulo: ");
        this.base = num.nextDouble();

        System.out.println("Por favor ingrese la altura del rectangulo: ");
        this.altura = num.nextDouble();
    }

    public double superficie(double base, double altura){
        return (base * altura);
    }

    public double perimetro(double base, double altura){
        return (base + altura) * 2;
    }

    public void dibujarRectangulo(double base, double altura){
        System.out.println("Dibujo del Rectangulo:" + "\n");
            for(int al=0; al < altura;al++) {
                for (int ba=0; ba < base; ba++) {
                    if(ba == 0 || ba == base-1 || al == 0 || al == altura-1) {
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
    }
}
