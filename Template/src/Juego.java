
public abstract class Juego {

    public void iniciarJuego(){
        System.out.println("Preparando oponentes para el juegpo");
        iniciandoPartida();
        jugando();
        finalizandoPartida();
    }
    protected abstract void iniciandoPartida();
    protected abstract void jugando();
    protected abstract void finalizandoPartida();
}