package pe.udu.upeu.ventas.dao;

import pe.udu.upeu.ventas.entity.Producto;

public interface ProductoDao {
	int createProducto(Producto producto);
	int updateProducto(int idproducto, int cantidad);
	Producto buscar(int codigo);
	
}
