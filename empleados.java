//Clase Empleado
public class Empleado {
   
    private String nif;
    private String nombre;
    private double sueldoBase;
    private int horasExtras;
    private char casado; 
    private int numeroHijos;

    //Constructor por defecto
    public Empleado() {
    }

    //Constructor con dos parámetros
    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    //Métodos set de todos los atributos
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

    //Metodo calcular el importe de las horas extra de los empleados
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }

    //metodos get de todos los atributos
    public char getCasado() {
        return casado;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

     public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroHijos() {
            return numeroHijos;
        }

    public double getSueldoBase() {
        return sueldoBase;
    }

    //metodo toString para devolver informacion de los empleados
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNif: ");
        sb.append(nif);
        sb.append("\nSueldo Base: ");
        sb.append(sueldoBase);
        sb.append("\nHoras Extras: ");
        sb.append(horasExtras);
        sb.append("\nCasado: ");
        sb.append(casado);
        sb.append("\nNúmero de Hijos: ");
        sb.append(numeroHijos);
        return  sb.toString();
    }


}