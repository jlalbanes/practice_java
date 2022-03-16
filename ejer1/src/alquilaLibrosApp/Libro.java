package alquilaLibrosApp;

public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    /* Constructor vacio */
    public Libro(){
    }

    /* Constructor con parametros iniicalizados */
    public Libro(int isbn,String titulo,String autor,int numeroPaginas){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn=" + isbn +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}
