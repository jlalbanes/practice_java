package alquilaLibrosApp;

import java.util.Scanner;

public class LibroControl {

    public void cargaLibro(){

        Scanner alta = new Scanner(System.in).useDelimiter("\n");


        System.out.println("Por favor ingrese el ISBN del libro: ");
        int isbn = alta.nextInt();

        System.out.println("Ingrese el Titulo del libro: ");
        String titulo = alta.next();

        System.out.println("Ingrese el Autor del libro: ");
        String autor = alta.next();

        System.out.println("Ingrese el Número de Páginas del Libro: ");
        int numeroPaginas = alta.nextInt();

        Libro alquiler = new Libro(isbn,titulo,autor,numeroPaginas);

        //System.out.println("ISBN: " + alquiler.isbn + '\n' + "Titulo: " + alquiler.titulo + '\n' + "Autor: "+ alquiler.autor + '\n' + "N° Páginas: " + alquiler.numeroPaginas);
        System.out.println(alquiler.toString());
    }


}

