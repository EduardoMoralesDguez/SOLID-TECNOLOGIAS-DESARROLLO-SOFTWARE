public abstract class Nivel {
  protected String nombre;

  public Nivel(String nombre) {
    this.nombre = nombre;
  }

  public abstract Enemigo crearEnemigo();

  public void jugar() {
    Enemigo enemigo = crearEnemigo();
    int vidaJugador = 250;
    int danoJugador = 60;
    int turno = 1;

    System.out.println("\n ===" + nombre + " === \n");
    System.out.println("Aparece un enemigo" + enemigo.getNombre() + "con " + enemigo.getVida());

    while (enemigo.estaVivo() && vidaJugador > 0) {
      System.out.println("\n turno: " + turno);
      enemigo.recibirDano(danoJugador);
      System.out.println("Haz atacado a: " + enemigo.getNombre() + " le quedan: " + enemigo.getVida());

      if (enemigo.estaVivo()) {
        enemigo.atacar();
        vidaJugador -= enemigo.getAtaque();
        System.out.println("te han atacado te queda: " + vidaJugador + " puntos de vida");
      }
      turno++;
    }
    if (vidaJugador > 0) {
      System.out.println("Ganaste");
    } else {
      System.out.println("Perdiste " + enemigo.getNombre() + " te mato");
    }

  }
}
