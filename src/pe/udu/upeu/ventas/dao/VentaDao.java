package pe.udu.upeu.ventas.dao;

import pe.udu.upeu.ventas.entity.Venta;

public interface VentaDao {
	
	int createVenta(Venta venta);
	Venta buscarVenta(int idventa);
}
