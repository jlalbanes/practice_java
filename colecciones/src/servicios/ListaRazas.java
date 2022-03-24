package servicios;

import entidades.Razas;

import java.util.*;



public class ListaRazas {

   ArrayList <String> lista = new ArrayList <String> ();
   Scanner ingresaDato = new Scanner(System.in).useDelimiter("\n");




    public void nuevaRaza() {

        /*Punto 1*/
        String nombre;

        do {
            System.out.println("Por favor ingrese la raza nueva o 'quit' para salir: ");
            nombre =  ingresaDato.next();


            switch (nombre) {
                case "quit":
                    mostrarLista();
                    listarIterando();

                    System.exit(0);
                default:
                    lista.add(nombre);

            }
        } while (nombre != "quit");

    }

    public void mostrarLista() {

        /* View the list content */
        System.out.println("Lista de razas: " + lista.size());

        Collections.sort(lista);

        for (String nueva : lista) {
            System.out.println(nueva.toString());

        }
    }

    /*Punto 2*/
    public void listarIterando() {
        System.out.println("Por favor ingrese una raza a borrar: ");
        String x = ingresaDato.next(),provisorio;

        Boolean noexiste = false;

        Iterator <String> busqueda = lista.iterator();

        while (busqueda.hasNext()) {

            provisorio = busqueda.next();

            if (provisorio.equals(x)){
                busqueda.remove();
                noexiste = true;
            }
        }

        if (noexiste == false){
            System.out.println("la raza " + x + " no se encuentra en la lista.");
        }

        mostrarLista();

    }
}

