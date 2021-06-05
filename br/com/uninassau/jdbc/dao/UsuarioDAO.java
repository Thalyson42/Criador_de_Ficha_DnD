package br.com.uninassau.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.uninassau.jdbc.connection.ConnectionFactory;
import br.com.uninassau.jdbc.modelo.Usuario;

public class UsuarioDAO {
	private Connection conexao;
	
	public UsuarioDAO() throws SQLException {
		this.conexao = ConnectionFactory.createConnection();
	}
	
	public Connection getConexao() {
		return conexao;
	}

	public void salvarUser(Usuario usuario) {
		String sql = "INSERT INTO usuario (login, senha) values (?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getLogin());
			stmt.setString(2, usuario.getSenha());
			stmt.execute();
			stmt.close();
		}catch(SQLException msg) {
			System.err.println("Erro: " + msg);
		}
	}
	
	public Boolean verificarLogin(Usuario usuario) {
		try {
			UsuarioDAO usuariodao = new UsuarioDAO();
			
			PreparedStatement stmt = usuariodao.getConexao().prepareStatement("SELECT * FROM usuario WHERE login='"+usuario.getLogin()+"' AND senha='"+usuario.getSenha()+"'");
			ResultSet res = stmt.executeQuery();
			
			if(res.next()) {
				return true;
			}
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	
	public void salvarPerfil(Usuario perfil) {
		String sql = "INSERT INTO perfil (usuario_idusuario ,idperfil, nome, idade, sexo, descricao, email, telefone) values (?,?,?,?,?,?,?,?)";
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, perfil.getIDusuario());
			stmt.setInt(2, perfil.getIDperfil());
			stmt.setString(3, perfil.getNome());
			stmt.setString(4, perfil.getIdade());
			stmt.setString(5, perfil.getSexo());
			stmt.setString(6, perfil.getDescricao_usuario());
			stmt.setString(7, perfil.getEmail());
			stmt.setString(8, perfil.getTelefone());
			stmt.execute();
			stmt.close();
		}catch(SQLException msg) {
			System.err.println("Erro: " + msg);
		}
	}
	
	public void removerUser(Usuario usuario) {
		String sql = "Delete from usuario WHERE idusuario=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, usuario.getIDusuario());
			stmt.execute();
			stmt.close();
		}catch(SQLException msg) {
			System.err.println("Erro: " + msg);
		}
	}
	
	public void removerPerfil(Usuario idusuario) {
		String sql = "Delete from perfil WHERE usuario_idusuario=?";
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, idusuario.getIDusuario());
			stmt.execute();
			stmt.close();
		}catch(SQLException msg) {
			System.err.println("Erro: " + msg);
		}
	}
	
	public void alterarUserSenha(int idusuario, String usersenha) {
		String sql = "Update usuario SET senha=? WHERE idusuario="+idusuario;
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usersenha);
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException msg) {
			System.err.println("Erro: " + msg);
		}
	}
	
	public void alterarUserLogin(int idusuario, String userlogin) {
		String sql = "Update usuario SET login=? WHERE idusuario="+idusuario;
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, userlogin);
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException msg) {
			System.err.println("Error: "+ msg);
		}
	}
	
	public void alterarPerfil(int idperfil, Usuario usuario) {
		String sql = "UPDATE perfil SET nome=?, idade=?, sexo=?, descricao=?, email=?, telefone=? WHERE idperfil="+idperfil;
		
		PreparedStatement stmt = null;
		
		try {
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getIdade());
			stmt.setString(3, usuario.getSexo());
			stmt.setString(4, usuario.getDescricao_usuario());
			stmt.setString(5, usuario.getEmail());
			stmt.setString(6, usuario.getTelefone());
			stmt.executeUpdate();
			stmt.close();
			} catch (SQLException msg) {
				System.err.println("Error: " + msg);
		}
	}
	
}
