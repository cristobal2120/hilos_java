
public class Main {
    public static void main(String[] args) {
        actividad2 Musica = new actividad2();
        formulario Datos_cancion = new formulario();

        Musica.Cancion("cancion.wav");
        Musica.start();
        System.out.println("<<<<<<<REPRODUCIENDO CANCION>>>>>> \n");
        Datos_cancion.start();

        try {
            Thread.sleep(70000);
            Musica.AcabarCancion();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}