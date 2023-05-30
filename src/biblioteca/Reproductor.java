package biblioteca;

    import javazoom.jlgui.basicplayer.BasicPlayer;
    import java.io.File;

public class Reproductor{
    
    public BasicPlayer player;

    public Reproductor() {
        player = new BasicPlayer();
    }

    /*Reproducir Cancion Seleccionada*/
    public void Play() throws Exception {
        player.play();
    }

    /*Abrir Cancion Elegida*/
    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
    }

    /*Pausar Cancion*/
    public void Pausa() throws Exception {
        player.pause();
    }

    /*Reanudar Reproduccion*/
    public void Continuar() throws Exception {
        player.resume();
    }

    /*Detener Cancion*/
    public void Stop() throws Exception {
        player.stop();
    }
    
}
