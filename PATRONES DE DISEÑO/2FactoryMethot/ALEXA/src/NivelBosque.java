public class NivelBosque extends Nivel {
  public NivelBosque() {
    super("bosque de alamo");
  }

  @Override
  public Enemigo crearEnemigo() {
    return new Lobo();
  }
}
