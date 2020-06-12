package pe.udu.upeu.ventas.entity;

public class Producto {
	private int idproducto;
	private String descripcion;
	private String presentacion;
	private double precio;
	private int stock;
	private String codigo;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(String descripcion, String presentacion, double precio, int stock, String codigo) {
		super();
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.precio = precio;
		this.stock = stock;
		this.codigo = codigo;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
