public interface IAlmacen
{
    List<Producto> ObtenerProductos();
    Producto BuscarProducto(int codigo);
    void AgregarProducto(Producto producto);
    

}