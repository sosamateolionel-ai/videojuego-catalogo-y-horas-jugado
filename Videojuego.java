public class Videojuego {

    private String nombre;
    private String genero;
    private double horasJugadas;

    public Videojuego(String nombre, String genero, double horasJugadas) {

        if (horasJugadas < 0) {
            throw new IllegalArgumentException(
                    "Las horas jugadas no pueden ser negativas"
            );
        }

        this.nombre = nombre;
        this.genero = genero;
        this.horasJugadas = horasJugadas;
    }

    public void registrarSesion(double horas) {

        if (horas <= 0) {
            throw new IllegalArgumentException(
                    "Las horas de la sesión deben ser mayores que cero"
            );
        }

        horasJugadas += horas;
    }

    public boolean esJuegoProlongado() {
        return horasJugadas > 50;
    }

    public void mostrarDatos() {
        System.out.println("Videojuego: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Horas jugadas: " + horasJugadas);

        if (esJuegoProlongado()) {
            System.out.println("¿Es un juego prolongado?: Sí");
        } else {
            System.out.println("¿Es un juego prolongado?: No");
        }

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego(
                "Minecraft",
                "Supervivencia",
                20
        );

        Videojuego juego2 = new Videojuego(
                "FIFA 25",
                "Deportes",
                40
        );

        juego1.registrarSesion(35);
        juego2.registrarSesion(15);

        juego1.mostrarDatos();
        juego2.mostrarDatos();
    }
}