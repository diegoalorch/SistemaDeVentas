package pe.udu.upeu.ventas.entity;

public class Detalle_venta {
	private int iddetalle_venta;
	private int idventa;
	private double importe;
	private int cantidad;
	private int idproducto;
	
	public Detalle_venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Detalle_venta(int iddetalle_venta, int idventa, double importe, int cantidad, int idproducto) {
		super();
		this.iddetalle_venta = iddetalle_venta;
		this.idventa = idventa;
		this.importe = importe;
		this.cantidad = cantidad;
		this.idproducto = idproducto;
	}

	public int getIddetalle_venta() {
		return iddetalle_venta;
	}

	public void setIddetalle_venta(int iddetalle_venta) {
		this.iddetalle_venta = iddetalle_venta;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
}
