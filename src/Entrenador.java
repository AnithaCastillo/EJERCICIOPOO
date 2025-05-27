public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entranador se concentra");
    }

    public void viajar() {
        System.out.println("El entrenador viaja con su equipo");
    }

    public void dirigirpartido() {
        System.out.println("El entrenador dirige a los futbolistas en los partidos");
    }
    public void dirigirentrenamiento() {
        System.out.println("El entrenador dirige los entrenamientos");
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
}