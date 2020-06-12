package pe.udu.upeu.ventas.entity;

public class Venta {
	private int idventa;
	private int factura;
	private String fecha;
	
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(int idventa, int factura, String fecha) {
		super();
		this.idventa = idventa;
		this.factura = factura;
		this.fecha = fecha;
	}

	public int getIdventa() {
		return idventa;
	}

	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}

	public int getFactura() {
		return factura;
	}

	public void setFactura(int factura) {
		this.factura = factura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
}
