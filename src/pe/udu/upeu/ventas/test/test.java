package pe.udu.upeu.ventas.test;

import pe.udu.upeu.ventas.utils.Conexion;
import pe.udu.upeu.ventas.dao.ProductoDao;
import pe.udu.upeu.ventas.dao.UsuarioDao;
import pe.udu.upeu.ventas.daoImp.ProductoDaoImp;
import pe.udu.upeu.ventas.daoImp.UsuarioDaoImp;
import pe.udu.upeu.ventas.entity.Producto;
import pe.udu.upeu.ventas.entity.Usuario;

public class test {
	
	static ProductoDao productoDao = new ProductoDaoImp();
	static UsuarioDao usuarioDao = new UsuarioDaoImp();

	public static void main(String[] args) {
		
		//System.out.println(login());
		//createuser();
		createProducto();
		
	}
	
	static int login() {
		usuarioDao.validarUsuario("nick", "123");
		return 1;
	}
	
	static void conex() {
		  if(Conexion.getConex()!=null) {
			  System.out.println("Conectado");
		  }else {
			 System.out.println("Desconectado"); 
		  }	  
	  }
	
	static void createuser() {
		  if(usuarioDao.createUser(new Usuario(0,"karina","121"))>=1) {
			  System.out.println("usuario creado...!");
		  }else {
			  System.out.println("Error al crear usuario");
		  }
	  }
	
	static void createProducto() {
		
		int x;
		x = productoDao.createProducto(new Producto("Queso", "kg", 100.00, 5, "1"));
		if (x > 0) {
			System.out.println("Producto Creado");
		}
	}
}
