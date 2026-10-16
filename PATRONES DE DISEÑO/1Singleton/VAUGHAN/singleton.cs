using System;
using System.Collections.Generic;
using System.Reflection;

public class Producto
{
    public int Codigo;
    public int Cantidad;

    public Producto (int codigo, int cantidad)
    {
        Codigo = codigo;
        Cantidad = cantidad;
    }


}

public class AlmacenCentral
{
    public List<Producto> Productos = new List<Producto>();

    public AlmacenCentral(){}

    public static AlmacenCentral Instancia => new AlmacenCentral();

    public void RegistrarProducto(Producto producto)
    {
        Productos.Add(producto);
        System.Console.WriteLine($"Registrado: {producto.Codigo}");
    }
    public void VenderProducto(int codigo, int cantidad)
    {
        Producto producto = Productos.Find(p => p.Codigo == codigo);
        if (producto == null)
        {
            System.Console.WriteLine("Producto no encontrado");
        }
    producto.Cantidad -= cantidad;
    System.Console.WriteLine($"venta realizada. Stock: {producto.Cantidad}");
    }
}
