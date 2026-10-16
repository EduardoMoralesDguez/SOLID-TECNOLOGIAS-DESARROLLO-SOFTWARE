public class Program
{
    public static void Main()
    {
        IAlmacen almacenGlobal = AlmacenCentral.Instancia;

        Inventario empleadoInventario = new Inventario();
        Venta empleadoVenta = new Venta(almacenGlobal);

        empleadoInventario.RegistrarProducto("Coca", 20, 1, 10);
        empleadoInventario.RegistrarProducto("Azucar", 20, 1, 10);
        empleadoInventario.RegistrarProducto("Bubulubu", 20, 1, 10);
        empleadoInventario.RegistrarProducto("Coca", 20, 1, 10);
    }
}
