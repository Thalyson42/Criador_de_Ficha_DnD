package br.com.uninassau.jdbc.main;

import java.sql.SQLException;

import br.com.uninassau.jdbc.dao.UsuarioDAO;
import br.com.uninassau.jdbc.modelo.Usuario;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Usuario usuario = new Usuario();
		usuario.setIDusuario(1);
		usuario.setIDperfil(1);
		usuario.setNome("frokoso2");
		usuario.setIdade("19");
		usuario.setSexo("f");
		usuario.setDescricao_usuario("blebleble");
		usuario.setEmail("bleble_bleble@blabla.com");
		usuario.setTelefone("7777-777");
		
//		usuario.setLogin("Froko");
//		usuario.setSenha("123");
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
//		usuarioDAO.salvarPerfil(usuario);
//		usuarioDAO.removerPerfil(usuario);
//		usuarioDAO.alterarPerfil(usuario.getIDusuario(), usuario.getIDperfil(), usuario);
//		produtoDAO.listarProdutos();
	}

}
