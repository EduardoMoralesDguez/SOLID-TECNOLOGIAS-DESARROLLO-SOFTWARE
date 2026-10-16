public class NivelVolcan extends Nivel {
  public NivelVolcan() {
    super("Volcan");
  }

  @Override
  public Enemigo crearEnemigo() {
    return new Dragon();
  }
}
