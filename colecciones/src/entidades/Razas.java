package entidades;

public class Razas {

    private String raza;


    public Razas(){
    }

    public Razas(String raza){
        this.raza = raza;
    }

    /* Getters and Setters  Here*/


    @Override
    public String toString() {
        return "Razas{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
