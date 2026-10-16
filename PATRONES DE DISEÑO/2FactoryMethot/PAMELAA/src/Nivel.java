public class Nivel {
  private int tipoNivel;

  public Nivel(int tipoNivel) {
    this.tipoNivel = tipoNivel;
  }

  public void Jugar() {
    String nombre = "";
    Enemigo enemigo = null;
    if (tipoNivel == 1) {
      nombre = "BosquedeAlamo";
      enemigo = new Lobo();
    } else if (tipoNivel == 2) {
      nombre = "Castillo Embrujado";
      enemigo = new Esqueleto();
    } else if (tipoNivel == 3) {
      nombre = "Volcan";
      enemigo = new Dragon();
    } else {
      return;
    }
    System.out.println("\n === " + nombre + " ===");
    int vidaJugador = 1500;
    while (enemigo.estaVivo() && vidaJugador > 0) {
      enemigo.recibirDano(200);
      if (enemigo.estaVivo()) {
        enemigo.atacar();
        vidaJugador -= enemigo.getAtaque();
      }
    }
    if (vidaJugador > 0) {
      System.out.println("you win");
    } else {
      System.out.println("Perdiste");
      ;
    }
  }
}