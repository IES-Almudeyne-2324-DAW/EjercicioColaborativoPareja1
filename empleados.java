public class Empleado {
   
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private char casado; 
    private int numeroHijos;

    
    public Empleado() {
    }

    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

}