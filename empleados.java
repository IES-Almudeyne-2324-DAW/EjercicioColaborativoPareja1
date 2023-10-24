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

        public void setCasado(char casado) {
        this.casado = casado;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

     public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }

}