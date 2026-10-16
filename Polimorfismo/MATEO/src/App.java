public class App {
    public static void main(String[] args) throws Exception {
        Caja caja = new Caja();

        MetodoPago tarjeta = new Tarjeta("1234567891234");
        MetodoPago paypal = new PayPal("usuario@gmail.com");
        MetodoPago contado = new Contado(true);

        caja.cobrar(paypal, 500);
        caja.cobrar(tarjeta, 1000);
        caja.cobrar(contado, 1500);
    }
}
