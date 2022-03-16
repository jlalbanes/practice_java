public class CircunferenciaApp {
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        circulo.crearCircunferencia();

        System.out.println("El area de la circunferencia es: " + circulo.area(circulo.getRadio()));
        System.out.println("El perimetro de la circunferencia es: " + circulo.perimetro(circulo.getRadio()));

    }
}
