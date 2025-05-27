public class Futbolista extends Persona{
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
    }

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futboloista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja con su eqipo");
    }

    public void jugarpartido() {
        System.out.println("El futbolista juega partidos");
    }

    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
}
