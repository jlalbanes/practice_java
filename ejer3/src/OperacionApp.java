public class OperacionApp {
    public static void main(String[] args) {

        Operacion calculo = new Operacion();

        calculo.crearOperacion();

        System.out.println("La suma de los valores ingresados es: " + calculo.sumar(calculo.getNumero1(), calculo.getNumero2()));

        System.out.println("La resta de los valores ingresados es: " + calculo.restar(calculo.getNumero1(),calculo.getNumero2()));

        System.out.println("La multiplciacion de los valores es: " + calculo.multiplicar(calculo.getNumero1(),calculo.getNumero2()));

        System.out.println("La division de los valores es: " + calculo.dividir(calculo.getNumero1(),calculo.getNumero2()));

    }

}
