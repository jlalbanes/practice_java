package servicios;



import entidades.Alumno;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class AlumnoExperto {


    Scanner datos = new Scanner(System.in).useDelimiter("\n");
    Scanner cont = new Scanner(System.in).useDelimiter("\n");

    String nombre,apellido,ejecuta;

    double nota1,nota2,nota3;

    ArrayList<Alumno> nuevoAlumno = new ArrayList<Alumno>();

    public void altaAlumno() {
        do {
            System.out.println("Desea dar de alta a un alumno? S: para continuar, N: para salir, B: para buscar y calcular promedio ");
            ejecuta = cont.next().toUpperCase();

            switch (ejecuta) {
                case "N" -> {
                    for (Alumno a : nuevoAlumno ) {
                        System.out.println(a.toString());
                    }

                    System.exit(0);
                }

                case "S" -> {
                    ArrayList<Double> nota = new ArrayList<>();
                    System.out.println("Ingrese el nombre del alumno para su alta: ");
                    nombre = datos.next();
                    System.out.println("Ingrese el apellido del alumno: ");
                    apellido = datos.next();
                    System.out.println("Ingrese la nota 1: ");
                    nota.add(datos.nextDouble());
                    System.out.println("Ingrese la nota 2: ");
                    nota.add(datos.nextDouble());
                    System.out.println("Ingrese la nota 3: ");
                    nota.add(datos.nextDouble());

                    Alumno alumno = new Alumno(nombre, apellido, nota);
                    nuevoAlumno.add(alumno);
                }

                case "B" -> {
                    System.out.println("Por favor ingrese el nombre del alumno a promediar: ");
                    nombre = datos.next();
                    System.out.println("Por favor ingrese el apellido del alumno a promediar: ");
                    apellido = datos.next();
                    if (nuevoAlumno.size() != 0){
                        Double promedio = notaFinal(nombre, apellido);
                        System.out.println("El promedio de notas para " + nombre + " " + apellido +
                         " es: " + promedio);
                    } else{
                        System.out.println("La lista esta vacia, primero debe cargar los alumnos con sus notas.");
                    }
                }


            }
        } while (ejecuta != "N");
    }

    public double notaFinal(String nombre, String apellido) {

        double notas = 0,promedio = 0;

        for (Alumno a : nuevoAlumno) {

            if (a.getNombre().equals(nombre) && a.getApellido().equals(apellido)) {

                for(Double not : a.getNotas()){
                   notas += not;
                }
                promedio = notas / a.getNotas().size();
            }
        }

        return promedio;
    }
}


