public class AlmacenCentral : IAlmacen
{

    List<Producto> _productos;
    private readonly Lazy<AlmacenCentral> _instancia =
        new Lazy<AlmacenCentral>(()=> new AlmacenCentral());

        public static AlmacenCentral Instancia => _instancia.Value;

    private AlmacenCentral()
    {
        System.Console.WriteLine("Creando el almacen");
        _productos = new List<Productos>();
    }
    
    public List <Producto> ObtenerProductos()=> _productos;
    public Producto BuscarProducto(int codigo) => _productos.FirstOrDefault(p=> p.Codigo == codigo);
    public bool AgregarProductos(Producto producto)
    {
        if (BuscarProducto(producto.Codigo) == null)
        {
            _productos.Add(producto);
            return true;
        }
        return false;

    }
}