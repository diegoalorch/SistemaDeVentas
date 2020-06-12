package pe.udu.upeu.ventas.dao;

import java.util.List;

import pe.udu.upeu.ventas.entity.Detalle_venta;

public interface Detalle_ventaDao {
	
	int createDetalleVenta(Detalle_venta detalle_venta);
	List<Detalle_venta> listarDV(int idventa);
}
