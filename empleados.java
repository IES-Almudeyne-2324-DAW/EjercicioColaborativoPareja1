/**
 * Clase empleados
 * 
 * @author Tibu Mayo y Alicia Lopez
 */
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

    /**
	   * Constructor con dos parametros
	   * 
	   * @param nif
	   * @param nombre
	   */
    public Empleado(String nif, String nombre) {
        this.nif = nif;
        this.nombre = nombre;
    }

    //Métodos set de todos los atributos

    /**
	   * 
	   * @param casado un caracter S o N
	   */
    public void setCasado(char casado) {
        this.casado = casado;
    }

     /**
	   * 
	   * @param horasExtras
	   */
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    /**
	   * 
	   * @param nif
	   */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
	   * 
	   * @param nombre
	   */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
	   * 
	   * @param numeroHijos
	   */
    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    /**
	   * 
	   * @param sueldoBase
	   */
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
	   * Metodo calcular el importe de las horas extra de los empleados
	   * 
	   * @return horasExtras
	   */
    public double calcularImporteHorasExtras(){
        return horasExtras * pagoPorHoraExtra;
    }

    //metodos get de todos los atributos
    /**
	   * 
	   * @return S o N, si esta casado o no.
	   */
    public char getCasado() {
        return casado;
    }

    /**
	   * 
	   * @return int con las horas extras
	   */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
	   * 
	   * @return String con el dni del empleado
	   */
     public String getNif() {
        return nif;
    }

    /**
	    * 
	    * @return String con el nombre del empleado
	    */
    public String getNombre() {
        return nombre;
    }

    /**
	   * 
	   * @return int con el numero de hijos del empleado
	   */
    public int getNumeroHijos() {
            return numeroHijos;
        }

    /**
	   * 
	   * @return double con el sueldo base del empleado
	   */
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