
public class Main {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(1, "Lamine ", "Yamal ", 17, 10, "centrocampista");
        Entrenador entrenador = new Entrenador(2, "Hansi ", "Flick", 59, "Federación Alemana");
        Masajista masajista = new Masajista(3, "Laura", "Lopez", 30, "Fisioterapeuta", 8);

        System.out.println("Futbolista: " + futbolista.getNombre() + " " + futbolista.getApellidos());
        System.out.println("Entrenador: " + entrenador.getNombre() + " " + entrenador.getApellidos());
        System.out.println("Masajista: " + masajista.getNombre() + " " + masajista.getApellidos());


        // Acciones comunes
        futbolista.concentrarse();
        entrenador.viajar();
        masajista.concentrarse();

        // Acciones específicas
        futbolista.jugarpartido();
        entrenador.dirigirentrenamiento();
        masajista.darmasaje();
    }
}