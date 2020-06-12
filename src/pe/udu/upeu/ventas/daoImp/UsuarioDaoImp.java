package pe.udu.upeu.ventas.daoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.udu.upeu.ventas.dao.UsuarioDao;
import pe.udu.upeu.ventas.entity.Usuario;
import pe.udu.upeu.ventas.utils.Conexion;

public class UsuarioDaoImp implements UsuarioDao{
	private PreparedStatement ps;
	private ResultSet rs;
	private Connection conex;
	@Override
	public Usuario validarUsuario(String user, String clave) {
		Usuario usuarioEncontrado= new Usuario();
		// TODO Auto-generated method stub
		try {
			conex = Conexion.getConex();
			ps = conex.prepareStatement("SELECT * FROM Usuario where nomuser = ? and clave = ?;");
			ps.setString(1, user);
			ps.setString(2, clave);
			rs = ps.executeQuery();
			while (rs.next()) {
				usuarioEncontrado.setNomuser(rs.getString("nomuser"));
			}
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return usuarioEncontrado;
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		List<Usuario> lista = new ArrayList<>();
		try {
			conex = Conexion.getConex();
			ps = conex.prepareStatement("SELECT * FROM usuario");
			rs = ps.executeQuery();
			while(rs.next()) {
				Usuario user = new Usuario();
				user.setIdusuario(rs.getInt("idusuario"));
				user.setNomuser(rs.getString("nomuser"));
				user.setClave(rs.getString("clave"));
				lista.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return lista;
	}

	@Override
	public int createUser(Usuario u) {
		// TODO Auto-generated method stub
		int x = 0;
		try {
			conex = Conexion.getConex();
			ps = conex.prepareStatement("INSERT	into Usuario (nomuser, clave) VALUES (?,?)");
			System.out.println(u.getNomuser() + " " + u.getClave());
			ps.setString(1, u.getNomuser());
			ps.setString(2, u.getClave());
			x = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getLocalizedMessage() + " " + e.getMessage());
		}
		return x;
	}

}
