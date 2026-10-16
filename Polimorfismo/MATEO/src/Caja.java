public class Caja {
    public void cobrar (MetodoPago metodo, double monto) {
        if (metodo.validar()) {
        } else {
            System.out.println("Los datos del pago no son validos");
        }
    }
}
