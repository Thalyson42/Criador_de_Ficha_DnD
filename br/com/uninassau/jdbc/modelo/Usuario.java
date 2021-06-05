package br.com.uninassau.jdbc.modelo;

import java.util.ArrayList;

public class Usuario {
	private int idusuario;
	private int idperfil;
	private String login;
	private String senha;
	private String nome;
	private String descricao_usuario;
	private String idade;
	private String email;
	private String telefone;
	private String sexo;
	private ArrayList<FichaDoPersonagem> personagem = new ArrayList<FichaDoPersonagem>();
	
	public void setIDusuario(int id) {
		this.idusuario = id;
	}
	public int getIDusuario() {
		return this.idusuario;
	}
	public void setIDperfil(int idperfil) {
		this.idperfil = idperfil;
	}
	public int getIDperfil() {
		return this.idperfil;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String nome_usuario) {
		this.login = nome_usuario;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenha() {
		return this.senha;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public String getDescricao_usuario() {
		return descricao_usuario;
	}
	public void setDescricao_usuario(String descricao_usuario) {
		this.descricao_usuario = descricao_usuario;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public ArrayList<FichaDoPersonagem> getPersonagem() {
		return personagem;
	}
	public void setPersonagem(FichaDoPersonagem personagem) {
		this.personagem.add(personagem);
	}
}
