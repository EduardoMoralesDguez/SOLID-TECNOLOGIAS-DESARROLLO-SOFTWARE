public class Program
{
    public static void Main()
    {
        AlmacenCentral.Instancia.RegistrarProducto(new Producto(676, 10));
        AlmacenCentral.Instancia.VenderProducto(676, 3);

        System.Console.WriteLine(ReferenceEquals(AlmacenCentral.Instancia, AlmacenCentral.Instancia));
    }
}