public class Masajista extends Persona {
    private String titulacion;
    private int aniosexperiencia;

    public Masajista() {
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int anoexperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosexperiencia = anoexperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja con su equipo");
    }

    public void darmasaje() {
        System.out.println("El masajista da masajes a los jugadores ");
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }
}
