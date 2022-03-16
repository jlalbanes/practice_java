public class rectangulosApp {

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();

        miRectangulo.crearRectangulo();

        System.out.println("La superficie del rectangulo es: " + miRectangulo.superficie(miRectangulo.getBase(),miRectangulo.getAltura()));
        System.out.println("El perimetro del rectangulo es: " + miRectangulo.perimetro(miRectangulo.getBase(),miRectangulo.getAltura()));

        miRectangulo.dibujarRectangulo(miRectangulo.getBase(), miRectangulo.getAltura());{

        }
    }

}
