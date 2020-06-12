package pe.udu.upeu.ventas.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pe.udu.upeu.ventas.dao.ProductoDao;
import pe.udu.upeu.ventas.entity.Producto;
import pe.udu.upeu.ventas.utils.Conexion;

public class ProductoDaoImp implements ProductoDao {

	//PreparedStatement prepara la sentencia sql;
	private PreparedStatement ps;
	// ResultSet sirve para almacenar datos de la tabla a "r";
	private ResultSet r;
	//Connection es para conectar a la base de dato;
	private Connection con;
	
	@Override
	public int createProducto(Producto producto) {
		// TODO Auto-generated method stub
		int a = 0;
		try {
			con = Conexion.getConex();
			ps = con.prepareStatement("insert into producto (descripcion, presentacion, precio, stock, codigo) values (?, ?, ?, ?, ?);");
			ps.setString(1, producto.getDescripcion());
			ps.setString(2, producto.getPresentacion());
			ps.setDouble(3, producto.getPrecio());
			ps.setInt(4, producto.getStock());
			ps.setString(5, producto.getCodigo());
			//executeUpdate para ejecutar la sentencia sql una vez los valores esten asignados;
			a = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public int updateProducto(int idproducto, int cantidad) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto buscar(int idproducto) {
		// TODO Auto-generated method stub
		Producto producto = new Producto();
		try {
			con = Conexion.getConex();
			ps = con.prepareStatement("select *from producto where codigo = ?;");
			r = ps.executeQuery();
			while (r.next()) {
				producto.setDescripcion(r.getString("descripcion"));
				producto.setPresentacion(r.getString("presentacion"));
				producto.setPrecio(r.getDouble("precio"));
				producto.setStock(r.getInt("stock"));
				producto.setCodigo(r.getString("codigo"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

}
