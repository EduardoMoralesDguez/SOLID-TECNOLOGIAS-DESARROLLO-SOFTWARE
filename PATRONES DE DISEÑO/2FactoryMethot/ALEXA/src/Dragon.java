public class Dragon extends Enemigo {
  public Dragon() {
    super("Dragon", 1000, 300);
  }

  public void atacar() {
    System.out.println("El dragon ataca: " + this.ataque);
  }
}
