public class NivelCastillo extends Nivel {
  public NivelCastillo() {
    super("Castillo");
  }

  @Override
  public Enemigo crearEnemigo() {
    return new Esqueleto();
  }
}
