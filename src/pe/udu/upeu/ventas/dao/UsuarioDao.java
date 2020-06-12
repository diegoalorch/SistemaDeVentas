package pe.udu.upeu.ventas.dao;

import java.util.List;

import pe.udu.upeu.ventas.entity.Usuario;

public interface UsuarioDao {
	Usuario validarUsuario(String user, String clave);
	List<Usuario> readAll();
	int createUser(Usuario u);
}
